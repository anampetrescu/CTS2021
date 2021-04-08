package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.Credit;
import ro.ase.cts.proxy.clase.Proxy;
import ro.ase.cts.proxy.clase.TipMoneda;

public class Program {

	public static void main(String[] args) {
		Credit credit = new Credit();
		credit.OferaCredit(TipMoneda.EUR,100);
		
		Proxy proxy = new Proxy(credit);
		proxy.OferaCredit(TipMoneda.EUR, 100);
		proxy.OferaCredit(TipMoneda.RON, 1000);
	}

}
