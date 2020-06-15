package com.example.collection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyServiceFactory {
	
	@Autowired
	private List<MyService> myServices;
	
	void test() {
		
	}
	
}
