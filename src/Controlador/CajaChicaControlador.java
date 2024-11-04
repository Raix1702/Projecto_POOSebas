package Controlador;

import Conection.Conection;
import Registrar_Caja_Chica.RegistroCChica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CajaChicaControlador {

    public void insertar(RegistroCChica caja){
        String sql = "INSERT INTO RegistroCChica (codigo, FechaCreacion, TipoCaja, Departamento, MontoInicial) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, ccaja);
            pstmt.setString(2, fcrea);
            pstmt.setString(3, tcaja);
            pstmt.setString(4, depart);
            pstmt.setDouble(5, minicial);
            pstmt.executeUpdate();


        } catch (SQLException e) {
            System.out.println("Error al insertar datos: " + e.getMessage());
        }
    }
}
