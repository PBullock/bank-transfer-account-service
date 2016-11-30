package bankAccount.services;


import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentService
{
    @JsonProperty
    private Integer Kontonummer;

    @JsonProperty
    private Float Betrag;

    public PaymentService(Integer Kontonummer, Float Betrag)
    {
        this.Kontonummer = Kontonummer;
        this.Betrag = Betrag;
    }

    public Integer getKontonummer() {
        return Kontonummer;
    }

    public void setKontonummer(Integer kontonummer) {
        Kontonummer = kontonummer;
    }

    public Float getBetrag() {
        return Betrag;
    }

    public void setBetrag(Float betrag) {
        Betrag = betrag;
    }
}
