package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;

public class Program {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("2981220112222","Andreea");
		if(Facade.esteEligibil(persoana)) {
			System.out.println("Oferim credit");
		}
		else {
			System.out.println("Nu oferim credit");
		}

	}

}
