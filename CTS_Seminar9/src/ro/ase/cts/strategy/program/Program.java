package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.Portofel;

public class Program {

	public static void main(String[] args) {
		Portofel portofel = new Portofel(300);
		Client client1 = new Client(portofel, "Maria");
		
		client1.platesteNota(200);
		client1.setStrategy(new Card());
		client1.platesteNota(110);
		client1.setStrategy(portofel);
		client1.platesteNota(200);

	}

}
