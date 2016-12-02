package bankAccount.resources;

import bankAccount.data.BankAccountDataAccess;
import bankAccount.services.AccountService;
import org.glassfish.jersey.client.JerseyClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("account")
public class AccountResource extends JerseyClient {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createAccount(
            @FormParam("Kunden_ID") Integer Kunden_ID,
            @FormParam("Dispo") Float Dispo,
            @FormParam("Guthaben") Float Guthaben,
            @FormParam("Hauptkonto") Integer Hauptkonto
    ) {

        //data access create account call
        BankAccountDataAccess dao = new BankAccountDataAccess();
        dao.createAccount(Kunden_ID, Dispo, Guthaben, Hauptkonto);

        AccountService accountService = new AccountService(Kunden_ID);
        return Response.ok(accountService).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAccount(
            @FormParam("Kunden_ID") Integer Kunden_ID,
            @FormParam("Dispo") Float Dispo,
            @FormParam("Guthaben") Float Guthaben
    ) {

        // DataAccess update method call.

        AccountService accountService = new AccountService(Kunden_ID);
        return Response.ok(accountService).build();
    }

}
