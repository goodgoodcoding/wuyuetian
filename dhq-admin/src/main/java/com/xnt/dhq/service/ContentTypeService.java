package com.xnt.dhq.service;

import com.xnt.dhq.model.ContentType;

import java.util.List;

/**
 * 后台内容类型管理
 * Created by Jialin on 2019/4/3.
 */
public interface ContentTypeService {

    /**
     * 添加内容类型
     */
    int create(ContentType contentType);

    /**
     * 修改内容类型
     */
    int update(Long id,ContentType contentType);

    /**
     * 批量删除内容类型
     */
    int delete(List<Long> ids);

    /**
     * 获取所有内容类型
     */
    List<ContentType> list();

    /**
     * 分页展示内容类型（可以根据内容类型名称查询）
     */
    List<ContentType> listContentType(String firstCategoryName, String  secondCategoryName, String thirdCategoryName, int pageNum, int pageSize);

}
