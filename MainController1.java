package com.hcl.cs.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.cs.model.Pet;
import com.hcl.cs.model.User1;
import com.hcl.cs.service.UserService1;





@Controller
public class MainController1 {

	@Autowired
	private UserService1 userService;
	
	
	
	@RequestMapping(value="/")
	public String loginPage(ModelMap map) {
		User1 user=new User1();
		map.addAttribute("logForm",user);
		return "login";
	}
	@RequestMapping(value="/user")
	public String loginPage1(ModelMap model) {
		User1 user1=new User1();
		model.addAttribute("loginForm",user1);
		return "loginPage";
	}
	
	@RequestMapping(value="/register")
	public String registrationPage(ModelMap model) {
		User1 user2=new User1();
		model.addAttribute("userForm",user2);
		return "registrationPage";
	}
	@RequestMapping(value="/saveUser",method=RequestMethod.POST)
	public String saveUser(@Validated @ModelAttribute("userForm") User1 use,BindingResult result,ModelMap map) {
		
		String response="";
		if(result.hasErrors()) {
			response="registrationPage";
		}
		else {
			userService.saveUser(use);
			User1 user1=new User1();
	        map.addAttribute("loginForm",user1);
			response="loginPage";
		}
	
		return response;
	}
	@RequestMapping(value="/authenticateUser",method=RequestMethod.POST)
	 public String authenticateUser(@ModelAttribute("loginForm")User1 user3,Pet pet,BindingResult result,ModelMap model){
		
		String response="";
		if(result.hasErrors()) {
			response="loginPage";
		}
		else {
			Object str=userService.authenticateUser(user3);
			if(str!=null) {
			User1 user2=new User1();
	        model.addAttribute("homeForm",user2);
	        List<Pet> petlist=userService.fetchAllPet();
			model.addAttribute("petList",petlist);
			response="homePage";
			}
			else {
				response="loginPage";
			}
		}
		return response;
	
	}
	
	@RequestMapping(value="/addPet")
	public String addPetPage(ModelMap model) {
		Pet pet1=new Pet();
		model.addAttribute("petForm",pet1);
		return "addPetPage";
	}
	
	@RequestMapping(value="/savePet",method=RequestMethod.POST)
	public String savePet(@Validated @ModelAttribute("petForm") Pet pets,BindingResult result,ModelMap map) {
		String response="";
		if(result.hasErrors()) {
			response="addPetPage";
		}
		else {
			userService.savePet(pets);
			response="homePage";
		}
	
		return response;

	
	}
	@RequestMapping(value="/logOut")
	public String logout(HttpServletRequest request,ModelMap map) {
	       
        HttpSession session  = request.getSession();
        session.invalidate();
        User1 user1=new User1();
        map.addAttribute("loginForm",user1);
        return "loginPage";
    }
	
}
