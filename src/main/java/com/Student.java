package com;

import java.math.BigDecimal;

/**
 * @author Dmytro.Fotin
 */
public class Student {
	private Integer age;
	private String name;
	private BigDecimal id;

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getId() {
		return id;
	}
}
