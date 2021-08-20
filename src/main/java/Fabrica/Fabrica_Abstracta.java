package Fabrica;

import Interface.iSilla;
import Interface.iSillon;

public abstract class Fabrica_Abstracta {
	
	public abstract iSilla getiSilla(String tipoSilla);
	public abstract iSillon getiSillon(String tipoSillon);

}
