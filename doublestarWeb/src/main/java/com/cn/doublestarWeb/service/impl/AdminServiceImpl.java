package com.cn.doublestarWeb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.doublestarWeb.dao.AdminMapper;
import com.cn.doublestarWeb.domain.Admin;
import com.cn.doublestarWeb.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Resource
	private AdminMapper adminMapper;
	@Override
	public Admin getAdminById(int userId) {
		// TODO Auto-generated method stub
		return adminMapper.selectByPrimaryKey(userId);
	}

	
	
	
	

}
