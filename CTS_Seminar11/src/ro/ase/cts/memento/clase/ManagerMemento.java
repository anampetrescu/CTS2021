package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento> mementos=new ArrayList();
	
	public void adaugaMemento(Memento memento) {
		mementos.add(memento);
	}
	
	public Memento getMemento(int index) {
		if(index>=0 && index<=mementos.size()) {
			return mementos.get(index);
		}
		else {
			throw new IllegalArgumentException("Index in afara limitelor");
		}
	}
}
