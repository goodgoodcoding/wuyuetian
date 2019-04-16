package com.xnt.dhq.service.impl;

import com.github.pagehelper.PageHelper;
import com.xnt.dhq.dto.ChoiceQuestionParam;
import com.xnt.dhq.mapper.ChoiceQuestionMapper;
import com.xnt.dhq.model.ChoiceQuestion;
import com.xnt.dhq.model.ChoiceQuestionExample;
import com.xnt.dhq.service.ChoiceQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//import com.xnt.dhq.dao.ChoiceDao;

@Service
public class ChoiceQuestionServiceImpl implements ChoiceQuestionService {
    @Resource
    private ChoiceQuestionMapper choiceQuestionMapper;

//    @Resource
//    ChoiceDao choiceDao;

    @Override
    public int createChoice(ChoiceQuestionParam choiceQuestionParam){
        ChoiceQuestion choiceQuestion=choiceQuestionParam;
        choiceQuestionMapper.insert(choiceQuestion);
        return 1;
    }
    @Override
    public List<ChoiceQuestion> listAllchoice(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return choiceQuestionMapper.selectByExample(new ChoiceQuestionExample());
    }

//    @Override
//    public List<ChoiceQuestion> listchoice(Integer grade,String difficulty_level,String subject,Integer pageNum,int pageSize) {
//        PageHelper.startPage(pageNum, pageSize);
//        return choiceDao.selectByduotioajian(grade,difficulty_level,subject);
//    }

    @Override
    public int updatechoice(ChoiceQuestionParam choiceQuestionParam){
        //更新选择题信息
        ChoiceQuestion choiceQuestion=choiceQuestionParam;
//        choiceQuestion.setChoiceId(choiceid);
        return choiceQuestionMapper.updateByPrimaryKeySelective(choiceQuestion);
    }

    @Override
    public int deletechoice(int choiceid){
        return choiceQuestionMapper.deleteByPrimaryKey(choiceid);
    }

    @Override
    public int deletechoice(List<Integer> choiceids){
        ChoiceQuestionExample example=new ChoiceQuestionExample();
        example.createCriteria().andChoiceIdIn(choiceids);
        return  choiceQuestionMapper.deleteByExample(example);
    }

}
