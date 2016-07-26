package mypack.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

/**
 * Notice the @Action annotation where action and result pages are declared
 * Also notice that we don't need to implement Action interface or extend ActionSupport
 * class, only we need is an execute() method with same signature
 * @author pankaj
 *
 */
@Namespaces(value={@Namespace("/User"),@Namespace("/")})

public class LoginAction {
	
	@Action(value = "login", results = {
			@Result(name = "SUCCESS", location = "/welcome.jsp"),
			@Result(name = "ERROR", location = "/error.jsp") })
	public String execute() throws Exception {
		if("pankaj".equals(getName()) && "admin".equals(getPwd()))
		return "SUCCESS";
		else return "ERROR";
	}
	
	@Action(value = "loginTest", results = {
			@Result(name = "SUCCESS", location = "/welcome.jsp"),
			@Result(name = "ERROR", location = "/error.jsp") })
	public String executeTest() throws Exception {
			return "SUCCESS";
	}
	
	//Java Bean to hold the form parameters
	private String name;
	private String pwd;
	public String getName() {
		System.out.println(name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
