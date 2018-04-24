package com.oa.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.oa.entity.Staff;
import com.oa.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 上传excel 把用户数据存入数据库
 * @author MR  TAN
 *
 */

@Controller
@Scope("prototype")
public class UserMessageController extends ActionSupport implements ModelDriven<Staff>{
	
	private UserService service;
	
	@Resource(name = "userServiceImp")
	public void setService(UserService service) {
		this.service = service;
	}
	
	//注意，file并不是指前端jsp上传过来的文件本身，而是文件上传过来存放在临时文件夹下面的文件  
    private File upload;//动作类上传的属性必须是file类型,upload为表单的name值  
    private String uploadFileName; //上传的文件名称,固定写法:name+FileName;  
    private String uploadContentType; //上传文件的mime类型,固定写法: name+ContextType;
    
    //模型驱动
    private Staff staff = new Staff();
    public Staff getModel() {
        return staff;
    }  
    private File filename;//对应js中的filename
    
    public void setFilename(File filename) {
       this.filename=filename;
    }
    
    
    public File getUpload() {
		return upload;
	}



	public void setUpload(File upload) {
		this.upload = upload;
	}



	public String getUploadFileName() {
		return uploadFileName;
	}



	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}



	public String getUploadContentType() {
		return uploadContentType;
	}



	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	//跳转到上传界面
    public String up() {
    	return "up";
    }

	//mime:设定某种扩展名的文件用一种应用程序来打开的方式类型，当该扩展名文件被访问的时候，浏览器会自动使用指定应用程序来打开  
    public String upexcelDo() {  
        try {  
            //s提供一个服务器的存放地址即可  
            String realPath = ServletActionContext.getServletContext().getRealPath("/WEB-INF/excelup");  
            //判断路径是否存在,不存在创建  
            File dir = new File(realPath);  
            if (!dir.exists()) {  
                dir.mkdirs();  
            }  
            //第一个参数是文件 ,第二个参数是文件在服务器中的位置,fileUtils 是org.apache.commons.io.FileUtils提供好的现成的方法  
            //FileUtils.copyFile(upload,new File(dir,uploadFileName));//copy文件,服务器中有备份文件  
            FileUtils.moveFile(upload,new File(dir,uploadFileName));//剪切文件,推荐使用,无备份文件 
            
        } catch (IOException e) {  
            e.printStackTrace();  
            return "error";  
        }  
        return "success";  
    }
    
    public String dealExcel() {
    	//用来装staff的对象 转化后存到数据库
    	List<Staff> stafflist = new ArrayList<Staff>();
    	//关联excle表,创建excel操作对象
    	try {
			HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(upload));
			//拿到excel表中的sheet  
		      HSSFSheet sheetAt = workbook.getSheetAt(0);
		      // 循环遍历sheet,拿到表中的每一行
		        for (Row row : sheetAt) {
		            //去掉标题行
		            if(row.getRowNum()==0){
		                continue;
		            }
		            //拿到每一行并封装成对象,注意拿到的都是Sting类型
		            String name = row.getCell(0).getStringCellValue();
		            String username = row.getCell(1).getStringCellValue();
		            String department = row.getCell(2).getStringCellValue();
		            String role = row.getCell(3).getStringCellValue();
		            String usedname = row.getCell(4).getStringCellValue();
		            String englishname = row.getCell(5).getStringCellValue();
		            String sex = row.getCell(6).getStringCellValue();
		            String number = row.getCell(7).getStringCellValue();
		            String jobnumber = row.getCell(8).getStringCellValue();
		            String positon = row.getCell(9).getStringCellValue();
		            String idcard = row.getCell(10).getStringCellValue();
		            String birthday = row.getCell(11).getStringCellValue();
		            String age = row.getCell(12).getStringCellValue();
		            String province = row.getCell(13).getStringCellValue();
		            String city = row.getCell(14).getStringCellValue();
		            String nation = row.getCell(15).getStringCellValue();
		            String maritalstatus = row.getCell(16).getStringCellValue();
		            String politicsstatus = row.getCell(17).getStringCellValue();
		            String workingstate = row.getCell(18).getStringCellValue();
		            String partytime = row.getCell(19).getStringCellValue();
		            String tellnumber = row.getCell(20).getStringCellValue();
		            String phonenumber = row.getCell(21).getStringCellValue();
		            String msn = row.getCell(22).getStringCellValue();
		            String qq = row.getCell(23).getStringCellValue();
		            String email = row.getCell(24).getStringCellValue();
		            String adress = row.getCell(25).getStringCellValue();
		            String joinworktime = row.getCell(26).getStringCellValue();
		            String othernumer = row.getCell(27).getStringCellValue();
		            String tatolworkage = row.getCell(28).getStringCellValue();
		            String health = row.getCell(29).getStringCellValue();
		            String registeradress = row.getCell(30).getStringCellValue();
		            String differentaccount = row.getCell(31).getStringCellValue();
		            String registertype = row.getCell(32).getStringCellValue();
		            String entrytime = row.getCell(33).getStringCellValue();
		            String bank1 = row.getCell(34).getStringCellValue();
		            String personalaccount1 = row.getCell(35).getStringCellValue();
		            String bank2 = row.getCell(36).getStringCellValue();
		            String personalaccount2 = row.getCell(37).getStringCellValue();
		            String educationbackground = row.getCell(38).getStringCellValue();
		            String degree = row.getCell(39).getStringCellValue();
		            String graduatetime = row.getCell(40).getStringCellValue();
		            String major = row.getCell(41).getStringCellValue();
		            String school = row.getCell(42).getStringCellValue();
		            String computerskill = row.getCell(43).getStringCellValue();
		            String foreignlanguage1 = row.getCell(44).getStringCellValue();
		            String foreignlanguage2 = row.getCell(45).getStringCellValue();
		            String foreignlanguage3 = row.getCell(46).getStringCellValue();
		            String flskill1 = row.getCell(47).getStringCellValue();
		            String flskill2 = row.getCell(48).getStringCellValue();
		            String flskill3 = row.getCell(49).getStringCellValue();
		            String speciality = row.getCell(50).getStringCellValue();
		            String profession = row.getCell(51).getStringCellValue();
		            String administrativelevel = row.getCell(52).getStringCellValue();
		            String stafftype = row.getCell(53).getStringCellValue();
		            String duty = row.getCell(54).getStringCellValue();
		            String professionaltitle = row.getCell(55).getStringCellValue();
		            String titlelevel = row.getCell(56).getStringCellValue();
		            String thisjobtime = row.getCell(57).getStringCellValue();
		            String startingsalarytime = row.getCell(58).getStringCellValue();
		            String annual_leave = row.getCell(59).getStringCellValue();
		            String resume = row.getCell(60).getStringCellValue();
		            String guaranteerecords = row.getCell(61).getStringCellValue();
		            String dutystatus = row.getCell(62).getStringCellValue();
		            String socialsecurity = row.getCell(63).getStringCellValue();
		            String medicalrecord = row.getCell(64).getStringCellValue();
		            String remark = row.getCell(65).getStringCellValue();
		            String testfield = row.getCell(66).getStringCellValue();
		            //封装成对象
		            Staff staff = new Staff(number, name, username, department, role, usedname, englishname, sex,
		            		jobnumber, positon, idcard, birthday, age, province, city, 
		            		nation, maritalstatus, politicsstatus, workingstate, partytime, 
		            		tellnumber, phonenumber, msn, qq, email, adress, joinworktime, 
		            		othernumer, tatolworkage, health, registeradress, differentaccount,
		            		registertype, entrytime, bank1, personalaccount1,
		            		bank2, personalaccount2, educationbackground, degree, 
		            		graduatetime, major, school, computerskill, foreignlanguage1, 
		            		foreignlanguage2, foreignlanguage3, flskill1, flskill2, flskill3, 
		            		speciality, profession, administrativelevel, stafftype, duty, 
		            		professionaltitle, titlelevel, thisjobtime, startingsalarytime, annual_leave, resume,
		            		guaranteerecords, dutystatus, socialsecurity, medicalrecord, remark, testfield);
		            //存储到集合
		            stafflist.add(staff);
		    }
		        //调用服务层,将集合中的元素取出存到数据库即可
		        service.importXls(stafflist);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    	return null;
    }
}
