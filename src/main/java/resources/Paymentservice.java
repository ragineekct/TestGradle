package resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Path("/payment")
@Api(value = "payment")

public class Paymentservice {

	@GET
	@Path("/getpayment/{id}")
	@Consumes({ "aplication/json", "appliction/xml" })
	@Produces({ "aplication/json", "appliction/xml" })

	@ApiOperation(value = "get payment by id", response = Paymentservice.class)
	public Paymentservice getPayment(@PathParam("id") int id) {
		
		return null;
		
	}

}
