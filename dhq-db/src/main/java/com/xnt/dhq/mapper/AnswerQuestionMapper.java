package com.xnt.dhq.mapper;

import com.xnt.dhq.model.AnswerQuestion;
import com.xnt.dhq.model.AnswerQuestionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnswerQuestionMapper {
    int countByExample(AnswerQuestionExample example);

    int deleteByExample(AnswerQuestionExample example);

    int deleteByPrimaryKey(Integer answerId);

    int insert(AnswerQuestion record);

    int insertSelective(AnswerQuestion record);

    List<AnswerQuestion> selectByExampleWithBLOBs(AnswerQuestionExample example);

    List<AnswerQuestion> selectByExample(AnswerQuestionExample example);

    AnswerQuestion selectByPrimaryKey(Integer answerId);

    int updateByExampleSelective(@Param("record") AnswerQuestion record, @Param("example") AnswerQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") AnswerQuestion record, @Param("example") AnswerQuestionExample example);

    int updateByExample(@Param("record") AnswerQuestion record, @Param("example") AnswerQuestionExample example);

    int updateByPrimaryKeySelective(AnswerQuestion record);

    int updateByPrimaryKeyWithBLOBs(AnswerQuestion record);

    int updateByPrimaryKey(AnswerQuestion record);
}