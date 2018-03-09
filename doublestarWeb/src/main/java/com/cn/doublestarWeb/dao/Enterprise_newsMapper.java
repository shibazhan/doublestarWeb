package com.cn.doublestarWeb.dao;

import com.cn.doublestarWeb.domain.Enterprise_news;

public interface Enterprise_newsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Enterprise_news record);

    int insertSelective(Enterprise_news record);

    Enterprise_news selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Enterprise_news record);

    int updateByPrimaryKeyWithBLOBs(Enterprise_news record);

    int updateByPrimaryKey(Enterprise_news record);
}