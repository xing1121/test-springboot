package com.sf.wdx.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sf.wdx.domain.Person;
import com.sf.wdx.service.PersonService;

/**
 * 描述：PersonController
 * @author 80002888
 * @date   2018年8月29日
 */
@RestController	// 相当于@Controller + @ResponseBody的组合注解
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService memberService;
	
	/**
	 * 拦截/person/insert请求，插入数据
	 *	@ReturnType	String 
	 *	@Date	2018年8月30日	上午9:59:02
	 *  @Param  @param person
	 *  @Param  @return
	 */
	@RequestMapping("/insert")
	public String insert(Person person){
		memberService.insert(person);
		return "insert success!";
	}
	
	/**
	 * 拦截/person/delete/{id}请求，删除数据
	 *	@ReturnType	String 
	 *	@Date	2018年8月30日	上午9:59:16
	 *  @Param  @param id
	 *  @Param  @return
	 */
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable(name="id") Long id){
		memberService.deleteById(id);
		return "delete success!";
	}
	
	/**
	 * 拦截/person/update请求，更新数据
	 *	@ReturnType	String 
	 *	@Date	2018年8月30日	上午9:59:34
	 *  @Param  @param person
	 *  @Param  @return
	 */
	@RequestMapping("/update")
	public String update(Person person){
		memberService.updateById(person);
		return "update success!";
	}

	/**
	 * 拦截/person/select/{id}请求，查询数据
	 *	@ReturnType	Person 
	 *	@Date	2018年8月30日	上午9:59:52
	 *  @Param  @param id
	 *  @Param  @return
	 */
	@RequestMapping("/select/{id}")
	public Person select(@PathVariable(name="id") Long id, HttpSession session){
		Person p = memberService.selectById(id);
		session.setAttribute("p", p);
		return p;
	}
	
}
