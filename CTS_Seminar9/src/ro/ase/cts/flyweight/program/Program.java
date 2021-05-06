package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare r1 = new Rezervare(5, 3, 17);
		Rezervare r2 = new Rezervare(4, 2, 18);
		Rezervare r3 = new Rezervare(2, 7, 19);

		FlyweightFactory fabrica = new FlyweightFactory();
		
		fabrica.getClient("0711111111").printeazaRezervare(r1);
		fabrica.getClient("0722222222").printeazaRezervare(r2);
		fabrica.getClient("0711111111").printeazaRezervare(r3);

		
	}

}
