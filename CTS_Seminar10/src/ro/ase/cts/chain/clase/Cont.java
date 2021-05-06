package ro.ase.cts.chain.clase;

public abstract class Cont {

	private Cont succesor;
	private float sold;
	
	public Cont(float sold) {
		super();
		this.sold = sold;
		this.succesor=null;
	}

	public Cont getSuccesor() {
		return succesor;
	}

	public void setSuccesor(Cont succesor) {
		this.succesor = succesor;
	}

	public float getSold() {
		return sold;
	}

	public void setSold(float sold) {
		this.sold = sold;
	}
	
	public abstract void plateste(float suma);
	
}
