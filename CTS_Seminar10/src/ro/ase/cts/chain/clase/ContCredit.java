package ro.ase.cts.chain.clase;

public class ContCredit extends Cont{

	public ContCredit(float sold) {
		super(sold);
	
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>suma) {
			System.out.println("Si platit cu contul de credit");
			super.setSold(super.getSold()-suma);
		}
		else {
			if(super.getSuccesor()==null) {
				System.out.println("Nu se poate efectua plata");
			}
			else {
				super.getSuccesor().plateste(suma);
			}
		}
	}
}
