package com.oa.service.implments_achieve;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oa.dao.AreaDao;
import com.oa.entity.AreaEntity;
import com.oa.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{
	
	private AreaDao areaDao;
	@Resource(name="areaDaoImpl")
	public void setAreaDao(AreaDao areaDao) {
		this.areaDao = areaDao;
	}
	@Override
	public List<AreaEntity> select(int id) {
		List<AreaEntity> areaList = areaDao.select(id);
		return areaList;
	}

}
