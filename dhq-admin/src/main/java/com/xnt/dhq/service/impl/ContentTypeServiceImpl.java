package com.xnt.dhq.service.impl;

import com.github.pagehelper.PageHelper;
import com.xnt.dhq.mapper.ContentTypeMapper;
import com.xnt.dhq.model.ContentType;
import com.xnt.dhq.model.ContentTypeExample;
import com.xnt.dhq.service.ContentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * ContentTypeService实现类
 * Created by Jialin on 2019/4/4.
 */
@Service
public class ContentTypeServiceImpl implements ContentTypeService {

    @Autowired
    private ContentTypeMapper contentTypeMapper;

    @Override
    public int create(ContentType contentType) {
        return contentTypeMapper.insert(contentType);
    }

    @Override
    public int update(Long id, ContentType contentType) {
        contentType.setId(id);
        return contentTypeMapper.updateByPrimaryKey(contentType);
    }

    @Override
    public int delete(List<Long> ids) {
        ContentTypeExample example = new ContentTypeExample();
        example.createCriteria().andIdIn(ids);
        return contentTypeMapper.deleteByExample(example);
    }

    @Override
    public List<ContentType> list() {
        return contentTypeMapper.selectByExample(new ContentTypeExample());
    }

    @Override
    public List<ContentType> listContentType(String firstCategoryName, String  secondCategoryName, String thirdCategoryName, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        ContentTypeExample contentTypeExample = new ContentTypeExample();
        contentTypeExample.setOrderByClause("id desc");
        ContentTypeExample.Criteria criteria = contentTypeExample.createCriteria();
        if (!StringUtils.isEmpty(firstCategoryName)) {
            criteria.andFirstCategoryLike("%" + firstCategoryName + "%");
        }

        if (!StringUtils.isEmpty(secondCategoryName)) {
            criteria.andSecondCategoryLike("%" +secondCategoryName + "%");
        }

        if (!StringUtils.isEmpty(thirdCategoryName)) {
            criteria.andThirdCategoryLike("%" + thirdCategoryName + "%");
        }

        return contentTypeMapper.selectByExample(contentTypeExample);
    }
}
