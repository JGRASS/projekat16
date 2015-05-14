package teniskiTeren;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RezervacioniSistemTest {

	RezervacioniSistem sistem;
	
	@Before
	public void setUp() throws Exception {
		sistem = new RezervacioniSistem();
		
	}

	@After
	public void tearDown() throws Exception {
		sistem = null;
	}

	@Test
	public void testRezervisi() {
		Date datum = new Date();

		TeniskiTeren t = new TeniskiTeren();
		t.setBrojTelefona("1111");
		t.setImeKorisnika("Pera Zdera");
		t.setSat(18);
		t.setTipTerena("sljaka");
		t.setDatum(datum);
		
		sistem.rezervisi(t);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testRezervisiDuplikat() {
		Date datum = new Date();

		TeniskiTeren t = new TeniskiTeren();
		t.setBrojTelefona("1111");
		t.setImeKorisnika("Pera Zdera");
		t.setSat(18);
		t.setTipTerena("sljaka");
		t.setDatum(datum);
		
		sistem.rezervisi(t);
		
		TeniskiTeren t1 = new TeniskiTeren();
		t1.setBrojTelefona("1111");
		t1.setImeKorisnika("Pera Zdera");
		t1.setSat(18);
		t1.setTipTerena("sljaka");
		t1.setDatum(datum);
		
		sistem.rezervisi(t1);
	}

	@Test
	public void testIzbrisiRezervaciju() {
		Date datum = new Date();

		TeniskiTeren t = new TeniskiTeren();
		t.setBrojTelefona("1111");
		t.setImeKorisnika("Pera Zdera");
		t.setSat(18);
		t.setTipTerena("sljaka");
		t.setDatum(datum);
		
		sistem.rezervisi(t);
		
		sistem.izbrisiRezervaciju(t);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testIzbrisiRezervacijuDuplikat() {
		Date datum = new Date();

		TeniskiTeren t = new TeniskiTeren();
		t.setBrojTelefona("1111");
		t.setImeKorisnika("Pera Zdera");
		t.setSat(18);
		t.setTipTerena("sljaka");
		t.setDatum(datum);
		
		sistem.izbrisiRezervaciju(t);
		
		TeniskiTeren t1 = new TeniskiTeren();
		t1.setBrojTelefona("1111");
		t1.setImeKorisnika("Pera Zdera");
		t1.setSat(18);
		t1.setTipTerena("sljaka");
		t1.setDatum(datum);
		
		sistem.izbrisiRezervaciju(t1);
	}
	

	@Test
	public void testDodajTeren() {
		String teniskiTeren = "nebo";
		
		sistem.dodajTeren(teniskiTeren);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajTerenDuplikat() {
		String teniskiTeren = "trava";
		
		sistem.dodajTeren(teniskiTeren);
	
	}

	@Test
	public void testIzbrisiTeren() {
		String teniskiTeren = "trava";
		sistem.izbrisiTeren(teniskiTeren);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testIzbrisiTerenDuplikat() {
		String teniskiTeren = "trava";
		
		sistem.dodajTeren(teniskiTeren);
		sistem.izbrisiTeren(teniskiTeren);
		sistem.izbrisiTeren(teniskiTeren);
		
	}
	

}
