package Modelo;

import Interface.iMesa;

public class Mesa_Victoriana implements iMesa {

	@Override
	public void Patas() {
		System.out.println("Mesa victoriana con 3 patas");
		
	}

	@Override
	public void Tablero() {
		System.out.println("Mesa victoriana con tablero redondo");
		
	}

}
