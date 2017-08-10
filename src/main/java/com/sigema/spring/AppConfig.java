package com.sigema.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sigema.beans.Camiseta;
import com.sigema.beans.Equipo;
import com.sigema.beans.Jugador;
import com.sigema.beans.Marca;
import com.sigema.services.ServiceJugador;

public class AppConfig {
	
	public static void main(String [] args){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/utm/xml/beans.xml");//Leemos el archivo de configuracion
		ServiceJugador sj = (ServiceJugador) appContext.getBean(ServiceJugador.class);

		Marca m = new Marca();
		m.setId(5);
		m.setNombre("gol");
		
		Camiseta cam = new Camiseta();
		cam.setId(4);
		cam.setNumero(24);
		cam.setMarca(m);
		
		Equipo eq = new Equipo();
		eq.setId(5);
		eq.setNombre("Club America");
		
		Jugador jug = new Jugador();
		jug.setId(4);
		jug.setNombre("Oribe Peralta");
		jug.setEquipo(eq);
		jug.setCamiseta(cam);
		
		try {
			sj.registrarMarca(m);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
