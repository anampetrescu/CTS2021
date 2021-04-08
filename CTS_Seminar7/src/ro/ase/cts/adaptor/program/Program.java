package ro.ase.cts.adaptor.program;

import ro.ase.cts.adaptor.clase.AdaptorCreditObiecte;
import ro.ase.cts.adaptor.clase.CreditAbstract;
import ro.ase.cts.adaptor.clase.Leasing;

public class Program {

	public static void afiseazaInformatiiCredit(CreditAbstract credit, float suma) {
		credit.oferaCredit(suma);
	}

	public static void main(String[] args) {
	
		Leasing leasing = new Leasing(100, "Ion");
		AdaptorCreditObiecte adaptor = new AdaptorCreditObiecte(leasing);
		afiseazaInformatiiCredit(adaptor, leasing.getSuma());

	}
}
