package com.oa.dao;

import java.util.List;

import com.oa.entity.AreaEntity;

public interface AreaDao {
	public List<AreaEntity> select(int id);
}
