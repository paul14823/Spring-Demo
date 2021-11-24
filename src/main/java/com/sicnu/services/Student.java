package com.sicnu.services;

import com.sicnu.services.interfaces.Istudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class Student implements Istudent {
	@Value("1")
	private int id;
	@Value("彭科博")
	private String name;
	@Autowired
	@Qualifier("myschool")
	private School school;

	@Override
	public void GetDetail() {
		System.out.println("这是一个业务方法");
	}

	@Override
	public String Service1() {
		System.out.println("业务方法Service1被执行了，可能也被增强了");
		return "业务方法Service1";
	}
}
