package ro.ase.cts.adaptorclase.program;

import ro.ase.cts.adaptorclase.clase.CreditAbstract;
import ro.ase.cts.adaptorclase.clase.AdaptorCreditClase;

public class Program {

	public static void afiseazaInformatiiCredit(CreditAbstract credit)  {
		credit.oferaCredit();
	}


	public static void main(String[] args) {
		
		AdaptorCreditClase adaptorClase = new AdaptorCreditClase(50, "Ana");
		afiseazaInformatiiCredit(adaptorClase);

	}
}
