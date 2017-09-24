/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_base1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bryam
 */
public class Conectar {

    public static Connection GetConnetion() throws SQLException {
        Connection conexion = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            String server = "jdbc:mysql://localhost/proyecto";
            String usuarioDB = "root";
            String passwordDB = "";
            conexion = DriverManager.getConnection(server, usuarioDB, passwordDB);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error 1 al conectar" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error 2 al conectar" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error 3 al conectar" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        }
        finally{
            return conexion;
        }
    }
    public void close(){
        
    }
    /*Connection conect = null;
    public Connection conexion(){
        try {
            Class.forName(".com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/proyecto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar"+e);
        }
        return conect;
    }*/
}
