package edu.uspg;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import Fabrica.Fabrica_Modernos;
import Fabrica.Fabrica_Oficina;
import Fabrica.Fabrica_Victorianos;
import Interface.iMesa;
import Interface.iSilla;
import Interface.iSillon;



@SpringBootApplication
public class Fabrica_MueblesApplication {
		
	public static void main(String[] args) {
		
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("************************************************");
		
		Fabrica_Modernos fabrica_M = new Fabrica_Modernos();
		
		iSilla silla = fabrica_M.getiSilla("Silla");
		
		silla.Asiento();
		silla.Patas();
		
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("************************************************");
		
		Fabrica_Oficina fabrica_O = new Fabrica_Oficina();
		
		iMesa mesa = fabrica_O.getiMesa("Mesa");
		
		mesa.Patas();
		mesa.Tablero();
		
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("************************************************");
		
		Fabrica_Victorianos fabrica_V = new Fabrica_Victorianos();
		
		iSillon sillon = fabrica_V.getiSillon("Sillon");
		
		sillon.Asiento();
		sillon.Patas();
		
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("************************************************");
	}

}
