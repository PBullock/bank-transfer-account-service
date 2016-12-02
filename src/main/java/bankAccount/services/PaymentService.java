package bankAccount.services;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class PaymentService
{
    @JsonProperty
    private Integer kontonummer;

    @JsonProperty
    private Float betrag;

    public PaymentService(Integer kontonummer, Float betrag)
    {
        this.kontonummer = kontonummer;
        this.betrag = betrag;
    }

    public Integer getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(Integer kontonummer) {
        this.kontonummer = kontonummer;
    }

    public Float getBetrag() {
        return betrag;
    }

    public void setBetrag(Float betrag) {
        this.betrag = betrag;
    }
}
