package com.casual.common.service;

import java.util.ArrayList;

import org.assertj.core.util.Lists;
import com.casual.common.dao.GenericDao;
import com.casual.common.entity.GenericEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class GenericService<T extends GenericEntity> {
	@Autowired
	private GenericDao<T> dao;

	public void insert(T genericEntity) throws Exception{
		dao.save(genericEntity);
	}

	public void update(T genericEntity) throws Exception{
		dao.save(genericEntity);

	}

	public void delete(Long id) throws Exception {
		dao.delete(id);

	}

	public ArrayList<T> getAll() throws Exception {
		return Lists.newArrayList(dao.findAll());
	}

	public GenericEntity getOne(Long id) throws Exception {
		return dao.findOne(id);
	}
}
