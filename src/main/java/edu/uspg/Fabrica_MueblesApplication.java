package edu.uspg;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import Fabrica.Fabrica_Modernos;
import Interface.iSilla;



@SpringBootApplication
public class Fabrica_MueblesApplication {
		
	public static void main(String[] args) {
		
		Fabrica_Modernos fabrica = new Fabrica_Modernos();
		
		iSilla silla = fabrica.getiSilla("Silla");
		
		silla.Asiento();
		silla.Patas();
	}

}
