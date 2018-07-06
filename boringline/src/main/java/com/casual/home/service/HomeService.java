package com.casual.home.service;

import java.util.List;

import com.casual.home.entity.MessageBean;

public interface HomeService {
	public MessageBean insert(MessageBean messageBean);

	public MessageBean selectOne(Integer message_id);

	public List<MessageBean> selectAll();

	public MessageBean update(MessageBean messageBean);

	public void delete(MessageBean messageBean);
	
	public void deleteAll();
	
	
}
