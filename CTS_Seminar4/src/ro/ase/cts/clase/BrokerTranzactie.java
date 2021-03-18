package ro.ase.cts.clase;

public class BrokerTranzactie {

	private String name;
	private int vechime;
	private int nrTranzactiiEfectuate;
	
	public static BrokerTranzactie broker=new BrokerTranzactie("Marin", 10, 120);
	private BrokerTranzactie(String name, int vechime, int nrTranzactiiEfectuate) {
		super();
		this.name = name;
		this.vechime = vechime;
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVechime(int vechime) {
		this.vechime = vechime;
	}

	public void setNrTranzactiiEfectuate(int nrTranzactiiEfectuate) {
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BrokerTranzactie [name=");
		builder.append(name);
		builder.append(", vechime=");
		builder.append(vechime);
		builder.append(", nrTranzactiiEfectuate=");
		builder.append(nrTranzactiiEfectuate);
		builder.append("]");
		return builder.toString();
	}
	
	public static BrokerTranzactie getInstance() {
		return broker;
	}
	
	
}
