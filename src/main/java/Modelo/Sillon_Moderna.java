package Modelo;

import Interface.iSillon;

public class Sillon_Moderna implements iSillon {

	@Override
	public void Patas() {
		
		System.out.println("Sillón Moderno tiene base en lugar de patas");
	}

	@Override
	public void Asiento() {
		
		System.out.println("Sillón Moderno tiene capasidad 3 personas");
		
	}
	

}
