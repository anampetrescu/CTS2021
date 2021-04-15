package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorNotaLaMultiAni;
import ro.ase.cts.decorator.clase.DecoratorNotaPasteFericit;
import ro.ase.cts.decorator.clase.NotaAbstracta;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Program {

	public static void main(String[] args) {
		NotaAbstracta nota=new NotaDePlata(100);
		nota.printeaza();
		DecoratorAbstract decorator=new DecoratorNotaPasteFericit(nota);
		decorator.printeazaFelicitare();
		decorator.printeaza();
		System.out.println();
		DecoratorAbstract decoratorLMA=new DecoratorNotaLaMultiAni(nota);
		decoratorLMA.printeaza();

		NotaAbstracta notaNoua=new NotaDePlata(300);
		DecoratorAbstract decoratorNouLMA=new DecoratorNotaLaMultiAni(notaNoua);
		DecoratorAbstract decoratorNouPasteFericit=new DecoratorNotaPasteFericit(decoratorNouLMA);
		System.out.println();
		decoratorNouPasteFericit.printeaza();
		
		System.out.println();
		decoratorNouPasteFericit.printeazaFelicitare();
		
	}

}
