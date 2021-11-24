package com.sicnu.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component(value="myschool")
public class School{
	@Value("1")
	private int id;
	@Value("四川师范大学")
	private String name;
	@Value("成都锦江区狮子山")
	private String address;
}
