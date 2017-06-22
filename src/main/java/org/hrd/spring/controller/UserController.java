package org.hrd.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/dashboard")
	public String dashboard(){
		return "/admin/dashboard";
	}
	@RequestMapping("/user-list")
	public String userList(){
		return "/admin/user-list";
	}
	
	@RequestMapping("/user-cu")
	public String userCU(){
		return ("/admin/user-cu");
	}
	
	@RequestMapping("/role-list")
	public String roleList(){
		return ("/admin/role-list");
	}
	
	@RequestMapping("/role-cu")
	public String roleCU(){
		
		return ("/admin/role-cu");
	}
}
