package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerSala implements Subject{

	private List<Observer> clienti;
	private String numeSala;
	
	public ManagerSala(String numeSala) {
		super();
		this.clienti = new ArrayList<Observer>();
		this.numeSala = numeSala;
	}

	@Override
	public void adaugareAbonat(Observer observer) {
		clienti.add(observer);
		
	}

	@Override
	public void stergereAbonat(Observer observer) {
		clienti.remove(observer);
		
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		clienti.forEach(item->item.receptioneazaMesaj(mesaj));
		
	}
	
	public void trimiteAnunt(String tipMeci) {
		trimiteMesaj("Va anuntam ca va avea loc un meci de "+tipMeci+" la sala"+numeSala);
	}
	
	
}
