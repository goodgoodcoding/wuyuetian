package com.xnt.dhq.service.impl;

import com.xnt.dhq.mapper.ShopCourseMapper;
import com.xnt.dhq.model.ShopCourse;
import com.xnt.dhq.service.ShopCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopCourseImpl implements ShopCourseService {
    @Autowired
    private ShopCourseMapper shopCourseMapper;

    @Override
    public int create(ShopCourse shopCourse) {
        if(shopCourseMapper.insert(shopCourse) > 0){
            return 1;
        }
        return 0;
    }

    @Override
    public int updateShopCourse(int shopId,int courseId, ShopCourse shopCourse) {
        shopCourse.setShopId(shopId);
        shopCourse.setCourseId(courseId);
        return shopCourseMapper.updateByPrimaryKeySelective(shopCourse);
    }
}
