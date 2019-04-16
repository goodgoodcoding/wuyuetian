package com.xnt.dhq.service;

import com.xnt.dhq.dto.ShopInfoParam;
import com.xnt.dhq.model.ShopInfo;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ShopInfoService {
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    int create(ShopInfoParam shopInfoParam);

    int deleteByID(Integer shopId);

    List<ShopInfo> list(String obj0, String object1, String obj2, String obj3,Integer pageSize,Integer pageNum);

    int deleteByExamples(List<Integer> ids);

    Integer getShopIDByShopName(String shop_name);

    List<ShopInfo> selectAll(Integer pageSize,Integer pageNum);

    ShopInfo selectByID(Integer id);

    /**
     * 更新商品
     */
    @Transactional
    int update(int  id, ShopInfoParam shopInfoParam);

}
