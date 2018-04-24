package com.oa.dao;

import java.util.List;

import com.oa.entity.BackGround;
import com.oa.entity.Staff;
import com.oa.entity.UserApp;
import com.oa.entity.UserEntity;

public interface UserDao {
public UserEntity login(String username,String password);
public boolean logintime(String username);
public List<UserApp> appselect(String status);
public boolean appinsert(UserApp app);
public boolean closeimg(int aid);
public boolean insertpunchcard(String a,String b,int uid);
public boolean dcardDo(int uid);
public boolean reg(UserEntity user);
public List<UserApp> appall(int uid);
public List<UserApp> userall(String status);
public boolean insertAll(List<Staff> stafflist);
public boolean backinsert(int uid,String backurl);
public List<BackGround> selectbackall(int uid);
}
