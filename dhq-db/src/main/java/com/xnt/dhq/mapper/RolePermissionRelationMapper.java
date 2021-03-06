package com.xnt.dhq.mapper;

import com.xnt.dhq.model.RolePermissionRelation;
import com.xnt.dhq.model.RolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionRelationMapper {
    int countByExample(RolePermissionRelationExample example);

    int deleteByExample(RolePermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RolePermissionRelation record);

    int insertSelective(RolePermissionRelation record);

    List<RolePermissionRelation> selectByExample(RolePermissionRelationExample example);

    RolePermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RolePermissionRelation record, @Param("example") RolePermissionRelationExample example);

    int updateByExample(@Param("record") RolePermissionRelation record, @Param("example") RolePermissionRelationExample example);

    int updateByPrimaryKeySelective(RolePermissionRelation record);

    int updateByPrimaryKey(RolePermissionRelation record);
}