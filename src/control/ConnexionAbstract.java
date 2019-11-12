package control;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import configuration.*;

public abstract class ConnexionAbstract {
    protected Connection conn;

    protected Object result;

    public Object getResult() {
        return result;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public ConnexionAbstract() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Object res = null;
        try {
            conn= DriverManager.getConnection(
                    Config.URL,"root","");

            onConnect();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        onDestroy();

    }

    public void onConnect(){

    }
    public void onDestroy(){
        try {
            this.conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
