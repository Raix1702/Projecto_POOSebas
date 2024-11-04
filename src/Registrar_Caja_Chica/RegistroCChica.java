
package Registrar_Caja_Chica;
import Conection.Conection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistroCChica{
    private String ccaja,fcrea,tcaja,depart;
    private double minicial;

    public RegistroCChica() {
    }

    public String getCcaja() {
        return ccaja;
    }

    public void setCcaja(String ccaja) {
        this.ccaja = ccaja;
    }

    public String getFcrea() {
        return fcrea;
    }

    public void setFcrea(String fcrea) {
        this.fcrea = fcrea;
    }

    public String getTcaja() {
        return tcaja;
    }

    public void setTcaja(String tcaja) {
        this.tcaja = tcaja;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public double getMinicial() {
        return minicial;
    }

    public void setMinicial(double minicial) {
        this.minicial = minicial;
    }

    
    
    public void Bd(){
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