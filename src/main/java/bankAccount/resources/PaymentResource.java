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
            @QueryParam("Konto") Integer id
        ) {

        //send request to register micro service
        //

        PaymentService paymentService = new PaymentService(id);
        return Response.ok(paymentService).build();
    }

    @Path("/out")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response transferOut(
            @QueryParam("id") Integer id
    ) {

        //send request to register micro service
        //

        PaymentService paymentService = new PaymentService(id);
        return Response.ok(paymentService).build();
    }
}
