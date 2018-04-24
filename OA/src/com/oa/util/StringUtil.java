package com.oa.util;

import com.oa.entity.UserEntity;

public class StringUtil {
	public static boolean objectIsNull(UserEntity user) {
		String username = user.getUsername();
		String password = user.getPassword();
		String phone = user.getPhone();
		String sex = user.getSex();
		int admin = user.getAdmin();
		String birthday = user.getBirthday();
		boolean falg = false;
		falg = stringIsNull(username) && stringIsNull(password) && stringIsNull(phone) && stringIsNull(sex)
				&& stringIsNull(birthday) && admin>=0 && admin <10;
		return falg;
	}

	public static boolean stringIsNull(String str) {
		return str != null && !str.equals("");
	}
}
