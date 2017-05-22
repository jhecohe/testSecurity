package org.jhecohe.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/posts")
public class PostController {

//	@Secured("ROLE_GUEST")
	@RequestMapping("/posts")
	public String list(){
		return "list posts...";
	}

	
//	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@RequestMapping("/admin/posts/create")
	public String addPost (){
		return "Added posts...";
	}
}
