package bankAccount.resources;

import bankAccount.services.AccountService;
import bankAccount.services.PaymentService;
import org.glassfish.jersey.client.JerseyClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("account")
public class AccountResource extends JerseyClient {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createAccount(
            @QueryParam("Kunden_ID") Integer Kunden_ID,
            @QueryParam("Dispo") Float Dispo,
            @QueryParam("Guthaben") Float Guthaben
    ) {

        //data access create account call
        //

        AccountService accountService = new AccountService();
        return Response.ok(accountService).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAccount(
            @QueryParam("Kunden_ID") Integer Kunden_ID,
            @QueryParam("Dispo") Float Dispo,
            @QueryParam("Guthaben") Float Guthaben
    ) {

        // DataAccess update method call.

        AccountService accountService = new AccountService();
        return Response.ok(accountService).build();
    }

}
