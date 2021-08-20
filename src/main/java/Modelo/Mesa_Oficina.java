package Modelo;

import Interface.iMesa;

public class Mesa_Oficina implements iMesa {

	@Override
	public void Patas() {
		System.out.println("Mesa de oficina con 3 patas ");
		
	}

	@Override
	public void Tablero() {
		System.out.println("Mesa de oficina con forma de ´L´");
		
	}

}
