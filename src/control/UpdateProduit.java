package control;

import model.Produit;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class GetProduit extends ConnexionAbstract {



    public GetProduit() throws ClassNotFoundException {
        super();
    }

    @Override
    public void onConnect() {
        super.onConnect();



        try {
            String str = "SELECT id,typeProduit,prix FROM Produit";

            PreparedStatement stm = this.conn.prepareStatement(str,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

            // execute the request
            ResultSet rs = stm.executeQuery(str);

            // modify and send
            while (rs.next()){
                rs.updateInt("id",rs.getInt(2)+10);
                rs.insertRow();
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
