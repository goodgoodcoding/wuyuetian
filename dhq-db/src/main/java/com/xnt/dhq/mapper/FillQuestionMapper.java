package com.xnt.dhq.mapper;

import com.xnt.dhq.model.FillQuestion;
import com.xnt.dhq.model.FillQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FillQuestionMapper {
    int countByExample(FillQuestionExample example);

    int deleteByExample(FillQuestionExample example);

    int deleteByPrimaryKey(Integer fillId);

    int insert(FillQuestion record);

    int insertSelective(FillQuestion record);

    List<FillQuestion> selectByExampleWithBLOBs(FillQuestionExample example);

    List<FillQuestion> selectByExample(FillQuestionExample example);

    FillQuestion selectByPrimaryKey(Integer fillId);

    int updateByExampleSelective(@Param("record") FillQuestion record, @Param("example") FillQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") FillQuestion record, @Param("example") FillQuestionExample example);

    int updateByExample(@Param("record") FillQuestion record, @Param("example") FillQuestionExample example);

    int updateByPrimaryKeySelective(FillQuestion record);

    int updateByPrimaryKeyWithBLOBs(FillQuestion record);

    int updateByPrimaryKey(FillQuestion record);
}