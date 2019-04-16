package com.xnt.dhq.service.impl;

import com.github.pagehelper.PageHelper;
import com.xnt.dhq.dto.ScaleParam;
import com.xnt.dhq.mapper.ScaleMapper;
import com.xnt.dhq.model.Scale;
import com.xnt.dhq.model.ScaleExample;
import com.xnt.dhq.service.ScaleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ScaleServiceImpl implements ScaleService {
    @Resource
    private ScaleMapper scaleMapper;

    @Override
    public int createScale(ScaleParam scaleParam){
        Scale scale=scaleParam;
        return scaleMapper.insert(scale);
    }

    @Override
    public List<Scale> listAllscale(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return scaleMapper.selectByExample(new ScaleExample());
    }

    @Override
    public int updatescale(ScaleParam scaleParam){
        Scale scale=scaleParam;
        return scaleMapper.updateByPrimaryKeySelective(scale);
    }

    @Override
    public int deletescale(int scaleid){
        return scaleMapper.deleteByPrimaryKey(scaleid);
    }

    @Override
    public int deletescale(List<Integer> ids){
        ScaleExample example=new ScaleExample();
        example.createCriteria().andScaleIdIn(ids);
        return scaleMapper.deleteByExample(example);
    }
}
