package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupa {
	
	@Test
	public void testConstructorCorect() {
		Grupa grupa=new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorAruncaExceptieLimitaInf() {
		Grupa grupa=new Grupa(986);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorAruncaExceptieLimitaSup() {
		Grupa grupa=new Grupa(1200);
	}
	
	@Test(timeout=500)
	public void testConstructorPerformance() {
		Grupa grupa=new Grupa(1083);
	}
	
	@Test
	public void testConstructorExistaListaStudenti() {
		Grupa grupa=new Grupa(1083);
		assertNotNull(grupa.getStudenti());
	}
	
	@Test
	public void testPromovabilitateRight() {
		Grupa grupa=new Grupa(1083);
		for( int i=0;i<3;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		for( int i=0;i<7;i++) {
			Student student=new Student("Maria");
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=0.7f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
	}
	
	@Test
	public void testPromovabilitateLowerBoundery() {
		Grupa grupa=new Grupa(1083);
		for( int i=0;i<3;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=0f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
	}
	
	@Test
	public void testPromovabilitateUpperBoundery() {
		Grupa grupa=new Grupa(1083);
		for( int i=0;i<3;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(9);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=1f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testPromovabilitateErrorCondition() {
		Grupa grupa=new Grupa(1083);
		grupa.getPromovabilitate();
	}
	
	

}
