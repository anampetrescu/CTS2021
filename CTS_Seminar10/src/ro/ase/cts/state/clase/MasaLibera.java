package ro.ase.cts.state.clase;

public class MasaLibera implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof MasaOcupata || masa.getStareMasa() instanceof MasaRezervata) {
			masa.setStareMasa(this);
			System.out.println("Masa "+masa.getNrMasa()+" s-a eliberat");
		}
		else {
			System.out.println("Masa "+masa.getNrMasa()+" este deja libera");
		}
		
	}

}
