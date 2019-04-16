package com.xnt.dhq.service.impl;

import com.github.pagehelper.PageHelper;
import com.xnt.dhq.mapper.ContentMapper;
import com.xnt.dhq.model.Content;
import com.xnt.dhq.model.ContentExample;
import com.xnt.dhq.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * ContentService实现类
 * Created by Jialin on 2019/4/4.
 */
@Service
public class ContentServiceImpl implements ContentService {


    @Autowired
    private ContentMapper contentMapper;

    @Override
    public int create(Content content) {
        return contentMapper.insert(content);
    }

    @Override
    public int update(Long id, Content content) {
        content.setId(id);
        return contentMapper.updateByPrimaryKey(content);
    }

    @Override
    public int delete(List<Long> ids) {
        ContentExample example = new ContentExample();
        example.createCriteria().andIdIn(ids);
        return contentMapper.deleteByExample(example);
    }

    @Override
    public List<Content> list() {
        return contentMapper.selectByExample(new ContentExample());
    }

    @Override
    public List<Content> listContent(String description, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        ContentExample contentExample = new ContentExample();
        contentExample.setOrderByClause("id desc");
        ContentExample.Criteria criteria = contentExample.createCriteria();
        if (!StringUtils.isEmpty(description)) {
            criteria.andDescriptionLike("%" + description + "%");
        }

        return contentMapper.selectByExample(contentExample);
    }
}
