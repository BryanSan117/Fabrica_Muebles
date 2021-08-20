package edu.uspg;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import Fabrica.Fabrica_Modernos;
import Fabrica.Fabrica_Oficina;
import Interface.iSilla;



@SpringBootApplication
public class Fabrica_MueblesApplication {
		
	public static void main(String[] args) {
		
		Fabrica_Modernos fabrica_M = new Fabrica_Modernos();
		
		iSilla silla = fabrica_M.getiSilla("Silla");
		
		silla.Asiento();
		silla.Patas();
		
		
	}

}
