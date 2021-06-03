package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.dubluri.StudentStub;

public class TestGrupaWithStub {

	@Test
	public void testPromovabilitateBounderySuperior() {
		Grupa grupa=new Grupa(1083);
		IStudent student=new StudentStub();
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}

}
