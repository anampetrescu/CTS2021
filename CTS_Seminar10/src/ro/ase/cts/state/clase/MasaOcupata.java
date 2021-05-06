package ro.ase.cts.state.clase;

public class MasaOcupata implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof MasaOcupata) {
			System.out.println("Masa "+masa.getNrMasa()+" este deja ocupata");
		}
		else {
			masa.setStareMasa(this);
			System.out.println("Masa "+masa.getNrMasa()+" s-a ocupat");
		}
		
	}

}
