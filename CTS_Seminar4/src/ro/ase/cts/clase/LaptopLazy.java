package ro.ase.cts.clase;

public class LaptopLazy {
	
	private String marca;
	private int pret;
	private boolean reconditionat;
	
	private static LaptopLazy laptop=null;
	private LaptopLazy(String marca, int pret, boolean reconditionat) {
		super();
		this.marca = marca;
		this.pret = pret;
		this.reconditionat = reconditionat;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setPret(int pret) {
		this.pret = pret;
	}
	public void setReconditionat(boolean reconditionat) {
		this.reconditionat = reconditionat;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LaptopLazy [marca=");
		builder.append(marca);
		builder.append(", pret=");
		builder.append(pret);
		builder.append(", reconditionat=");
		builder.append(reconditionat);
		builder.append("]");
		return builder.toString();
	}
	
	public static synchronized LaptopLazy getInstance(String marca, int pret, boolean reconditionat) {
		if(laptop==null) {
			laptop=new LaptopLazy(marca, pret, reconditionat);
		}
		return laptop;
	}
	

}
