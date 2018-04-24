package com.oa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserEntity {
	private int uid;
	private String username;
	private String password;
	private String sex;
	private String logintime;
	private String phone;
	private String address;
	private String birthday;
	private String name;
	private int admin;
	private String userphoto;
	private int superior;//上级id 

	@Column
	public int getSuperior() {
		return superior;
	}

	public void setSuperior(int superior) {
		this.superior = superior;
	}

	@Column
	public String getUserphoto() {
		return userphoto;
	}

	public void setUserphoto(String userphoto) {
		this.userphoto = userphoto;
	}
	@Column
	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}
	@Column
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	@Column
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	@Column
	public String getLogintime() {
		return logintime;
	}

	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}
	@Column
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Column
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Column
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserEntity(int uid, String username, String password, String sex, String logintime, String phone,
			String address, String birthday, String name) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.logintime = logintime;
		this.phone = phone;
		this.address = address;
		this.birthday = birthday;
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserEntity [uid=" + uid + ", username=" + username + ", password=" + password + ", sex=" + sex
				+ ", logintime=" + logintime + ", phone=" + phone + ", address=" + address + ", birthday=" + birthday
				+ ", name=" + name + ", admin=" + admin + ", userphoto=" + userphoto + "]";
	}

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
