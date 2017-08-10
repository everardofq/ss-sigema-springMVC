package com.sigema.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigema.beans.Camiseta;
import com.sigema.beans.Equipo;
import com.sigema.beans.Jugador;
import com.sigema.beans.Marca;
import com.sigema.dao.DAOJugador;

@Service
public class ServiceJugadorImpl implements ServiceJugador {
	
	@Autowired
	private DAOJugador daoJugador;
	
	public void registrarMarca(Marca marca) throws Exception {
		try {
			daoJugador.registrarMarca(marca);
		} catch (Exception e) {
			throw e;
		}
		
	}

	public void registrarCamiseta(Camiseta camiseta) throws Exception {
		try {
			daoJugador.registrarCamiseta(camiseta);
		} catch (Exception e) {
			throw e;
		}
		
	}

	public void registrarEquipo(Equipo equipo) throws Exception {
		try {
			daoJugador.registrarEquipo(equipo);
		} catch (Exception e) {
			throw e;
		}
		
	}

	public void registrarJugador(Jugador jugador) throws Exception {
		try {
			daoJugador.registrarJugador(jugador);
		} catch (Exception e) {
			throw e;
		}
	}


}
