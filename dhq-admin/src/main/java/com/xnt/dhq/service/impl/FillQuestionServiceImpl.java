package com.xnt.dhq.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.xnt.dhq.dto.FillQuestionParam;
import com.xnt.dhq.mapper.FillQuestionMapper;
import com.xnt.dhq.model.FillQuestion;
import com.xnt.dhq.model.FillQuestionExample;
import com.xnt.dhq.service.FillQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FillQuestionServiceImpl  implements FillQuestionService {

    @Resource
    private FillQuestionMapper fillQuestionMapper;

    public int createFill(FillQuestionParam fillQuestionParam){
        FillQuestion fillQuestion=fillQuestionParam;
        fillQuestionMapper.insert(fillQuestion);
        return 1;
    }

    @Override
    public List<FillQuestion> listAllfill(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return fillQuestionMapper.selectByExample(new FillQuestionExample());
    }


    @Override
    public List<FillQuestion> listfill(FillQuestionParam fillQuestionParam, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        FillQuestionExample fillQuestionExample=new FillQuestionExample();
        FillQuestionExample.Criteria criteria=fillQuestionExample.createCriteria();
        if(fillQuestionParam.getFillId()!=null){
            criteria.andFillIdEqualTo(fillQuestionParam.getFillId());
        }
        if(fillQuestionParam.getGrade()!=null){
            criteria.andGradeEqualTo(fillQuestionParam.getGrade());
        }
        if(!StringUtils.isEmpty(fillQuestionParam.getDifficultyLevel())){
            criteria.andDifficultyLevelLike("%"+fillQuestionParam.getDifficultyLevel()+"%");
        }
        if(!StringUtils.isEmpty(fillQuestionParam.getSubject())){
            criteria.andSubjectEqualTo("%"+fillQuestionParam.getSubject()+"%");
        }
        if(!StringUtils.isEmpty(fillQuestionParam.getKnowledgePoint())){
            criteria.andKnowledgePointEqualTo("%"+fillQuestionParam.getKnowledgePoint()+"%");
        }
        return fillQuestionMapper.selectByExample(fillQuestionExample);
    }
    @Override
    public int updatefill(FillQuestionParam fillQuestionParam){
        FillQuestion fillQuestion=fillQuestionParam;
        return fillQuestionMapper.updateByPrimaryKeySelective(fillQuestion);
    }

    public int deletefill(int fillid){
        return fillQuestionMapper.deleteByPrimaryKey(fillid);
    }


    @Override
    public int deletefill(List<Integer> fillids){
        FillQuestionExample example=new FillQuestionExample();
        example.createCriteria().andFillIdIn(fillids);
        return  fillQuestionMapper.deleteByExample(example);
    }

}
