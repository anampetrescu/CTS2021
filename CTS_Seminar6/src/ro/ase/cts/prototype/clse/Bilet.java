package ro.ase.cts.prototype.clse;

public class Bilet implements AbstractPrototype{

	private int codBilet;
	private String echipa1;
	private String echipa2;
	private String data;
	public Bilet(int codBilet, String echipa1, String echipa2, String data) {
		super();
		this.codBilet = codBilet;
		this.echipa1 = echipa1;
		this.echipa2 = echipa2;
		this.data = data;
	}

	public void setCodBilet(int codBilet) {
		this.codBilet = codBilet;
	}
	private Bilet() {
		
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bilet [codBilet=");
		builder.append(codBilet);
		builder.append(", echipa1=");
		builder.append(echipa1);
		builder.append(", echipa2=");
		builder.append(echipa2);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}
	public AbstractPrototype copiaza() {
		Bilet newBilet=new Bilet();
		newBilet.codBilet=this.codBilet;
		newBilet.echipa1=this.echipa1;
		newBilet.echipa2=this.echipa2;
		newBilet.data=this.data;
		
		
		return newBilet;
	}
}
