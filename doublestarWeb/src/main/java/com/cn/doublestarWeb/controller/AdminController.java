package com.cn.doublestarWeb.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.doublestarWeb.domain.Admin;
import com.cn.doublestarWeb.domain.User;
import com.cn.doublestarWeb.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Resource
	AdminService adminService;
	
	@RequestMapping("/showadmin")
	public String toIndex(HttpServletRequest request,Model model){
		int adminId = Integer.parseInt(request.getParameter("id"));
		Admin user = this.adminService.getAdminById(adminId);
		model.addAttribute("user", user);
		return "showUser";
	}
}
