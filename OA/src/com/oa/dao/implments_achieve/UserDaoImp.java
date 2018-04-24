package com.oa.dao.implments_achieve;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.oa.dao.UserDao;
import com.oa.entity.BackGround;
import com.oa.entity.PunchCard;
import com.oa.entity.Staff;
import com.oa.entity.UserApp;
import com.oa.entity.UserEntity;

@Repository
public class UserDaoImp implements UserDao {
	private HibernateTemplate hibernateTemplate;

	@Resource(name = "hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("unchecked")
	@Override//登录账号
	public UserEntity login(String username, String password) {
		/*
		 * System.out.println(
		 * "---------------------------------------------------------------------------------------------"
		 * );
		 */
		List<UserEntity> lists = hibernateTemplate.find("from UserEntity where username=? and password=?", username,
				password);
		return lists.size() > 0 ? lists.get(0) : null;
	}

	@Override//登录时间插入
	public boolean logintime(String username) {
		boolean flag = hibernateTemplate.bulkUpdate("update UserEntity u set u.logintime=now() where u.username=?",
				username) > 0;
		return flag;
	}

	@Override//查询所属自己的软件
	public List<UserApp> appselect(String status) {
		System.out.println(status);
		List<UserApp> list = hibernateTemplate.find("from UserApp where status=? ",status);
		System.out.println(list.toString());
		return list;
	}

	@Override//插入新的软件
	public boolean appinsert(UserApp app) {
		try {

			hibernateTemplate.save(app);

			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override//删除软件
	public boolean closeimg(int aid) {
		boolean flag = hibernateTemplate.bulkUpdate("delete UserApp where aid=?", aid) > 0;
		return flag;
	}

	@Override//打卡计时处理
	public boolean insertpunchcard(String a, String b, int uid) {
		PunchCard entity = new PunchCard();
		int h = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		int m = Calendar.getInstance().get(Calendar.MINUTE);
		int s = Calendar.getInstance().get(Calendar.SECOND);
		String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
	    if(h>6 && h<=9) {
	    	if(m<=0) {
	    		entity.setDown(0);
				entity.setUp(1);
				entity.setWait(0);
	    	}
	    }else if(h>=9 && h<=11) {
	    	
	    		entity.setDown(0);
				entity.setUp(0);
				entity.setWait(1);
	    	
	    }else {
	    	entity.setDown(1);
			entity.setUp(0);
			entity.setWait(0);
	    }
		int ab = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		entity.setCardlocation(a);
		entity.setUid(uid);
		entity.setUptime(time);
		entity.setDays(ab);
		Double x = Double.parseDouble(b.substring(b.indexOf("-") + 1));
		Double y = Double.parseDouble(b.substring(0, b.indexOf("-") - 1));
		if (104 - y > 1 && 140 - y < -1) {
			return false;
		}
		try {
			hibernateTemplate.save(entity);
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override//查询打卡情况
	public boolean dcardDo(int uid){
		int days = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		List<PunchCard> cards = hibernateTemplate.find("from PunchCard where days=? and uid=?", days, uid);
		if (cards.size() > 0) {

			return false;
		}
		return true;
	}

	@Override//注册账号
	public boolean reg(UserEntity user) {
		boolean falg=hibernateTemplate.save(user)!=null;
		return falg;
	}

	@Override//管理员获取所有归属其软件
	public List<UserApp> appall(int uid) {
           List<UserApp> list=hibernateTemplate.find("from UserApp where uid=?",uid);
		return list;
	}

	@Override
	public List<UserApp> userall(String status) {
		  List<UserApp> list=hibernateTemplate.find("from UserApp where status=?",status);
			return list;
			}

	
	@Override //把excel转换后的数据存入数据库
	public boolean insertAll(List<Staff> stafflist) {
		// TODO Auto-generated method stub
		for(int i=0;i<stafflist.size();i++) {
			boolean flag = hibernateTemplate.save(stafflist.get(i)) !=null;
			if(flag == false) {
				break;
			}
		}
		return true;
	}

	@Override
	public boolean backinsert(int uid, String backurl) {
         BackGround backGround=new BackGround();
         backGround.setUid(uid);
         backGround.setBackurl(backurl);
         backGround.setBacktime(Calendar.getInstance().get(Calendar.DATE)+"");
         if(hibernateTemplate.save(backGround)!=null) {
        	 return true;
         }else {
		return false;
	}}

	@Override
	public List<BackGround> selectbackall(int uid) {
		List<BackGround> list4=hibernateTemplate.find("from BackGround where uid=?",uid);
		return list4;
	}
}
