package ro.ase.cts.proxy.clase;

public class Credit implements CreditAbstract{

	@Override
	public void OferaCredit(TipMoneda tip, float suma) {
		System.out.println("S-a achizitionat un credit de " + suma + " " + tip);
	}

}
