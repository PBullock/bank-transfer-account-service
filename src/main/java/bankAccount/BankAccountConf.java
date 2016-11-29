package bankAccount;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class BankAccountConf extends Configuration
{
    @NotEmpty
    private String apiKey;
    @JsonProperty
    public String getApiKey()
    {
        return apiKey;
    }
}
