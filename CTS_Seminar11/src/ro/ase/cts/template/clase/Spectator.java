package ro.ase.cts.template.clase;

public class Spectator extends TemplateSpectator{
	private String nume;

	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void seAseazaLaCoada() {
		System.out.println("Spectatorul "+ nume +" se aseaza la coada");
		
	}

	@Override
	public void prezintaBiletul() {
		System.out.println("Spectatorul "+ nume +" prezinta biletul");		
	}

	@Override
	public void seFaceControlulCorporal() {
		System.out.println("Spectatorul "+ nume +" face controlul corporal");		
	}

	@Override
	public void ocupaLoc() {
		System.out.println("Spectatorul "+ nume +" ocupa loc");		
	}
	

}
