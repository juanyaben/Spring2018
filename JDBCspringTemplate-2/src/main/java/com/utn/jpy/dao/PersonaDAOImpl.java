package com.utn.jpy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.utn.jpy.beans.Persona;

@Repository
public class PersonaDAOImpl implements PersonaDAO {

	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private Connection con = null;
	private PreparedStatement stmt = null;

	@Override
	public Persona buscar(int idPersona) throws Exception {

		Persona persona = null;
		try {

			con = dataSource.getConnection();

			stmt = con.prepareStatement("SELECT * FROM `personas` WHERE ID= ?");
			stmt.setInt(1, idPersona);

			ResultSet rs = stmt.executeQuery();

			while (rs.next() == true) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				persona = new Persona(id, nombre);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return persona;
	}

	public int cantidadDePersonas() {
		String sql = "SELECT COUNT(*) FROM personas";
		return jdbcTemplate.queryForInt(sql);

	}

	public String getNombrePersona(int idPersona) {
		String sql = "SELECT nombre FROM personas WHERE ID=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { idPersona }, String.class);
	}

	
	
	@Override
	public Persona buscarPersona(int idPersona) throws Exception {
		String sql = "SELECT * FROM `personas` WHERE ID= ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { idPersona }, new PersonaMapper());
	}
	
	
	private static final class PersonaMapper implements RowMapper<Persona>{

		@Override
		public Persona mapRow(ResultSet resulSet, int rowNumber) throws SQLException {
			Persona persona = new Persona();
			persona.setId(resulSet.getInt("id"));
			persona.setNombre(resulSet.getString("nombre"));
			return persona;
		}
		
		
	}


	@Override
	public List<Persona> buscarPersonas() throws Exception {
		String sql = "SELECT * FROM `personas`";
		return jdbcTemplate.query(sql, new PersonaMapper());
	}

}
