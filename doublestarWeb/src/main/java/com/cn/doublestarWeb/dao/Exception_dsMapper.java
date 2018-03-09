package com.cn.doublestarWeb.dao;

import com.cn.doublestarWeb.domain.Exception_ds;

public interface Exception_dsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Exception_ds record);

    int insertSelective(Exception_ds record);

    Exception_ds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Exception_ds record);

    int updateByPrimaryKey(Exception_ds record);
}