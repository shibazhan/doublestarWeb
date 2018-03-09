package com.cn.doublestarWeb.dao;

import com.cn.doublestarWeb.domain.Rescue_car;

public interface Rescue_carMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rescue_car record);

    int insertSelective(Rescue_car record);

    Rescue_car selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rescue_car record);

    int updateByPrimaryKey(Rescue_car record);
}