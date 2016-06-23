package com.dmm.framework.dmm.main.modules.test.entity;

import com.dmm.framework.dmm.common.common.persistence.DataEntity;

public class UserInfo extends DataEntity<UserInfo>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5211153498562719168L;
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
