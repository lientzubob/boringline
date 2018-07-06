package com.casual.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casual.home.dao.HomeDAO;
import com.casual.home.entity.MessageBean;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	private HomeDAO homeDAO;

	public MessageBean insert(MessageBean messageBean) {
		MessageBean save = homeDAO.save(messageBean);
		return save ;
	}

	public MessageBean selectOne(Long message_id) {
		MessageBean one = homeDAO.getOne(message_id);
		return one ;
	}

	public List<MessageBean> selectAll() {
		List<MessageBean> findAll = homeDAO.findAll();
		return findAll;
	}

	public MessageBean update(MessageBean messageBean) {
		MessageBean save = homeDAO.save(messageBean);
		return save;
	}

	public void delete(MessageBean messageBean) {
		homeDAO.delete(messageBean);
	}

	@Override
	public void deleteAll() {
		homeDAO.deleteAll();
	}

}
