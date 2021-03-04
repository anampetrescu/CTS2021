package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

/* initial nu avem atribute deci face interfata
public interface AplicantReader {

	public List<Aplicant> readAplicanti(String file) throws FileNotFoundException;
	
}*/

public abstract class AplicantReader {
	
	protected String fileName;

	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}



	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
	
}
