package fr.gtm.livraison_test_1212;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.equalTo;


public class Test_Calculatrice {

	Calculatrice maCalculatrice;

	@Before
	public void initialisation() {
		System.out.println("Test");
		maCalculatrice = new Calculatrice();
	}

	@Test()
	public void monScenarioAdditionEntier() {
		long resultat = maCalculatrice.addition(2L,3L);
		assertEquals(5, resultat);
		//fail("Not yet implemented");
	}

	@Test
	 public void monScenarioSoustraction() {
		Long resultat = maCalculatrice.soustraction(3L, 2L);
	    assertTrue("Le résultat est faux", resultat == 1L);
	  }
	
	@Test
	public void monScenarioSoustraction2() {
		Long resultat = maCalculatrice.soustraction(3L, 1L);
		 assertThat(resultat, allOf(equalTo(2L),not(3L)));
	}
	

	@Test
	  public void scenatioNull() {
		String resultat = maCalculatrice.givenull();
	    assertNull("should be null", resultat);
	  }
	
	@Test
	  public void scenarioNotSameOK() {
		long res1 = maCalculatrice.addition(2L, 2L);
		long res2 = maCalculatrice.addition(2L, 3L);
	    assertNotSame("should not be same Object", res1, res2);
	  }
	
	//celui-ci fail
	//@Test
	  //public void scenarioNotSamenotOK() {
	//	long res1 = maCalculatrice.addition(2L, 2L);
	//	long res2 = maCalculatrice.addition(2L, 3L);
	//	res1 = res2;
	  //  assertNotSame("should not be same Object", res1, res2);
	  //}
	
	


}
