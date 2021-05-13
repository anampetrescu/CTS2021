package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.MeciJucat;

public class Program {
	
	public static void main(String[] args) {
		
		MeciJucat meci1=new MeciJucat("FC Arges", "Craiova", 10,5,7,10);
		ManagerMemento manager=new ManagerMemento();
		manager.adaugaMemento(meci1.creareMemento());
		
		meci1.setNumeGazda("Steaua");
		meci1.setNrBilete(78);
		meci1.setNrSpectatori(400);
		
		manager.adaugaMemento(meci1.creareMemento());
		System.out.println(meci1.toString());
		
		meci1.setMemento(manager.getMemento(0));
		System.out.println(meci1.toString());
		
	}
}
