package com.cn.doublestarWeb.dao;

import com.cn.doublestarWeb.domain.Rescue_pic;

public interface Rescue_picMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rescue_pic record);

    int insertSelective(Rescue_pic record);

    Rescue_pic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rescue_pic record);

    int updateByPrimaryKey(Rescue_pic record);
}