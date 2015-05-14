package teniskiTeren;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TeniskiTerenTest {

	TeniskiTeren teren;
	
	@Before
	public void setUp() throws Exception {
		teren = new TeniskiTeren();
	}

	@After
	public void tearDown() throws Exception {
		teren = null;
	}

	@Test
	public void testSetTipTerena() {
		teren.setTipTerena("sljaka");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetTipTerenaEmptyString() {
		teren.setTipTerena("");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetTipTerenaEmptySpace() {
		teren.setTipTerena(" ");
	}

	@Test
	public void testSetSat() {
		teren.setSat(18);;
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSatManjeOdOsam() {
		teren.setSat(6);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSatViseOd18() {
		teren.setSat(19);
	}
	

	@Test
	public void testSetImeKorisnika() {
		teren.setImeKorisnika("Pera Zdera");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImeKorisnikaNull() {
		teren.setImeKorisnika(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImeEmptyString() {
		teren.setImeKorisnika("");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImeKorisnikaEmptySpace() {
		teren.setImeKorisnika(" ");
	}
	
	

	@Test
	public void testSetBrojTelefona() {
		teren.setBrojTelefona("06511111");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetBrojTelefonaNull() {
		teren.setBrojTelefona(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetBrojTelefonaEmptyString() {
		teren.setBrojTelefona("");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetBrojTelefonaEmptySpace() {
		teren.setBrojTelefona(" ");
	}
	
}
