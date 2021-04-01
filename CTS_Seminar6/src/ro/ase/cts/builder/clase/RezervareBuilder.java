package ro.ase.cts.builder.clase;

public class RezervareBuilder implements AbstractBuilder {
	private Rezervare rezervare;

	public RezervareBuilder() {
		super();
		this.rezervare = new Rezervare(false, false, false, false, "", 0);
	}

	public RezervareBuilder(int codRezervare) {
		super();
		this.rezervare = new Rezervare(false, false, false, false, "", codRezervare);
	}

	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}

	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}

	public RezervareBuilder setAreBauturaInclusa(boolean areBauturaInclusa) {
		rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}

	public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}

	public RezervareBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}

	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}

	@Override
	public Rezervare build() {
		return rezervare;
	}

}