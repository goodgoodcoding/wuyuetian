package com.xnt.dhq.service;

import com.xnt.dhq.model.ShopCourse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface ShopCourseService {
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    int create(ShopCourse shopCourse);
    int updateShopCourse(int shopId,int courseId, ShopCourse shopCourse);
}
