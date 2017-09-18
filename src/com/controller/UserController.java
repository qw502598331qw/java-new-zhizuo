package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Guan;
import com.model.Guan1;
import com.model.User;
import com.service.IUserService;
import net.sf.json.JSONArray;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
/*	@RequestMapping(value = "/checkUser")
	@ResponseBody
	public String checkUser(Model model, HttpServletRequest request, User user, String username, String password) {
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		if (userService.checkUser(user)) {
			return "success";
		}
		return "fail";
	}*/
	@RequestMapping(value = "/add" )  
	@ResponseBody
	public String add(Model model, HttpServletRequest request,int MemberID, String LoginName, String LoginPwd,String MemberEmail) {
		System.out.println(MemberID);
		System.out.println(LoginName);
		System.out.println(LoginPwd);
		System.out.println(MemberEmail);
		User c=new User(MemberID, LoginName,LoginPwd,MemberEmail, 0, null, null);
		if(userService.add(c))
		{     	  
            return "true";
          }

	   else{
		   return "false";
        }
	}
	@RequestMapping(value = "/add1" )  
	@ResponseBody
	public String add1(Model model, HttpServletRequest request,String number,String passed,String guan) {
		System.out.println(number);
		System.out.println(passed);
		System.out.println(guan);
		Guan1 c=new Guan1(number, passed,guan);
		if(userService.add1(c))
		{     	  
            return "true";
          }

	   else{
		   return "false";
        }
	}
	@RequestMapping(value = "/update" )  
	@ResponseBody
	public String update(Model model, HttpServletRequest request,int MemberID, String LoginName, String LoginPwd,String MemberEmail) {
		System.out.println(MemberID);
		System.out.println(LoginName);
		System.out.println(LoginPwd);
		System.out.println(MemberEmail);
		User c=new User(MemberID, LoginName,LoginPwd,MemberEmail, 0, null, null);
		if(userService.update(c))
		{     	  
            return "true";
          }

	   else{
		   return "false";
        }
	}
	@RequestMapping(value = "/delete" )
	@ResponseBody
	public String delete(Model model, HttpServletRequest request,int MemberID) {
		System.out.println(MemberID);
		if(userService.delete(MemberID))
		{     	  
            return "true";
          }

	   else{
		   return "false";
        }
	}
		

	@RequestMapping(value = "/cha")
	@ResponseBody
	public String queryAll(Model model, HttpServletRequest request,User user) {
		List<User> list=userService.queryAll();
		JSONArray json = JSONArray.fromObject(list);
		System.out.println(json.toString());
		return json.toString(); 
	}
	@RequestMapping(value = "/chaguan")
	@ResponseBody
	 public String checkGuan(Model model,HttpServletRequest request ,Guan guan,String number,String passed){
		System.out.println(number);
		System.out.println(passed);
		if(userService.cun(guan)==1){
			return "1";
		}
		if(userService.cun(guan)==2){
			return "2";
		}
		else
			return "0";
	}
	
}

