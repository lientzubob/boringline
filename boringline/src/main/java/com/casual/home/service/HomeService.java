package com.casual.home.service;

import java.util.List;

import com.casual.home.entity.MessageBean;

public interface HomeService {
	public MessageBean insert(MessageBean messageBean);

	public MessageBean selectOne(Long message_id);

	public List<MessageBean> selectAll();

	public MessageBean update(MessageBean messageBean);

	public void delete(Long id);
	
	public void deleteAll();
	
	
}
