package Fabrica;

import Interface.iMesa;
import Interface.iSilla;
import Interface.iSillon;
import Modelo.Mesa_Victoriana;
import Modelo.Silla_Victoriana;
import Modelo.Sillon_Victoriana;

public class Fabrica_Victorianos extends Fabrica_Abstracta {

	@Override
	public iSilla getiSilla(String tipoSilla) {
		
		if (tipoSilla.equalsIgnoreCase("SILLA")) {
			return new Silla_Victoriana();
		
		}
		
		return null;
	}

	@Override
	public iSillon getiSillon(String tipoSillon) {
		
		if (tipoSillon.equalsIgnoreCase("SILLON")) {
			return new Sillon_Victoriana();
		}
		
		return null;
	}

	@Override
	public iMesa getiMesa(String tipoMesa) {
		
		if (tipoMesa.equalsIgnoreCase("MESA")) {
			return new Mesa_Victoriana();
		}
		
		return null;
	}
	

}
