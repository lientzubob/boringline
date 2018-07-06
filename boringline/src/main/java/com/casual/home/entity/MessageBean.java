package com.casual.home.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.casual.common.entity.GenericEntity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@Table(name = "message")
public class MessageBean extends GenericEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2087477144511361600L;
	private String message_article;
	private String message_account;

	public MessageBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MessageBean [message_article=" + message_article + ", message_account=" + message_account + "]";
	}

	public MessageBean(String message_article, String message_account) {
		super();
		this.message_article = message_article;
		this.message_account = message_account;
	}

	

	
	
}
