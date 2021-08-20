package Modelo;

import Interface.iSillon;

public class Sillon_Oficina implements iSillon {

	@Override
	public void Patas() {
		System.out.println("Sillon de oficina con patas cubiertas de goma");
		
	}

	@Override
	public void Asiento() {
		System.out.println("Sillon de oficina con asiento tradicional");
		
	}

}
