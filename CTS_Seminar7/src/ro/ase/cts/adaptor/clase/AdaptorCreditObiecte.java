package ro.ase.cts.adaptor.clase;

public class AdaptorCreditObiecte implements CreditAbstract {
	
	private Leasing leasing;
	
	
	
	public AdaptorCreditObiecte(Leasing leasing) {
		super();
		this.leasing = leasing;
	}


	@Override
	public void oferaCredit(float suma) {
		leasing.imprumuta();
		
	}

}
