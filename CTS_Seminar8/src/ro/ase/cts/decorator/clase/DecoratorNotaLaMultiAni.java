package ro.ase.cts.decorator.clase;

public class DecoratorNotaLaMultiAni extends DecoratorAbstract {

	public DecoratorNotaLaMultiAni(NotaAbstracta nota) {
		super(nota);
	
	}

	@Override
	public void printeazaFelicitare() {
		
		System.out.println("Felicitare La Multi Ani!");
	}
	
	public void printeaza() {
		super.printeaza();
		System.out.println("La multi ani!");
	}
	
}
