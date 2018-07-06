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
//	@Id
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

	@Override
	public String toString() {
		return "MessageBean [message_id=" + message_id + ", message_article=" + message_article + ", message_account="
				+ message_account + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MessageBean other = (MessageBean) obj;
		if (message_account == null) {
			if (other.message_account != null)
				return false;
		} else if (!message_account.equals(other.message_account))
			return false;
		if (message_article == null) {
			if (other.message_article != null)
				return false;
		} else if (!message_article.equals(other.message_article))
			return false;
		if (message_id == null) {
			if (other.message_id != null)
				return false;
		} else if (!message_id.equals(other.message_id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((message_account == null) ? 0 : message_account.hashCode());
		result = prime * result + ((message_article == null) ? 0 : message_article.hashCode());
		result = prime * result + ((message_id == null) ? 0 : message_id.hashCode());
		return result;
	}

	
	
}
