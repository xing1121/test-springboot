package com.sf.wdx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：HelloController
 * @author 80002888
 * @date   2018年8月30日
 */
@Controller
public class HelloController {
	
	/**
	 * 拦截/hello请求
	 *	@ReturnType	String 
	 *	@Date	2018年8月30日	上午9:58:36
	 *  @Param  @param model
	 *  @Param  @return
	 */
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", "SpringBoot-FreeMarker!");
		System.out.println("Hello");
		return "success";
	}

}