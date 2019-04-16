package com.xnt.dhq;

import com.xnt.dhq.mapper.DhqDeviceMapper;
import com.xnt.dhq.mapper.DhqDeviceTypeMapper;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DhqDbApplicationTests {
//
    @Autowired
    DhqDeviceTypeMapper dhqDeviceTypeMapper;

    @Test
    public void testCategory() {
//        System.out.println(dhqDeviceTypeMapper.SearchTypeIDByThreeCategory("aaa",
//                "bbb","ccc"));
    }

}
