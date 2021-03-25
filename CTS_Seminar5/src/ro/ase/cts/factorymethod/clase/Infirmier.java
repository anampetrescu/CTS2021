package ro.ase.cts.factorymethod.clase;

public class Infirmier extends PersonalSpital {

	public Infirmier(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Infirmier [nume=");
		builder.append(nume);
		builder.append("]");
		return builder.toString();
	}
	

}
