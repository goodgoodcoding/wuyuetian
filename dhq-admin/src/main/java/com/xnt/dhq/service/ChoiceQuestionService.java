package com.xnt.dhq.service;

import com.xnt.dhq.dto.ChoiceQuestionParam;
import com.xnt.dhq.model.ChoiceQuestion;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ChoiceQuestionService {
    /*
     *增加选择题
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    int createChoice(ChoiceQuestionParam choiceQuestionParam);
    /*
     *分页展示所有选择题
     */
    List<ChoiceQuestion> listAllchoice(Integer pageNum, Integer pageSize);
    /*
     *分页查询选择题
     */
//    List<ChoiceQuestion> listchoice(Integer grade,String difficulty_level,String subject,Integer pageNum,int pageSize);
    /*
     *根据id展示选择题
     */
    int updatechoice(ChoiceQuestionParam choiceQuestionParam);
    /*
     *删除选择题
     */
    int deletechoice(int choiceid);
    /*
     *批量删除选择题
     */
    int deletechoice(List<Integer> ids);

}
