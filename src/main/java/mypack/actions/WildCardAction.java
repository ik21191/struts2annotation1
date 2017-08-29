package mypack.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

@Namespaces(value={@Namespace("/User"),@Namespace("/")})

public class WildCardAction {
	private String prm;
	@Action(value = "/wild/*",params={"prm","{1}"}, results = {
			@Result(name = "SUCCESS", location = "/welcome.jsp"),
			@Result(name = "ERROR", location = "/error.jsp"),
			@Result(name = "REDIRECT", location = "http://localhost:8080", type = "redirect")})
	public String execute() throws Exception {
		System.out.println("Value of parameter is : " + prm);
		return "SUCCESS";
	}
	public String getPrm() {
		return prm;
	}
	public void setPrm(String prm) {
		this.prm = prm;
	}
	
}
