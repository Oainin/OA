package com.oa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="staffmessage")
public class Staff {
	
	private String number; //编号
	
	private String name; //姓名
	
	private String username; //用户名
	
	private String department;//部门
	
	private String role; //角色
	
	private String usedname; //曾用名
	
	private String englishname; //英语名
	
	private String sex;
	
	private String jobnumber; //工号
	
	private String positon;//岗位
	
	private String idcard; //身份证号码
	
	private String birthday; //出生日期
	
	private String age;
	
	private String province; //籍贯 （省份）

	private String city; //籍贯（城市）
	
	private String nation; //名族
	
	private String maritalstatus; //婚姻状况
	
	private String politicsstatus; //政治面貌
	
	private String workingstate; //在职状态
	
	private String partytime;  //入党时间
	
	private String tellnumber; //联系电话
	
	private String phonenumber; //手机号码
	
	private String msn;
	
	private String qq;
	
	private String email;
	
	private String Adress;//地址
	
	private String joinworktime; //加入工作时间
	
	private String othernumer; //其他联系方式
	
	private String tatolworkage;  //总工龄
	
	private String health; //健康状态
	
	private String registeradress; //户口所在地
	
	private String differentaccount; //异地户口
	
	private String registertype;  //户口类别
	
	private String entrytime;  //入职时间
	
	private String bank1; //开户银行1
	
	private String personalaccount1; //个人账户1
	
	private String bank2;
	
	private String personalaccount2;
	
	private String educationbackground; //学历
	
	private String degree; //学位
	
	private String graduatetime; //毕业时间
	
	private String major; //专业
	
	private String school; //毕业院校
	
	private String computerskill; //计算机水平
	
	private String foreignlanguage1; //外语语种1
	
	private String foreignlanguage2; //外语语种2
	
	private String foreignlanguage3; //外语语种3
	
	private String flskill1;  //外语水平1
	
	private String flskill2; //外语水平2
	
	private String flskill3; //外语水平3
	
	private String speciality; //特长
	
	private String profession; //工种
	
	private String administrativelevel; //行政级别
	
	private String stafftype; //员工类型
	
	private String duty; //职务
	
	private String professionaltitle; //职称
	
	private String titlelevel; //职称级别
	
	private String thisjobtime; //本单位工龄
	
	private String startingsalarytime; //起薪时间
	
	private String annual_leave; //年休假
	
	private String resume;  //简历
	
	private String guaranteerecords;  //担保记录
	
	private String dutystatus;  //职务情况
	
	private String socialsecurity;  //社保缴纳情况
	
	private String medicalrecord;  //体检记录
	
	private String remark; //备注
	
	private String testfield; //测试字段

