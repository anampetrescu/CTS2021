package ro.ase.cts.command.clase;

public class ComandaConstituire extends Comanda {

	public ComandaConstituire(ContBancar cont, float suma) {
		super(cont, suma);
		
	}

	@Override
	public void executa() {
		super.getCont().constituire(super.getSuma());
	}

}
