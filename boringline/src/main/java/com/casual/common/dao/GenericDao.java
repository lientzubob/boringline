package com.casual.common.dao;

import com.casual.common.entity.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericDao<T extends GenericEntity> extends JpaRepository<T, Long> {

}
