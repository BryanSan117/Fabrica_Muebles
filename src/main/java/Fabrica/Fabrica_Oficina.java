package Fabrica;

import Interface.iMesa;
import Interface.iSilla;
import Interface.iSillon;
import Modelo.Mesa_Oficina;
import Modelo.Silla_Oficina;
import Modelo.Sillon_Oficina;

public class Fabrica_Oficina extends Fabrica_Abstracta {

	@Override
	public iSilla getiSilla(String tipoSilla) {
		
		if (tipoSilla.equalsIgnoreCase("SILLA")) {
			return new Silla_Oficina();
		}
		
		return null;
	}

	@Override
	public iSillon getiSillon(String tipoSillon) {
		
		if (tipoSillon.equalsIgnoreCase("SILLA")) {
			return new Sillon_Oficina();
		}
		
		return null;
	}

	@Override
	public iMesa getiMesa(String tipoMesa) {
		
		if (tipoMesa.equalsIgnoreCase("MESA")) {
			return new Mesa_Oficina();
		}
		
		return null;
	}
	
	

}
