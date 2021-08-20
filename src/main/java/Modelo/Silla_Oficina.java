package Modelo;

import Interface.iSilla;

public class Silla_Oficina implements iSilla {

	@Override
	public void Patas() {
		System.out.println("Silla de trabajo que tiene una base con ruedas");
		
	}

	@Override
	public void Asiento() {
		System.out.println("Silla de trabajo que tiene una siento y respaldo ergonomico");
		
	}
	
	

}
