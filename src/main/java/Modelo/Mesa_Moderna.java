package Modelo;

import Interface.iMesa;

public class Mesa_Moderna implements iMesa{

	@Override
	public void Patas() {
		System.out.println("Mesa moderna con patas cilindricas i franjas doradas");
		
	}

	@Override
	public void Tablero() {
		System.out.println("Mesa moderna con tablero de vidrio");
		
	}

}
