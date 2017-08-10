package com.sigema.dao;

import com.sigema.beans.Camiseta;
import com.sigema.beans.Equipo;
import com.sigema.beans.Jugador;
import com.sigema.beans.Marca;

public interface DAOJugador {
	public void registrarMarca(Marca marca) throws Exception;
	public void registrarCamiseta(Camiseta camiseta) throws Exception;
	public void registrarEquipo(Equipo equipo) throws Exception;
	public void registrarJugador(Jugador jugador) throws Exception;
}
