package bankAccount;

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



    }

    private Client setupClient(Environment environment)
    {
        return new JerseyClientBuilder(environment).build("REST Client");
    }
}
