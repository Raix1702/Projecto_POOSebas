package Controlador;

import Conection.Conection;
import Registrar_Caja_Chica.RegistroCChica;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;



public class CajaChicaControlador {

	public void insertar(RegistroCChica caja) {
	    String sql = "{CALL InsertarCaja(?, ?, ?, ?, ?)}";

	    try (Connection conn = Conection.getConnection();
	         CallableStatement stmt = conn.prepareCall(sql)) {  // Usa CallableStatement para procedimientos almacenados

	        // Asignación de parámetros correctos
	        stmt.setString(1, caja.getCcaja());       // Código de caja
	        stmt.setString(2, caja.getFcrea());       // Fecha de creación (debería estar en formato 'yyyy-MM-dd')
	        stmt.setString(3, caja.getTcaja());       // Tipo de caja
	        stmt.setString(4, caja.getDepart());      // Departamento
	        stmt.setDouble(5, caja.getMinicial());    // Monto inicial

	        // Ejecuta el procedimiento almacenado
	        stmt.executeUpdate();
	        System.out.println("Datos insertados exitosamente.");

	    } catch (SQLException e) {
	        System.out.println("Error al insertar datos: " + e.getMessage());
	    }
	}
	
}
