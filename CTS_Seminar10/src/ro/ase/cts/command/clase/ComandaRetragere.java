package ro.ase.cts.command.clase;

public class ComandaRetragere extends Comanda{

	public ComandaRetragere(ContBancar cont, float suma) {
		super(cont, suma);
		
	}

	@Override
	public void executa() {
		super.getCont().retragere(super.getSuma());
		
	}

}
