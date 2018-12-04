package com.utn.jpy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.utn.jpy.beans.Persona;


public class JdbcDaoImpl {
	

	private Connection con = null;
	private PreparedStatement stmt = null;
	
	
	public Persona getPersona (int personaId){
		
		Persona persona = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/base_de_datos_persona?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
				con = DriverManager.getConnection(url, "root", "");
				stmt =con.prepareStatement("SELECT * FROM `personas` WHERE ID="+personaId);
				ResultSet rs = stmt.executeQuery();
					while (rs.next() == true) {
						int id = rs.getInt("id");
						String nombre = rs.getString("Nombre");
						persona = new Persona (id, nombre);
					}
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		return persona;		
		
	}

}
