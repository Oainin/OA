package com.oa.dao.implments_achieve;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.oa.dao.AreaDao;
import com.oa.entity.AreaEntity;

@Repository
public class AreaDaoImpl implements AreaDao{
	
	private HibernateTemplate hibernateTemplate;
	
	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<AreaEntity> select(int id) {
		List<AreaEntity> areaList = hibernateTemplate.find("from AreaEntity where parent_id=?",id);
		if (areaList.size()<1) {
			return null;
		}
		return areaList;
	}
}
