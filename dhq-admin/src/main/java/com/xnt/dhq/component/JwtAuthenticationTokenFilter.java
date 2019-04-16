package com.xnt.dhq.component;

import com.xnt.dhq.util.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;
//import sun.plugin.liveconnect.SecurityContextHelper;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by qingliu on 2019-03-23.
 * JWT(Json Web Token)登录授权过滤器
 * Spring boot 的 web 层的权限控制使用 filter chain 来实现
 * 具体参考：https://spring.io/guides/topicals/spring-security-architecture
 *
 * 该类继承自 OncePerRequestFilter（每次请求触发一次 Filter） 其实现了Servlet 的 Filter 接口，
 * 用来自定义 Filter 实现对请求的过滤和处理
 *
 */
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    private static final Logger LOG = LoggerFactory.getLogger(JwtAuthenticationTokenFilter.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String autherHeader = httpServletRequest.getHeader(this.tokenHeader);
        /*
        *  Authorization 字段，如果 authorization type 是 Bearer 则执行 filter 逻辑
        */
        if (autherHeader != null && autherHeader.startsWith(this.tokenHead)){
            String authToken = autherHeader.substring(this.tokenHead.length());
            // 从 token 获取用户名
            String username = jwtTokenUtil.getUserNameFromToken(authToken);
            LOG.info("checking username:{}",username);
            //该用户没有认证信息则进行认证
            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null){
                UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
                if (jwtTokenUtil.validateToken(authToken,userDetails)){
                    UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
                    authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
                    LOG.info("authenticated user:{}",username);
                    SecurityContextHolder.getContext().setAuthentication(authenticationToken);
                }
            }
        }

        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }
}
