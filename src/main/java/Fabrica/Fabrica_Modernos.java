package Fabrica;

import Interface.iMesa;
import Interface.iSilla;
import Interface.iSillon;
import Modelo.Mesa_Moderna;
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

	@Override
	public iMesa getiMesa(String tipoMesa) {
		
		if (tipoMesa.equalsIgnoreCase("MESA")) {
			return new Mesa_Moderna();
		}
		
		return null;
	}
	

}
