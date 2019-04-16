package com.xnt.dhq.service;

import com.xnt.dhq.dto.AnswerQuestionParam;
import com.xnt.dhq.model.AnswerQuestion;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AnswerQuestionService {
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    int createAnswer(AnswerQuestionParam answerQuestionParam);

    List<AnswerQuestion> listAllanswer(Integer pageNum, Integer pageSize);

    /*
     *分页展示简答题
     */

    List<AnswerQuestion> listanswer(AnswerQuestionParam answerQuestionParam, Integer pageNum, Integer pageSize);

    /*
     *更新简答题
     */
    @Transactional
    int updateanswer(AnswerQuestionParam answerQuestionParam);


    int deleteanswer(int answerid);
    /*
     *批量删除简答题
     */
    int deleteanswer(List<Integer> ids);


}
