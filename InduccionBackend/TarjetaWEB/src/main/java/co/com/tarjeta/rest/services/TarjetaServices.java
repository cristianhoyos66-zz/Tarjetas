package co.com.tarjeta.rest.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.tarjeta.business.TarjetaBusiness;
import co.com.tarjeta.business.TestEJB;
import co.com.tarjeta.dto.TarjetaDTO;
import co.com.tarjeta.entities.Tarjeta;

@RequestScoped
@Path("test")
public class TarjetaServices {

	@Inject
	TestEJB testEjb;
	
	@Inject
	TarjetaBusiness tarjetaBusiness;
	
	@Path("greet")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public String greet() {
		return testEjb.greet();
	}
	
	@Path("getAllCards")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<TarjetaDTO> getAllCards() {
		return tarjetaBusiness.getAllCards();
	}
	
}