	/**
	 * 
	 */
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param number
	 * @param name
	 * @param username
	 * @param department
	 * @param role
	 * @param usedname
	 * @param englishname
	 * @param sex
	 * @param jobnumber
	 * @param positon
	 * @param idcard
	 * @param birthday
	 * @param age
	 * @param province
	 * @param city
	 * @param nation
	 * @param maritalstatus
	 * @param politicsstatus
	 * @param workingstate
	 * @param partytime
	 * @param tellnumber
	 * @param phonenumber
	 * @param msn
	 * @param qq
	 * @param email
	 * @param adress
	 * @param joinworktime
	 * @param othernumer
	 * @param tatolworkage
	 * @param health
	 * @param registeradress
	 * @param differentaccount
	 * @param registertype
	 * @param entrytime
	 * @param bank1
	 * @param personalaccount1
	 * @param bank2
	 * @param personalaccount2
	 * @param educationbackground
	 * @param degree
	 * @param graduatetime
	 * @param major
	 * @param school
	 * @param computerskill
	 * @param foreignlanguage1
	 * @param foreignlanguage2
	 * @param foreignlanguage3
	 * @param flskill1
	 * @param flskill2
	 * @param flskill3
	 * @param speciality
	 * @param profession
	 * @param administrativelevel
	 * @param stafftype
	 * @param duty
	 * @param professionaltitle
	 * @param titlelevel
	 * @param thisjobtime
	 * @param startingsalarytime
	 * @param annual_leave
	 * @param resume
	 * @param guaranteerecords
	 * @param dutystatus
	 * @param socialsecurity
	 * @param medicalrecord
	 * @param remark
	 * @param testfield
	 */
	public Staff(String number, String name, String username, String department, String role, String usedname,
			String englishname, String sex, String jobnumber, String positon, String idcard, String birthday,
			String age, String province, String city, String nation, String maritalstatus, String politicsstatus,
			String workingstate, String partytime, String tellnumber, String phonenumber, String msn, String qq,
			String email, String adress, String joinworktime, String othernumer, String tatolworkage, String health,
			String registeradress, String differentaccount, String registertype, String entrytime, String bank1,
			String personalaccount1, String bank2, String personalaccount2, String educationbackground, String degree,
			String graduatetime, String major, String school, String computerskill, String foreignlanguage1,
			String foreignlanguage2, String foreignlanguage3, String flskill1, String flskill2, String flskill3,
			String speciality, String profession, String administrativelevel, String stafftype, String duty,
			String professionaltitle, String titlelevel, String thisjobtime, String startingsalarytime,
			String annual_leave, String resume, String guaranteerecords, String dutystatus, String socialsecurity,
			String medicalrecord, String remark, String testfield) {
		super();
		this.number = number;
		this.name = name;
		this.username = username;
		this.department = department;
		this.role = role;
		this.usedname = usedname;
		this.englishname = englishname;
		this.sex = sex;
		this.jobnumber = jobnumber;
		this.positon = positon;
		this.idcard = idcard;
		this.birthday = birthday;
		this.age = age;
		this.province = province;
		this.city = city;
		this.nation = nation;
		this.maritalstatus = maritalstatus;
		this.politicsstatus = politicsstatus;
		this.workingstate = workingstate;
		this.partytime = partytime;
		this.tellnumber = tellnumber;
		this.phonenumber = phonenumber;
		this.msn = msn;
		this.qq = qq;
		this.email = email;
		Adress = adress;
		this.joinworktime = joinworktime;
		this.othernumer = othernumer;
		this.tatolworkage = tatolworkage;
		this.health = health;
		this.registeradress = registeradress;
		this.differentaccount = differentaccount;
		this.registertype = registertype;
		this.entrytime = entrytime;
		this.bank1 = bank1;
		this.personalaccount1 = personalaccount1;
		this.bank2 = bank2;
		this.personalaccount2 = personalaccount2;
		this.educationbackground = educationbackground;
		this.degree = degree;
		this.graduatetime = graduatetime;
		this.major = major;
		this.school = school;
		this.computerskill = computerskill;
		this.foreignlanguage1 = foreignlanguage1;
		this.foreignlanguage2 = foreignlanguage2;
		this.foreignlanguage3 = foreignlanguage3;
		this.flskill1 = flskill1;
		this.flskill2 = flskill2;
		this.flskill3 = flskill3;
		this.speciality = speciality;
		this.profession = profession;
		this.administrativelevel = administrativelevel;
		this.stafftype = stafftype;
		this.duty = duty;
		this.professionaltitle = professionaltitle;
		this.titlelevel = titlelevel;
		this.thisjobtime = thisjobtime;
		this.startingsalarytime = startingsalarytime;
		this.annual_leave = annual_leave;
		this.resume = resume;
		this.guaranteerecords = guaranteerecords;
		this.dutystatus = dutystatus;
		this.socialsecurity = socialsecurity;
		this.medicalrecord = medicalrecord;
		this.remark = remark;
		this.testfield = testfield;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Column
	public String getUsedname() {
		return usedname;
	}

	public void setUsedname(String usedname) {
		this.usedname = usedname;
	}

	@Column
	public String getEnglishname() {
		return englishname;
	}

	public void setEnglishname(String englishname) {
		this.englishname = englishname;
	}

	@Column
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column
	public String getJobnumber() {
		return jobnumber;
	}

	public void setJobnumber(String jobnumber) {
		this.jobnumber = jobnumber;
	}

	@Column
	public String getPositon() {
		return positon;
	}

	public void setPositon(String positon) {
		this.positon = positon;
	}

	@Column
	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	@Column
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Column
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Column
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column
	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Column
	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	@Column
	public String getPoliticsstatus() {
		return politicsstatus;
	}

	public void setPoliticsstatus(String politicsstatus) {
		this.politicsstatus = politicsstatus;
	}

	@Column
	public String getWorkingstate() {
		return workingstate;
	}

	public void setWorkingstate(String workingstate) {
		this.workingstate = workingstate;
	}

	@Column
	public String getPartytime() {
		return partytime;
	}

	public void setPartytime(String partytime) {
		this.partytime = partytime;
	}

	@Column
	public String getTellnumber() {
		return tellnumber;
	}

	public void setTellnumber(String tellnumber) {
		this.tellnumber = tellnumber;
	}

	@Column
	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	@Column
	public String getMsn() {
		return msn;
	}



	public void setMsn(String msn) {
		this.msn = msn;
	}

	@Column
	public String getQq() {
		return qq;
	}



	public void setQq(String qq) {
		this.qq = qq;
	}



	@Column
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column
	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	@Column
	public String getJoinworktime() {
		return joinworktime;
	}

	public void setJoinworktime(String joinworktime) {
		this.joinworktime = joinworktime;
	}

	@Column
	public String getOthernumer() {
		return othernumer;
	}

	public void setOthernumer(String othernumer) {
		this.othernumer = othernumer;
	}

	@Column
	public String getTatolworkage() {
		return tatolworkage;
	}

	public void setTatolworkage(String tatolworkage) {
		this.tatolworkage = tatolworkage;
	}

	@Column
	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	@Column
	public String getRegisteradress() {
		return registeradress;
	}

	public void setRegisteradress(String registeradress) {
		this.registeradress = registeradress;
	}

	@Column
	public String getDifferentaccount() {
		return differentaccount;
	}

	public void setDifferentaccount(String differentaccount) {
		this.differentaccount = differentaccount;
	}

	@Column
	public String getRegistertype() {
		return registertype;
	}

	public void setRegistertype(String registertype) {
		this.registertype = registertype;
	}

	@Column
	public String getEntrytime() {
		return entrytime;
	}

	public void setEntrytime(String entrytime) {
		this.entrytime = entrytime;
	}

	@Column
	public String getBank1() {
		return bank1;
	}

	public void setBank1(String bank1) {
		this.bank1 = bank1;
	}

	@Column
	public String getPersonalaccount1() {
		return personalaccount1;
	}

	public void setPersonalaccount1(String personalaccount1) {
		this.personalaccount1 = personalaccount1;
	}

	@Column
	public String getBank2() {
		return bank2;
	}

	public void setBank2(String bank2) {
		this.bank2 = bank2;
	}

	@Column
	public String getPersonalaccount2() {
		return personalaccount2;
	}

	public void setPersonalaccount2(String personalaccount2) {
		this.personalaccount2 = personalaccount2;
	}

	@Column
	public String getEducationbackground() {
		return educationbackground;
	}

	public void setEducationbackground(String educationbackground) {
		this.educationbackground = educationbackground;
	}

	@Column
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Column
	public String getGraduatetime() {
		return graduatetime;
	}

	public void setGraduatetime(String graduatetime) {
		this.graduatetime = graduatetime;
	}

	@Column
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Column
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Column
	public String getComputerskill() {
		return computerskill;
	}

	public void setComputerskill(String computerskill) {
		this.computerskill = computerskill;
	}

	@Column
	public String getForeignlanguage1() {
		return foreignlanguage1;
	}

	public void setForeignlanguage1(String foreignlanguage1) {
		this.foreignlanguage1 = foreignlanguage1;
	}

	@Column
	public String getForeignlanguage2() {
		return foreignlanguage2;
	}

	public void setForeignlanguage2(String foreignlanguage2) {
		this.foreignlanguage2 = foreignlanguage2;
	}

	@Column
	public String getForeignlanguage3() {
		return foreignlanguage3;
	}

	public void setForeignlanguage3(String foreignlanguage3) {
		this.foreignlanguage3 = foreignlanguage3;
	}

	@Column
	public String getFlskill1() {
		return flskill1;
	}

	public void setFlskill1(String flskill1) {
		this.flskill1 = flskill1;
	}

	@Column
	public String getFlskill2() {
		return flskill2;
	}

	public void setFlskill2(String flskill2) {
		this.flskill2 = flskill2;
	}

	@Column
	public String getFlskill3() {
		return flskill3;
	}

	public void setFlskill3(String flskill3) {
		this.flskill3 = flskill3;
	}

	@Column
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Column
	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Column
	public String getAdministrativelevel() {
		return administrativelevel;
	}

	public void setAdministrativelevel(String administrativelevel) {
		this.administrativelevel = administrativelevel;
	}

	@Column
	public String getStafftype() {
		return stafftype;
	}

	public void setStafftype(String stafftype) {
		this.stafftype = stafftype;
	}

	@Column
	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	@Column
	public String getProfessionaltitle() {
		return professionaltitle;
	}

	public void setProfessionaltitle(String professionaltitle) {
		this.professionaltitle = professionaltitle;
	}

	@Column
	public String getTitlelevel() {
		return titlelevel;
	}

	public void setTitlelevel(String titlelevel) {
		this.titlelevel = titlelevel;
	}

	@Column
	public String getThisjobtime() {
		return thisjobtime;
	}

	public void setThisjobtime(String thisjobtime) {
		this.thisjobtime = thisjobtime;
	}

	@Column
	public String getStartingsalarytime() {
		return startingsalarytime;
	}

	public void setStartingsalarytime(String startingsalarytime) {
		this.startingsalarytime = startingsalarytime;
	}

	@Column
	public String getAnnual_leave() {
		return annual_leave;
	}

	public void setAnnual_leave(String annual_leave) {
		this.annual_leave = annual_leave;
	}

	@Column
	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	@Column
	public String getGuaranteerecords() {
		return guaranteerecords;
	}

	public void setGuaranteerecords(String guaranteerecords) {
		this.guaranteerecords = guaranteerecords;
	}

	@Column
	public String getDutystatus() {
		return dutystatus;
	}

	public void setDutystatus(String dutystatus) {
		this.dutystatus = dutystatus;
	}

	@Column
	public String getSocialsecurity() {
		return socialsecurity;
	}

	public void setSocialsecurity(String socialsecurity) {
		this.socialsecurity = socialsecurity;
	}

	@Column
	public String getMedicalrecord() {
		return medicalrecord;
	}

	public void setMedicalrecord(String medicalrecord) {
		this.medicalrecord = medicalrecord;
	}

	@Column
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column
	public String getTestfield() {
		return testfield;
	}

	public void setTestfield(String testfield) {
		this.testfield = testfield;
	}



	@Override
	public String toString() {
		return "Staff [number=" + number + ", name=" + name + ", username=" + username + ", department=" + department
				+ ", role=" + role + ", usedname=" + usedname + ", englishname=" + englishname + ", sex=" + sex
				+ ", jobnumber=" + jobnumber + ", positon=" + positon + ", idcard=" + idcard + ", birthday=" + birthday
				+ ", age=" + age + ", province=" + province + ", city=" + city + ", nation=" + nation
				+ ", maritalstatus=" + maritalstatus + ", politicsstatus=" + politicsstatus + ", workingstate="
				+ workingstate + ", partytime=" + partytime + ", tellnumber=" + tellnumber + ", phonenumber="
				+ phonenumber + ", msn=" + msn + ", qq=" + qq + ", email=" + email + ", Adress=" + Adress
				+ ", joinworktime=" + joinworktime + ", othernumer=" + othernumer + ", tatolworkage=" + tatolworkage
				+ ", health=" + health + ", registeradress=" + registeradress + ", differentaccount=" + differentaccount
				+ ", registertype=" + registertype + ", entrytime=" + entrytime + ", bank1=" + bank1
				+ ", personalaccount1=" + personalaccount1 + ", bank2=" + bank2 + ", personalaccount2="
				+ personalaccount2 + ", educationbackground=" + educationbackground + ", degree=" + degree
				+ ", graduatetime=" + graduatetime + ", major=" + major + ", school=" + school + ", computerskill="
				+ computerskill + ", foreignlanguage1=" + foreignlanguage1 + ", foreignlanguage2=" + foreignlanguage2
				+ ", foreignlanguage3=" + foreignlanguage3 + ", flskill1=" + flskill1 + ", flskill2=" + flskill2
				+ ", flskill3=" + flskill3 + ", speciality=" + speciality + ", profession=" + profession
				+ ", administrativelevel=" + administrativelevel + ", stafftype=" + stafftype + ", duty=" + duty
				+ ", professionaltitle=" + professionaltitle + ", titlelevel=" + titlelevel + ", thisjobtime="
				+ thisjobtime + ", startingsalarytime=" + startingsalarytime + ", annual_leave=" + annual_leave
				+ ", resume=" + resume + ", guaranteerecords=" + guaranteerecords + ", dutystatus=" + dutystatus
				+ ", socialsecurity=" + socialsecurity + ", medicalrecord=" + medicalrecord + ", remark=" + remark
				+ ", testfield=" + testfield + "]";
	}

	
	
}
