package ro.ase.cts.builder.clase;

public class RezervareBuilderV2 implements AbstractBuilder {
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBauturaInclusa;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	private int codRezervare;

	public RezervareBuilderV2() {
		this.areMancareInclusa = false;
		this.areScaunErgonomic = false;
		this.areBauturaInclusa = false;
		this.areMuzicaAmbientala = false;
		this.genMuzica = null;
		this.codRezervare = 0;
	}

	public RezervareBuilderV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}

	public RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}

	public RezervareBuilderV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
		return this;
	}

	public RezervareBuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}

	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	public RezervareBuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	@Override
	public Rezervare build() {
		Rezervare rezervare = new Rezervare(areMancareInclusa, areScaunErgonomic, areBauturaInclusa, areMuzicaAmbientala, genMuzica, codRezervare);
		return rezervare;
	}
}
