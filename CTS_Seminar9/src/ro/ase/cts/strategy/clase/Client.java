package ro.ase.cts.strategy.clase;

public class Client {

	private Strategy strategie;
	private String nume;

	public Client(Strategy strategie, String nume) {
		super();
		this.strategie = strategie;
		this.nume = nume;
	}
	
	public void setStrategy(Strategy strateg) {
		this.strategie = strateg;
	}
	
	public void platesteNota(float suma) {
		System.out.println(this.nume + " are de plata suma de " + suma + " lei");
		strategie.realizeazaPlata(suma);
	}
}
