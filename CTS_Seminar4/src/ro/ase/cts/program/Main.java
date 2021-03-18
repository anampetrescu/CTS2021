package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.BrokerTranzactieLazy;

public class Main {

	public static void main(String[] args) {


		BrokerTranzactie broker1= BrokerTranzactie.getInstance();
		BrokerTranzactie broker2= BrokerTranzactie.getInstance();
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());

		broker1.setName("Gigel");
		broker2.setNrTranzactiiEfectuate(200);
		
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());

		BrokerTranzactieLazy lazy1=BrokerTranzactieLazy.getInstance("Ion", 5, 74);
		BrokerTranzactieLazy lazy2=BrokerTranzactieLazy.getInstance("Marius", 10, 99);
		System.out.println(lazy1.toString());
		System.out.println(lazy2.toString());
		
	}

}
