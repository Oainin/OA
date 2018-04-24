package com.oa.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.google.gson.Gson;
import com.oa.entity.AreaEntity;
import com.oa.service.AreaService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class AreaController extends ActionSupport{
	private AreaService areaService;
	
	@Resource(name="areaServiceImpl")
	public void setAreaService(AreaService areaService) {
		this.areaService = areaService;
	}
	
	private AreaEntity area;
	
	public AreaEntity getArea() {
		return area;
	}
	public void setArea(AreaEntity area) {
		this.area = area;
	}
	
	public void select() throws IOException {
		ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
		List<AreaEntity> arealist = areaService.select(area.getId());
		System.out.println(arealist);
		Gson gson = new Gson();
		ServletActionContext.getResponse().getWriter().print(gson.toJson(arealist));
		
	}
}
