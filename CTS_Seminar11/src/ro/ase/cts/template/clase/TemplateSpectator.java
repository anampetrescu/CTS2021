package ro.ase.cts.template.clase;

public abstract class TemplateSpectator {
	public abstract void seAseazaLaCoada();
	public abstract void prezintaBiletul();
	public abstract void seFaceControlulCorporal();
	public abstract void ocupaLoc();
	
	//neapart final
	public final void intrareStadion() {
		seAseazaLaCoada();
		prezintaBiletul();
		seFaceControlulCorporal();
		ocupaLoc();
	}
	
}
