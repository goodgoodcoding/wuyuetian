package com.xnt.dhq.mapper;

import com.xnt.dhq.model.ChoiceQuestion;
import com.xnt.dhq.model.ChoiceQuestionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChoiceQuestionMapper {
    int countByExample(ChoiceQuestionExample example);

    int deleteByExample(ChoiceQuestionExample example);

    int deleteByPrimaryKey(Integer choiceId);

    int insert(ChoiceQuestion record);

    int insertSelective(ChoiceQuestion record);

    List<ChoiceQuestion> selectByExampleWithBLOBs(ChoiceQuestionExample example);

    List<ChoiceQuestion> selectByExample(ChoiceQuestionExample example);

    ChoiceQuestion selectByPrimaryKey(Integer choiceId);

    int updateByExampleSelective(@Param("record") ChoiceQuestion record, @Param("example") ChoiceQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") ChoiceQuestion record, @Param("example") ChoiceQuestionExample example);

    int updateByExample(@Param("record") ChoiceQuestion record, @Param("example") ChoiceQuestionExample example);

    int updateByPrimaryKeySelective(ChoiceQuestion record);

    int updateByPrimaryKeyWithBLOBs(ChoiceQuestion record);

    int updateByPrimaryKey(ChoiceQuestion record);
}