package co.com.tarjeta.rest.services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.tarjeta.business.TestEJB;

@RequestScoped
@Path("test")
public class TarjetaServices {

	@Inject
	TestEJB testEjb;
	
	@Path("greet")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public String greet() {
		return testEjb.greet();
	}
	
}
