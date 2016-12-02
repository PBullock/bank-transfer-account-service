package bankAccount.data;

import bankAccount.services.AccountService;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Peter on 14.06.2016.
 */
public class BankAccountDataAccess extends DataAccess {

    public BankAccountDataAccess() {
        super();

    }

    public void transferIn() {

    }

    public void transferOut(){

    }

    public AccountService createAccount(Integer Kunden_ID, Float Dispo, Float Guthaben, Integer Hauptkonto) {
        AccountService account = null;
        try {
            Connection conn = this.getConnection();

            String sql = "INSERT into konto (Kunden_ID, Dispo, Guthaben, Kontonummer, Hauptkonto) VALUES ( ?, ?, ?, ?, ?);";


            Random rand = new Random();
            Integer Kontonummer = rand.nextInt(9999999);

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, Kunden_ID);
            stmt.setFloat(2, Dispo);
            stmt.setFloat(3, Guthaben);
            stmt.setInt(4, Kontonummer);
            stmt.setInt(5, Hauptkonto);
            stmt.execute();

            String kontoSql = " SELECT * FROM konto WHERE (SELECT max(created) FROM konto) = created";
            Statement lastKonto = conn.createStatement();
            lastKonto.execute(kontoSql);
            ResultSet r = lastKonto.getResultSet();

            while(r.next()){
                 account = new AccountService(
                        r.getInt("Kunden_ID"),
                        r.getFloat("Dispo"),
                        r.getFloat("Guthaben"),
                        r.getInt("Kontonummer")
                );
            }


        } catch (SQLException e) {

            e.printStackTrace();

        }finally {
            this.closeConnection();
        }
        return account;

    }

    public void updateAccount(){

    }



}
