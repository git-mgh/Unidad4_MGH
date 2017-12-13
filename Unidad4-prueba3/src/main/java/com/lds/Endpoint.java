package com.lds;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/servlet")
public class Endpoint {

	@GET
	@Path("/1")
	@Produces("text/plain")
	public String servlet1() {
		return "Hola servlet 11111";
	}

	@GET
	@Path("/2")
	@Produces("text/plain")
	public String servlet2() {
		return "Hola servlet 2222";
	}
}
