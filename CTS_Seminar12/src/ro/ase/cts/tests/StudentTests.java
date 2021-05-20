package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametri() {
		String nume="Gigel";
		Student student=new Student(nume);
		
		assertEquals("Numele nu a fost initializat",nume,student.getNume());
		//assertNotEquals(null,student.getNote());
		assertNotNull("Lista de note nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testConstructorFaraParametri() {
		Student student=new Student();
		
		assertNotNull("Numele nu a fost initializat",student.getNume());
		assertNotNull("Lista de note nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testSetterNume() {
		String nume="Gigel";
		Student student=new Student();
		
		student.setNume(nume);
		
		assertEquals(nume,student.getNume());
	}
	
	@Test
	public void testAdaugareNote() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota,student.getNota(0));
	}
	@Test
	public void testDimensiuneListaNote() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1,student.getNote().size());
		
	}
	
	@Test
	public void testCalculeazaMedie() {
		Student student=new Student();
		int note1=10;
		int note2=9;
		int note3=5;
		student.adaugaNota(note1);
		student.adaugaNota(note2);
		student.adaugaNota(note3);
		float medie=(note1+note2+note3)/3.0f;
		assertEquals(medie,student.calculeazaMedie(),0.01);
		
	}
	
	@Test
	public void testCalculeazaMediePentruONota() {
		Student student=new Student();
		int note1=10;
		student.adaugaNota(note1);
		assertEquals(note1,student.calculeazaMedie(),0.01);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCalculeazaMediePentruZeroNote() {
		Student student=new Student();
		student.calculeazaMedie();
		
	}
	
	@Test
	public void testAreRestanta() {
		Student student=new Student();
		int note1=6;
		int note2=4;
		int note3=2;
		student.adaugaNota(note1);
		student.adaugaNota(note2);
		student.adaugaNota(note3);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testNuAreRestanta() {
		Student student=new Student();
		int note1=8;
		int note2=8;
		int note3=5;
		student.adaugaNota(note1);
		student.adaugaNota(note2);
		student.adaugaNota(note3);
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testGetNotaPozitieIncorecta() {
		Student student=new Student();
		int note1=6;
		int note2=4;
		int note3=2;
		student.adaugaNota(note1);
		student.adaugaNota(note2);
		student.adaugaNota(note3);
		//1
		try {
			//2
			student.getNota(3);
			//3
			fail("metoda nu arunca exceptie");
		}catch(IndexOutOfBoundsException e) {
			//4
		}
		//5
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAdaugaNotaIncorecta() {
		Student student=new Student();
		int nota=14;
		student.adaugaNota(nota);
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
