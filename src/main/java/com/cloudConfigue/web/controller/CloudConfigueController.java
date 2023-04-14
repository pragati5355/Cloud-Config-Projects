package com.cloudConfigue.web.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudConfigueController extends BaseController{
	
	@GetMapping("/list")
	public List<String> getAllList(){
		return Stream.of("Cloud", "Configue").collect(Collectors.toList());
	}

}
