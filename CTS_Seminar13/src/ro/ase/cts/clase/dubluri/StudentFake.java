package ro.ase.cts.clase.dubluri;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class StudentFake implements IStudent {

	String valoareNume;
	float valoareMedie;
	int valoareNota;
	boolean valoareAreRestante;
	
	
	public void setValoareNume(String valoareNume) {
		this.valoareNume = valoareNume;
	}

	public void setValoareMedie(float valoareMedie) {
		this.valoareMedie = valoareMedie;
	}

	public void setValoareNota(int valoareNota) {
		this.valoareNota = valoareNota;
	}

	public void setValoareAreRestante(boolean valoareAreRestante) {
		this.valoareAreRestante = valoareAreRestante;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return valoareNume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return valoareMedie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return valoareNota;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return valoareAreRestante;
	}

}
