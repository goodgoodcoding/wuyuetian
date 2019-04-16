package com.xnt.dhq.dao;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseDaoTest {
    @Autowired
    private CourseDao courseDao;

    public void testids(){
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(5);
        System.out.println(courseDao.countByCourseTypeIds(ids));
    }

}