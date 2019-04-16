package com.xnt.dhq.service;

import com.xnt.dhq.model.Content;

import java.util.List;

/**
 * 后台内容管理
 * Created by Jialin on 2019/4/4.
 */
public interface ContentService {

    /**
     * 添加内容
     */
    int create(Content content);

    /**
     * 修改内容
     */
    int update(Long id,Content content);

    /**
     * 批量删除内容
     */
    int delete(List<Long> ids);

    /**
     * 获取所有内容
     */
    List<Content> list();

    /**
     * 分页展示内容（可以根据内容描述模糊查询）
     */
    List<Content> listContent(String description, int pageNum, int pageSize);


}
