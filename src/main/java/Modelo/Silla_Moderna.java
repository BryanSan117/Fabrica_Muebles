package Modelo;

import Interface.iSilla;

public class Silla_Moderna implements iSilla {

	@Override
	public void Patas() {
		System.out.println("Silla moderna tiene patas con nuevos materiales");
		
	}

	@Override
	public void Asiento() {
		System.out.println("Silla moderna tiene asiento personalizado e igual comididad");
		
	}
	

}
