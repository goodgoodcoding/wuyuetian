package com.xnt.dhq.mapper;

import com.xnt.dhq.model.DhqUser;
import com.xnt.dhq.model.DhqUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DhqUserMapper {
    int countByExample(DhqUserExample example);

    int deleteByExample(DhqUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DhqUser record);

    int insertSelective(DhqUser record);

    List<DhqUser> selectByExample(DhqUserExample example);

    DhqUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DhqUser record, @Param("example") DhqUserExample example);

    int updateByExample(@Param("record") DhqUser record, @Param("example") DhqUserExample example);

    int updateByPrimaryKeySelective(DhqUser record);

    int updateByPrimaryKey(DhqUser record);
}