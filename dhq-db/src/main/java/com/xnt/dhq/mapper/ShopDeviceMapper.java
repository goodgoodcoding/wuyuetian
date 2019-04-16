package com.xnt.dhq.mapper;

import com.xnt.dhq.model.ShopDevice;
import com.xnt.dhq.model.ShopDeviceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShopDeviceMapper {
    int countByExample(ShopDeviceExample example);

    int deleteByExample(ShopDeviceExample example);

    int deleteByPrimaryKey(Integer shopDeviceId);

    int insert(ShopDevice record);

    int insertSelective(ShopDevice record);

    List<ShopDevice> selectByExample(ShopDeviceExample example);

    ShopDevice selectByPrimaryKey(Integer shopDeviceId);

    int updateByExampleSelective(@Param("record") ShopDevice record, @Param("example") ShopDeviceExample example);

    int updateByExample(@Param("record") ShopDevice record, @Param("example") ShopDeviceExample example);

    int updateByPrimaryKeySelective(ShopDevice record);

    int updateByPrimaryKey(ShopDevice record);

    List<ShopDevice> SearchByShopID(@Param("shopDevice_shopID") Integer shopDevice_shopID);

    List<ShopDevice> selectAllShopDevice();

}