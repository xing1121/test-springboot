package com.sf.wdx.domain;

import java.io.Serializable;

/**
 * 描述：Person
 * @author 80002888
 * @date   2018年8月30日
 */
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1490076195296931556L;

	private Long id;

	private String name;

	private Integer age;

	private String email;

	public Person() {
	}

	public Person(Long id, String name, Integer age, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}

}
