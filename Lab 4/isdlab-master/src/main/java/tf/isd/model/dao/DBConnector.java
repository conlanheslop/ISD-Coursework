/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tf.isd.model.dao;

/**
 *
 * @author yih
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector extends DB{
    public DBConnector() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        conn = DriverManager.getConnection(URL+db, dbuser, dbpass);
    }

    public Connection openConnection(){
        return this.conn;
    }

    public void closeConnection() throws SQLException {
        this.conn.close();
    }
}
