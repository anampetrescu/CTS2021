package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String, Flyweight> clienti;
	
	public FlyweightFactory() {
		super();
		this.clienti = new HashMap<String,Flyweight>();
	}

	public Flyweight getClient(String nrTelefon) {
		Flyweight client = clienti.get(nrTelefon);
		if (client == null) {
			client = new Client("Ion",nrTelefon,"ion@gmail.com");
			clienti.put(nrTelefon, client);
		}
		return client;
	}
}
