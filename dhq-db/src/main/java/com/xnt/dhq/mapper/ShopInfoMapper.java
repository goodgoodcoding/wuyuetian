package com.xnt.dhq.mapper;

import com.xnt.dhq.model.ShopInfo;
import com.xnt.dhq.model.ShopInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface ShopInfoMapper {
    int countByExample(ShopInfoExample example);

    int deleteByExample(ShopInfoExample example);

    int deleteByPrimaryKey(Integer shopId);

    List<ShopInfo> selectAll();

    int insert(ShopInfo record);

    int insertSelective(ShopInfo record);

    List<ShopInfo> selectByExample(ShopInfoExample example);

    ShopInfo selectByPrimaryKey(Integer shopId);

    int updateByExampleSelective(@Param("record") ShopInfo record, @Param("example") ShopInfoExample example);

    int updateByExample(@Param("record") ShopInfo record, @Param("example") ShopInfoExample example);

    int updateByPrimaryKeySelective(ShopInfo record);

    int updateByPrimaryKey(ShopInfo record);

    Integer SearchShopIDByShopName(@Param("shop_name") String shop_name);

    String getShopNameByShopID(@Param("shop_id") Integer shop_id);
}