package ro.ase.cts.composite.clase;

public class Element implements ComponentaMeniu{
	private String numeElement;

	public Element(String numeElement) {
		super();
		this.numeElement = numeElement;
	}

	
	@Override
	public void adaugaNod(ComponentaMeniu componentaMeniu) {
		throw new IllegalArgumentException("Nu ste implementata");
		
	}

	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu) {
		throw new IllegalArgumentException("Nu ste implementata");
		
	}

	@Override
	public ComponentaMeniu getNod(int index) {
		throw new IllegalArgumentException("Nu ste implementata");

	}

	@Override
	public void printeaza() {
		System.out.println("Elementul " + numeElement);
		
	}

}
