package com.oa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BackGround {
private int uid;
private int bid;
private String backurl;
private String backtime;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBackurl() {
	return backurl;
}
public void setBackurl(String backurl) {
	this.backurl = backurl;
}
public String getBacktime() {
	return backtime;
}
public void setBacktime(String backtime) {
	this.backtime = backtime;
}

}
