package com.oa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PunchCard {
private int pid;
private int up;
private int down;
private int wait;
private int uid;
private String uptime;
private int days;

public int getDays() {
	return days;
}
public void setDays(int days) {
	this.days = days;
}
public String getUptime() {
	return uptime;
}
public void setUptime(String uptime) {
	this.uptime = uptime;
}
private String cardlocation;


public String getCardlocation() {
	return cardlocation;
}
public void setCardlocation(String cardlocation) {
	this.cardlocation = cardlocation;
}
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public int getUp() {
	return up;
}
public void setUp(int up) {
	this.up = up;
}
public int getDown() {
	return down;
}
public void setDown(int down) {
	this.down = down;
}
public int getWait() {
	return wait;
}
public void setWait(int wait) {
	this.wait = wait;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}

}
