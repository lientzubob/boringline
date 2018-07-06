package com.casual.home.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casual.home.entity.MessageBean;

public interface HomeDAO extends JpaRepository<MessageBean, Integer>{
	
}
