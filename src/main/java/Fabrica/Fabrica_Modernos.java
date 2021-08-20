package Fabrica;

import Interface.iSilla;
import Interface.iSillon;
import Modelo.Silla_Moderna;
import Modelo.Sillon_Moderna;


public class Fabrica_Modernos extends Fabrica_Abstracta {

	@Override
	public iSilla getiSilla(String tipoSilla) {
		
		if (tipoSilla.equalsIgnoreCase("SILLA")) {
			return new Silla_Moderna();
		}
		
		return null;
	}

	@Override
	public iSillon getiSillon(String tipoSillon) {
		
		if (tipoSillon.equalsIgnoreCase("SILLON")) {
			return new Sillon_Moderna();
		}
		
		return null;
	}

}
