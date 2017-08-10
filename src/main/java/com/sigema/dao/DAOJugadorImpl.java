package com.sigema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sigema.beans.Camiseta;
import com.sigema.beans.Equipo;
import com.sigema.beans.Jugador;
import com.sigema.beans.Marca;

@Repository
public class DAOJugadorImpl implements DAOJugador {

	@Autowired
	private DataSource dataSource;
	
	private static final String INSERT_JUGADOR = "INSERT INTO jugador (id,nombre,id_equipo,id_camiseta) VALUES(?,?,?,?)";
	private static final String INSERT_MARCA = "INSERT INTO marca(id,nombre) VALUES (?,?)";
	private static final String INSERT_CAMISETA = "INSERT INTO camiseta (id,numero,id_Marca) values(?,?,?)";
	private static final String INSERT_EQUIPO="INSERT INTO equipo (id,nombre) values (?,?)";
	
	public void registrarMarca(Marca marca) throws Exception {
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(INSERT_MARCA);
			
			ps.setInt(1,marca.getId());
			ps.setString(2, marca.getNombre());
			
			int rwa = ps.executeUpdate();
			if(rwa == 1)
				System.out.println("Marca agregada Correctamente");
			ps.close();
			
			
		} catch (Exception e) {
			throw e;
		}finally {
			if(conn != null){
				conn.close();
			}
		}
		
	}

	public void registrarCamiseta(Camiseta camiseta) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn =  dataSource.getConnection();
			ps =  conn.prepareStatement(INSERT_CAMISETA);
			
			ps.setInt(1, camiseta.getId());
			ps.setInt(2, camiseta.getNumero());
			ps.setInt(3, camiseta.getMarca().getId());
			int rwa =  ps.executeUpdate();
			if(rwa == 1)
				System.out.println("Camiseta agregada correctamente");
			ps.close();
			
		} catch (Exception e) {
			throw e;
		}finally {
			if(conn != null)
			{
				conn.close();
			}
		}
	}

	public void registrarEquipo(Equipo equipo) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(INSERT_EQUIPO);
			
			ps.setInt(1, equipo.getId());
			ps.setString(2, equipo.getNombre());
			System.out.println("INSERT_EQUIPO: "+ps.toString());
			int rowsAfected = ps.executeUpdate();
			if(rowsAfected == 1)
				System.out.println("Equipo Agregado Correctamente");
			ps.close();
			
			if(rowsAfected == 1)
				System.out.println("Equipo agregado correctamente");
			
		} catch (Exception e) {
			throw e;
		}finally {
			if(conn != null){
				conn.close();
			}
		}
		
	}

	public void registrarJugador(Jugador jugador) throws Exception {
		Connection conn=null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(INSERT_JUGADOR);
			ps.setInt(1, jugador.getId());
			ps.setString(2, jugador.getNombre());
			ps.setInt(3, jugador.getEquipo().getId());
			ps.setInt(4, jugador.getCamiseta().getId());
			
			int rsa = ps.executeUpdate();
			
			if(rsa == 1)
				System.out.println("Jugador agregado correctamente");
			ps.close();
			
		} catch (Exception e) {
			throw e;
		}finally {
			if(conn != null )
			{
				conn.close();
			}
		}
		
	}

}
