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
<<<<<<< HEAD
		MessageBean messageBean = new MessageBean("我愛BOB BOB好帥","bob");
=======
		MessageBean messageBean = new MessageBean("lalala","bob");
>>>>>>> branch 'master' of https://github.com/lientzubob/boringline
		MessageBean insert = homeService.insert(messageBean);
		System.out.println(insert);
		System.out.println("==================================");
		return "insert";
	}
	
	@RequestMapping("update/{id}")
	public String update(@PathVariable("id") Integer id){
		MessageBean messageBean = new MessageBean("jajaja","tim");
		MessageBean update = homeService.update(messageBean);
		System.out.println(update);
		return "update";
	}
	
	@RequestMapping("delete/{id}")
<<<<<<< HEAD
	public String delete(@PathVariable("id") Integer id){
		MessageBean messageBean = new MessageBean(null,null);
		homeService.delete(messageBean);
=======
	public String delete(@PathVariable("id") Long id){
		MessageBean messageBean = new MessageBean(null,null);
		homeService.delete(id);
>>>>>>> branch 'master' of https://github.com/lientzubob/boringline
		return "delete";
	}
	
	@RequestMapping("deleteAll")
	public String deleteAll(){
		homeService.deleteAll();
		return "delete";
	}
	
	@RequestMapping("selectOne/{id}")
	public String selectOne(@PathVariable("id") Long id){
		MessageBean selectOne = homeService.selectOne(id);
		System.out.println(selectOne);
		return "selectOne";
	}
	@RequestMapping("selectAll")
	public String select(){
		List<MessageBean> selectAll = homeService.selectAll();
		for(MessageBean data : selectAll){
			System.out.println(data);
			System.out.println(data.getMessage_article());
		}
		return "selectAll";
	}
	
	
}
