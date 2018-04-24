package com.oa.entity;

import java.util.ArrayList;
import java.util.List;

public class Result<T> {
private int struts;
private boolean flag;
private T t;
private List<UserApp> list=new ArrayList<>();
private List<BackGround> list2=new ArrayList<>();
private String content;

public List<BackGround> getList2() {
	return list2;
}
public void setList2(List<BackGround> list2) {
	this.list2 = list2;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public int getStruts() {
	return struts;
}
public void setStruts(int struts) {
	this.struts = struts;
}
public boolean isFlag() {
	return flag;
}
public void setFlag(boolean flag) {
	this.flag = flag;
}
public T getT() {
	return t;
}
public void setT(T t) {
	this.t = t;
}
public List<UserApp> getList() {
	return list;
}
public void setList(List<UserApp> list) {
	this.list = list;
}

}
