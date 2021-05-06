package ro.ase.cts.state.clase;

public class MasaRezervata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof MasaLibera) {
			masa.setStareMasa(this);
			System.out.println("Masa "+masa.getNrMasa()+" s-a rezervat");
		}
		else {
			System.out.println("Masa "+masa.getNrMasa()+" nu se poate rezerva");
		}
		
	}

}
