package bankAccount.services;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Peter on 01/12/2016.
 */
public class AccountService {
        @JsonProperty private Integer Kunden_ID;
        @JsonProperty private Integer Kontonummer;
        @JsonProperty private Float Guthaben;
        @JsonProperty private Float Dispo;

        public AccountService(Integer Kunden_ID){
            this.Kunden_ID = Kunden_ID;
        }
        public AccountService(Integer Kunden_ID, Integer Kontonummer){
            this.Kunden_ID = Kunden_ID;
            this.Kontonummer = Kontonummer;
        }
        public AccountService(Integer Kunden_ID, Float Dispo, Float Guthaben, Integer Kontonummer){
            this.Kunden_ID = Kunden_ID;
            this.Kontonummer = Kontonummer;
            this.Dispo = Dispo;
            this.Guthaben = Guthaben;
        }

        public void setKunden_ID(Integer kunden_ID) {
            Kunden_ID = kunden_ID;
        }

        public Integer getKunden_ID() {
            return Kunden_ID;
        }

    public Integer getKontonummer() {
        return Kontonummer;
    }

    public void setKontonummer(Integer kontonummer) {
        Kontonummer = kontonummer;
    }

    public Float getGuthaben() {
        return Guthaben;
    }

    public void setGuthaben(Float guthaben) {
        Guthaben = guthaben;
    }

    public Float getDispo() {
        return Dispo;
    }

    public void setDispo(Float dispo) {
        Dispo = dispo;
    }
}
