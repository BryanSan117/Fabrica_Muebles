package Modelo;

import Interface.iSilla;

public class Silla_Victoriana implements iSilla {
	
	@Override
	public void Patas() {
		System.out.println("Silla Victoriana con patas estilizadas");
		
	}
	
	@Override
	public void Asiento() {
		System.out.println("Silla Victoria con asiento estilizado y comodo");
	}

}
