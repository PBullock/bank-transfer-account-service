package bankAccount.resources;

import bankAccount.services.PaymentService;
import org.glassfish.jersey.client.JerseyClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("transfer")
public class PaymentResource extends JerseyClient {

    @Path("/in")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response transferIn(
            @QueryParam("kontonummer") Integer kontonummmer,
            @QueryParam("betrag") Float betrag

        ) {

        //send request to register micro service
        //

        PaymentService paymentService = new PaymentService(kontonummmer, betrag);
        return Response.ok(paymentService).build();
    }

    @Path("/out")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response transferOut(
            @QueryParam("kontonummer") Integer kontonummmer,
            @QueryParam("betrag") Float betrag
    ) {

        //send request to register micro service
        //

        PaymentService paymentService = new PaymentService(kontonummmer, betrag);
        return Response.ok(paymentService).build();
    }
}
