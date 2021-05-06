package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Cont;
import ro.ase.cts.chain.clase.ContCredit;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContEconomii;

public class Program {

	public static void main(String[] args) {
		Cont contEconomii=new ContEconomii(100);
		Cont contCurent=new ContCurent(400);
		Cont contCredit=new ContCredit(300);
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		
		contCurent.plateste(50);
		contCurent.plateste(340);
		contCurent.plateste(50);
		contCurent.plateste(200);
		contCurent.plateste(200);

	}

}
