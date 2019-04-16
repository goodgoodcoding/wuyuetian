package com.xnt.dhq.service.impl;

import com.github.pagehelper.PageHelper;
import com.xnt.dhq.dto.ShopInfoParam;
import com.xnt.dhq.mapper.ShopInfoMapper;
import com.xnt.dhq.model.ShopInfo;
import com.xnt.dhq.model.ShopInfoExample;
import com.xnt.dhq.service.ShopInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShopInfoServiceImpl implements ShopInfoService {

    @Autowired
    private ShopInfoMapper shopInfoMapper;

    @Override
    public int create(ShopInfoParam shopInfoParam) {
        ShopInfo shopInfo = shopInfoParam;
        int count = shopInfoMapper.insert(shopInfo);
        return count;
    }

    @Override
    public int deleteByID(Integer shopId) {
        int count = shopInfoMapper.deleteByPrimaryKey(shopId);
        return count;
    }

    @Override
    public int deleteByExamples(List<Integer> ids) {
        ShopInfoExample shopInfoExample = new ShopInfoExample();
        shopInfoExample.createCriteria().andShopIdIn(ids);
        return shopInfoMapper.deleteByExample(shopInfoExample);
    }

    @Override
    public Integer getShopIDByShopName(String shop_name) {
        Integer shop_id = shopInfoMapper.SearchShopIDByShopName(shop_name);
        return shop_id;
    }

    @Override
    public List<ShopInfo> list(String shopName,String province,String city,String district,Integer pageSize,Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        ShopInfoExample shopInfoExample = new ShopInfoExample();
        ShopInfoExample.Criteria criteria = shopInfoExample.or();
//        shopInfoExample.or().andShopNameLike("%"+shopName+"%")
//                .andShopLocationProvinceLike("%"+province+"%")
//                .andShopLocationCityLike("%"+city+"%")
//                .andShopLocationDistrictLike("%"+district+"%");
        if(shopName != null){
            criteria.andShopNameLike("%"+shopName+"%");
        }
        if (province != null){
            criteria.andShopLocationProvinceLike("%"+province+"%");
        }
        if (city != null){
            criteria.andShopLocationCityLike("%"+city+"%");
        }
        if (district != null){
            criteria.andShopLocationDistrictLike("%"+district+"%");
        }
        return shopInfoMapper.selectByExample(shopInfoExample);
    }


    @Override
    public List<ShopInfo> selectAll(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return shopInfoMapper.selectAll();
    }

    @Override
    public ShopInfo selectByID(Integer id) {
        ShopInfo shopInfo = shopInfoMapper.selectByPrimaryKey(id);
//        List<ShopInfo> shopInfoList = new ArrayList<>();
//        shopInfoList.add(shopInfo);
        return shopInfo;
    }


    @Override
    public int update(int id,ShopInfoParam shopInfoParam){
        //更新商品信息
        int count;
        ShopInfo shopInfo = shopInfoParam;
        shopInfo.setShopId(id);
        return shopInfoMapper.updateByPrimaryKey(shopInfo);
    }
}
