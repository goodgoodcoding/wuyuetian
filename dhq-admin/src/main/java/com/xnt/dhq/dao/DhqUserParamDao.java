package com.xnt.dhq.dao;

import com.xnt.dhq.model.DhqUserExample;
import com.xnt.dhq.model.DhqUserParam;

import java.util.List;

public interface DhqUserParamDao {
    /**
     * 获取前台展示用户数据
     */
    List<DhqUserParam> selectByExample(DhqUserExample dhqUserExample);
}
