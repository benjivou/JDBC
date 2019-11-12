package control;

import model.Produit;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class UpdateProduit extends ConnexionAbstract {



    public UpdateProduit() throws ClassNotFoundException {
        super();
    }

    @Override
    public void onConnect() {
        super.onConnect();



        try {
            String str = "SELECT id,typeProduit,prix FROM Produit";

            Statement stm = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

            // execute the request
            ResultSet rs = stm.executeQuery(str);

            // modify and send
            while (rs.next()){

                rs.updateInt(3,rs.getInt(3)+10);
                System.out.println(rs.getInt(3 ) );
                rs.updateRow();
            }





        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
