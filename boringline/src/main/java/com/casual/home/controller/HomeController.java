package com.casual.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casual.home.entity.MessageBean;
import com.casual.home.service.HomeService;

@RestController
@RequestMapping("home")
public class HomeController {
	
	@Autowired
	HomeService homeService;

	@RequestMapping("/hello")
	public String home() {
		
		
		return "hello world";
	}
	
	@RequestMapping("insert")
	public String insert(){
		System.out.println("==================================");
		MessageBean messageBean = new MessageBean(1,"lalala","bob");
		MessageBean insert = homeService.insert(messageBean);
		System.out.println(insert);
		System.out.println("==================================");
		return "insert";
	}
	
	@RequestMapping("update/{id}")
	public String update(@PathVariable("id") Integer id){
		MessageBean messageBean = new MessageBean(id,"jajaja","tim");
		MessageBean update = homeService.update(messageBean);
		System.out.println(update);
		return "update";
	}
	
	@RequestMapping("delete/{id}")
	public String delete(@PathVariable("id") Integer id){
		MessageBean messageBean = new MessageBean(id,null,null);
		homeService.delete(messageBean);
		return "delete";
	}
	
	@RequestMapping("deleteAll")
	public String deleteAll(){
		homeService.deleteAll();
		return "delete";
	}
	
	@RequestMapping("selectOne/{id}")
	public String selectOne(@PathVariable("id") Integer id){
		MessageBean selectOne = homeService.selectOne(id);
		System.out.println(selectOne);
		return "selectOne";
	}
	@RequestMapping("selectAll")
	public String select(){
		List<MessageBean> selectAll = homeService.selectAll();
		for(MessageBean data : selectAll){
			System.out.println(data);
		}
		return "selectAll";
	}
	
	
}
