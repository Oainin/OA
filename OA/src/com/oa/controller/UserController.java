package com.oa.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.google.gson.Gson;
import com.oa.entity.BackGround;
import com.oa.entity.PunchCard;
import com.oa.entity.Result;
import com.oa.entity.UserApp;
import com.oa.entity.UserEntity;
import com.oa.service.UserService;
import com.oa.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;


@Controller
@Scope("prototype")
public class UserController extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private UserService service;
	private UserEntity user;
	private File appphoto;
	private UserApp app;
	private PunchCard card;
	private String appphotoFileName;
	private File backphoto;
	private String backphotoFileName;
	HttpServletRequest request=ServletActionContext.getRequest(); 
	HttpServletResponse response=ServletActionContext.getResponse();
	UserEntity userall = (UserEntity) ServletActionContext.getRequest().getSession().getAttribute("USER");

	@Resource(name = "userServiceImp")
	public void setService(UserService service) {
		this.service = service;
	}

	public PunchCard getCard() {
		return card;
	}

	public void setCard(PunchCard card) {
		this.card = card;
	}

	public UserApp getApp() {
		return app;
	}

	public void setApp(UserApp app) {
		this.app = app;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public String login() {
		return "login";

	}

	public File getAppphoto() {
		return appphoto;
	}

	public void setAppphoto(File appphoto) {
		this.appphoto = appphoto;
	}

	public String getAppphotoFileName() {
		return appphotoFileName;
	}

	public void setAppphotoFileName(String appphotoFileName) {
		this.appphotoFileName = appphotoFileName;
	}

	
	
	public File getBackphoto() {
		return backphoto;
	}

	public void setBackphoto(File backphoto) {
		this.backphoto = backphoto;
	}

	public String getBackphotoFileName() {
		return backphotoFileName;
	}

	public void setBackphotoFileName(String backphotoFileName) {
		this.backphotoFileName = backphotoFileName;
	}

	// 主页
	public String gindex() {
		return "gindex";
	}

	public String about() {
		return "about";
	}

	public String contact() {
		return "contac";
	}

	public String detail() {
		return "detail";
	}

	public String honor() {
		return "honor";
	}

	public String job() {
		return "job";
	}

	public String news() {
		return "news";
	}

	public String product() {
		return "product";
	}

	public String talent() {
		return "talent";
	}

	// 个人信息修改
	public String infoup() {
		return "infoup";
	}
	//个人信息界面跳转
	public String message() {
		return "message";
		
	}

	public void backgroundDo() throws IOException {
		String uuid1=UUID.randomUUID().toString();
		backphotoFileName=backphotoFileName.substring(backphotoFileName.lastIndexOf("."));
		FileUtils.copyFile(backphoto, new File("D://upDo/"+uuid1+backphotoFileName));
		Gson gson=new Gson();
		Result<BackGround> result=new Result<>();
		if(service.backinsert(userall.getUid(), uuid1+backphotoFileName)) {
          result.setFlag(true);
		}else {
			result.setFlag(false);
		}
		response.getWriter().print(gson.toJson(result));
	}
	public void testpic() throws IOException {
	    String cc=ServletActionContext.getRequest().getParameter("backurls");
	    System.out.println(cc);
	    FileInputStream fis = null;  
	    File file = new File("D://upDo/"+cc);  
	    //File file = new File("home/images/test.png"); 服务器目录和本地图片的区别是图片路径  
	    fis = new FileInputStream(file);  
	    ServletActionContext.getResponse().setContentType("image/jpg"); //设置返回的文件类型     
	    ServletActionContext.getResponse().setHeader("Access-Control-Allow-Origin", "*");//设置该图片允许跨域访问  
	    IOUtils.copy(fis, ServletActionContext.getResponse().getOutputStream());   
	} 
	
	// 上传文件处理
	public void upDo() throws IOException {
		ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
		Result<UserApp> result = new Result<>();
		UserApp apps = new UserApp();
		Gson gson = new Gson();
		try {
			UserEntity user = (UserEntity) ServletActionContext.getRequest().getSession().getAttribute("USER");
			String uuid = UUID.randomUUID().toString();
			appphotoFileName = appphotoFileName.substring(appphotoFileName.lastIndexOf("."));
			apps.setAppimg("/OA/update/" + uuid + appphotoFileName);
			apps.setAppname(app.getAppname());
			apps.setAppurl(app.getAppurl());
			apps.setUid(user.getUid());
			apps.setStatus(app.getStatus());
			apps.setApptime(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(Calendar.getInstance().getTime()));
			if (service.appinsert(apps)) {
				FileUtils.copyFile(appphoto, new File(ServletActionContext.getServletContext().getRealPath("/update")
						+ "/" + uuid + appphotoFileName));
				File file = new File("D://upDo");
				if (file.exists()) {
					file.mkdirs();
				}
				/* ImageIO.read(input) */
				copyFile("D://apache-tomcat-8.5.20-windows-x64/apache-tomcat-8.5.20/webapps/OA/update/" + uuid
						+ appphotoFileName, "D://upDo" + uuid + appphotoFileName);
				result.setFlag(true);
				result.setContent("上传成功！");
			}
		} catch (IOException e) {
			result.setFlag(false);
			result.setContent("尴尬上传失败");
		}
		ServletActionContext.getResponse().getWriter().print(gson.toJson(result));
	}

	// 用户所有信息获取
	public void messge() throws IOException {
		ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
		UserEntity user = (UserEntity) ServletActionContext.getRequest().getSession().getAttribute("USER");
		Result<UserEntity> result = new Result<>();
		String c = "";
		Gson gson = new Gson();
		if (user != null) {
			result.setT(user);
			result.setFlag(true);
			result.setContent("获取成功");

			switch (user.getAdmin()) {
			case 0:
				c = "员工";

				break;
			case 1:
				c = "管理员";

				break;
			case 2:
				c = "总经理";

				break;
			case 3:
				c = "项目经理";
				break;
			default:
				break;
			}
			result.setList2(service.selectbackall(userall.getUid()));
			result.setList(service.appselect(c));
		} else {
			result.setFlag(false);
			result.setContent("尴尬");
		}
		ServletActionContext.getResponse().getWriter().print(gson.toJson(result));
		index();
	}

	// 主页验证，跳转主页面
	public String index() {
		if (userall != null) {
			user = (UserEntity) ServletActionContext.getRequest().getSession().getAttribute("USER");

			return SUCCESS;
		} else {
			return "login";
		}
	}

	// 打卡处理
	public void cardDo() throws IOException {
		Result<PunchCard> result = new Result<>();
		Gson gson = new Gson();
		String a = ServletActionContext.getRequest().getParameter("location");
		String b = ServletActionContext.getRequest().getParameter("local");
		System.out.println(a);
		if (service.insertpunchcard(a, b, userall.getUid())) {
			result.setFlag(true);
		} else {
			result.setFlag(false);
		}
		ServletActionContext.getResponse().getWriter().print(gson.toJson(result));

	}

	// 注销跳转登录页面
	public String clean() {
		ServletActionContext.getRequest().getSession().invalidate();

		return "login";

	}

	// 打卡页面
	public String card() {
		return "card";
	}

	// 打卡功能
	public void dcard() throws IOException {
		Gson gson = new Gson();
		Result<PunchCard> result = new Result<>();
		if (service.dcardDo(userall.getUid())) {
			result.setFlag(true);
		} else {
			result.setFlag(false);
		}
		ServletActionContext.getResponse().getWriter().print(gson.toJson(result));
	}

	// 删除软件
	public void closeimg() throws IOException {
		Result<UserApp> result = new Result<>();
		Gson gson = new Gson();
		String a = ServletActionContext.getRequest().getParameter("aid");
		int b = Integer.parseInt(a);
		if (service.closeimg(b)) {
			result.setFlag(true);
		} else {
			result.setFlag(false);
		}
		ServletActionContext.getResponse().getWriter().print(gson.toJson(result));
	}

	// 登录处理
	public String loginDo() {
		UserEntity users = service.login(user.getUsername(), user.getPassword());
		if (users != null) {
			ServletActionContext.getRequest().getSession().setAttribute("USER", users);
			user = (UserEntity) ServletActionContext.getRequest().getSession().getAttribute("USER");

			return SUCCESS;
		}

		else {
			return "login";
		}

	}

	// 文件拷贝，上传的图片文件
	public static void copyFile(String from, String to) {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(from);
			out = new FileOutputStream(to);
			byte[] bytes = new byte[1024 * 4];
			int len = 0;
			while ((len = in.read(bytes)) != -1) {
				out.write(bytes, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void regDo() throws IOException {
		Gson gson = new Gson();
		boolean falg = false;
		if (StringUtil.objectIsNull(user)) {
			falg = service.reg(user);
		}
		ServletActionContext.getResponse().getWriter().print(gson.toJson(falg));
	}

	// 查询所有功能
	public void allapp() throws IOException {
		ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
		Gson gson = new Gson();
		Result<UserEntity> result = new Result<>();
		String c = "";
		switch (userall.getAdmin()) {
		case 0:
			c = "员工";
			break;
		case 1:
			c = "管理员";

			break;
		case 2:
			c = "总经理";

			break;
		case 3:
			c = "项目经理";
			break;
		default:
			break;
		}
		if (userall.getAdmin() == 1) {
			if (service.appall(userall.getUid()).size() > 0) {
				result.setFlag(true);
				result.setList(service.appall(userall.getUid()));
				result.setT(userall);
			} else {
				result.setFlag(false);
				result.setContent("尴尬");
			}
		} else {
			if (service.userall(c).size() > 0) {
				result.setFlag(true);
				result.setList(service.userall(c));
				result.setT(userall);

			} else {
				result.setFlag(false);
				result.setContent("尴尬");
			}
		}

		ServletActionContext.getResponse().getWriter().print(gson.toJson(result));
	}
}