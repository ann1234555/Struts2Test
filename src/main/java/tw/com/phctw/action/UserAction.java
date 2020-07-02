package tw.com.phctw.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import tw.com.phctw.entity.Userinfo;
import tw.com.phctw.service.IUserService;

@ParentPackage("basePackage")
@Namespace("/")
@Action(value="userAction")
@Result(name="saveok",location="/index1.jsp")
public class UserAction {
	
	@Autowired
	private IUserService userService;
	
	public IUserService getUserService() {
	return userService;
	}
	
	
	private Userinfo user;
	
	public Userinfo getUser() {
	return user;
	}
	public void setUser(Userinfo user) {
	this.user = user;
	}
	public String TestStruts()
	{
	System.out.println(user.getUsername());
	userService.saveUser(user);
	return "saveok";
	}
}
