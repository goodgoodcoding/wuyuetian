package com.xnt.dhq.service;

import com.xnt.dhq.dto.ScaleParam;
import com.xnt.dhq.model.Scale;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ScaleService {
    //增加量表
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    int createScale(ScaleParam scaleParam);

    //分页展示所有量表
    List<Scale> listAllscale(Integer pageNum, Integer pageSize);

    //根据id更新量表
    int updatescale(ScaleParam scaleParam);

    //删除量表
    int deletescale(int scaleid);

    //批量删除量表
    int deletescale(List<Integer> ids);

}
