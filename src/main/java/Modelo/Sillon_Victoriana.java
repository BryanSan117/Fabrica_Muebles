package Modelo;

import Interface.iSillon;

public class Sillon_Victoriana implements iSillon {

	@Override
	public void Patas() {
		System.out.println("Sillón Victoriana, con patas que no rayan el suelo");
		
	}

	@Override
	public void Asiento() {
		System.out.println("Sillón Victoriana, que tiene un asiento reconfortante");
		
	}
	

}
