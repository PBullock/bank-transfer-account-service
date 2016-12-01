package bankAccount;

import bankAccount.resources.AccountResource;
import bankAccount.resources.PaymentResource;
import io.dropwizard.Application;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import javax.ws.rs.client.Client;


public class BankAccountApp extends Application<BankAccountConf>
{

    public static void main(String[] args) throws Exception
    {
        new BankAccountApp().run(args);
    }

    @Override
    public void run(BankAccountConf configuration, Environment environment) throws Exception
    {
        final Client client = setupClient(environment);
        environment.jersey().register(new PaymentResource());
        environment.jersey().register(new AccountResource());

    }

    private Client setupClient(Environment environment)
    {
        return new JerseyClientBuilder(environment).build("REST Client");
    }
}
