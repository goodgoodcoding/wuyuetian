package com.xnt.dhq.service;

import com.xnt.dhq.dto.FillQuestionParam;
import com.xnt.dhq.model.FillQuestion;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FillQuestionService {
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    int createFill(FillQuestionParam fillQuestionParam);

    List<FillQuestion> listAllfill(Integer pageNum, Integer pageSize);


    List<FillQuestion> listfill(FillQuestionParam fillQuestionParam, Integer pageNum, Integer pageSize);

    @Transactional
    int updatefill(FillQuestionParam fillQuestionParam);

    int deletefill(int fillid);

    /*
     *批量删除填空题
     */
    int deletefill(List<Integer> ids);

}
