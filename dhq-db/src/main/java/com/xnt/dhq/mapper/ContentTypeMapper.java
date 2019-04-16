package com.xnt.dhq.mapper;

import com.xnt.dhq.model.ContentType;
import com.xnt.dhq.model.ContentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentTypeMapper {
    int countByExample(ContentTypeExample example);

    int deleteByExample(ContentTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContentType record);

    int insertSelective(ContentType record);

    List<ContentType> selectByExample(ContentTypeExample example);

    ContentType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContentType record, @Param("example") ContentTypeExample example);

    int updateByExample(@Param("record") ContentType record, @Param("example") ContentTypeExample example);

    int updateByPrimaryKeySelective(ContentType record);

    int updateByPrimaryKey(ContentType record);
}