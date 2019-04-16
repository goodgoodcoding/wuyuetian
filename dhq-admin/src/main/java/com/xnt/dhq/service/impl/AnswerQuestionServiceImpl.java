package com.xnt.dhq.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.xnt.dhq.dto.AnswerQuestionParam;
import com.xnt.dhq.mapper.AnswerQuestionMapper;
import com.xnt.dhq.model.AnswerQuestion;
import com.xnt.dhq.model.AnswerQuestionExample;
import com.xnt.dhq.service.AnswerQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AnswerQuestionServiceImpl implements AnswerQuestionService {
    @Resource
    private AnswerQuestionMapper answerQuestionMapper;
    
    public int createAnswer(AnswerQuestionParam answerQuestionParam) {
        AnswerQuestion answerQuestion=answerQuestionParam;
        answerQuestionMapper.insert(answerQuestion);
        return 1;
    }
    @Override
    public List<AnswerQuestion> listAllanswer(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return answerQuestionMapper.selectByExample(new AnswerQuestionExample());
    }

    @Override
    public List<AnswerQuestion> listanswer(AnswerQuestionParam answerQuestionParam, Integer pageSize, Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        AnswerQuestionExample answerQuestionExample=new AnswerQuestionExample();
        AnswerQuestionExample.Criteria criteria=answerQuestionExample.createCriteria();
        if(answerQuestionParam.getAnswerId()!=null){
            criteria.andAnswerIdEqualTo(answerQuestionParam.getAnswerId());
        }
        if(answerQuestionParam.getGrade()!=null){
            criteria.andGradeEqualTo(answerQuestionParam.getGrade());
        }
        if(!StringUtils.isEmpty(answerQuestionParam.getDifficultyLevel())){
            criteria.andDifficultyLevelLike("%"+answerQuestionParam.getDifficultyLevel()+"%");
        }
        if(!StringUtils.isEmpty(answerQuestionParam.getSubject())){
            criteria.andSubjectEqualTo("%"+answerQuestionParam.getSubject()+"%");
        }
        if(!StringUtils.isEmpty(answerQuestionParam.getKnowledgePoint())){
            criteria.andKnowledgePointEqualTo("%"+answerQuestionParam.getKnowledgePoint()+"%");
        }
        return answerQuestionMapper.selectByExample(answerQuestionExample);
    }

    @Override
    public int updateanswer(AnswerQuestionParam answerQuestionParam){
        AnswerQuestion answerQuestion=answerQuestionParam;
        return answerQuestionMapper.updateByPrimaryKey(answerQuestion);
    }

    @Override
    public int deleteanswer(int answerid){
        return answerQuestionMapper.deleteByPrimaryKey(answerid);
    }

    @Override
    public int deleteanswer(List<Integer> answerids){
        AnswerQuestionExample example=new AnswerQuestionExample();
        example.createCriteria().andAnswerIdIn(answerids);
        return  answerQuestionMapper.deleteByExample(example);
    }

}
