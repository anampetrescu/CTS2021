package ro.ase.cts.factorymethod.clase;

public class BrancardierFactory implements FactoryPersonal{

	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Brancardier(nume);
	}

}
