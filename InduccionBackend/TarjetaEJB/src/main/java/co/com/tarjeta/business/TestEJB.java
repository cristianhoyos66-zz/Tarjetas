package co.com.tarjeta.business;

import javax.annotation.Resource;
import javax.ejb.Stateless;

@Stateless
public class TestEJB {
	
	@Resource(lookup="java:app/AppName")
	private String name;
	
	public String greet() {
		return "Hola mundo" + name;
	}
}
