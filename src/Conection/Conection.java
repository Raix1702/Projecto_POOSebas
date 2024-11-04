/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conection {
    private static final String URL = "jdbc:mysql://localhost:3306/ProjectoPOO";
    private static final String USER = "root";
    private static final String PASSWORD = "sebas1702";

   //lo puse static porque si no no compila :c
    public static Connection getConnection() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Cargar el driver JDBC
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);  // Crear la conexión
            System.out.println("Conexión exitosa a MySQL");
        } catch (SQLException e) {
            System.out.println("Error al conectar a MySQL: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver no encontrado: " + e.getMessage());
        }
        return conexion;
        
        
    }
    public static void main(String[] args) {
        Conection conexion = new Conection();
        conexion.getConnection();
    }



}
