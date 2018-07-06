package com.casual.home.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.casual.common.entity.GenericEntity;

@Entity
@Table(name="message")
public class MessageBean extends GenericEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer message_id;
	private String message_article;
	private String message_account;

	public MessageBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageBean(Integer message_id, String message_article, String message_account) {
		super();
		this.message_id = message_id;
		this.message_article = message_article;
		this.message_account = message_account;
	}

	public Integer getMessage_id() {
		return message_id;
	}

	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
	}

	public String getMessage_article() {
		return message_article;
	}

	public void setMessage_article(String message_article) {
		this.message_article = message_article;
	}

	public String getMessage_account() {
		return message_account;
	}

	public void setMessage_account(String message_account) {
		this.message_account = message_account;
	}

	@Override
	public String toString() {
		return "MessageBean [message_id=" + message_id + ", message_article=" + message_article + ", message_account="
				+ message_account + "]";
	}

}
