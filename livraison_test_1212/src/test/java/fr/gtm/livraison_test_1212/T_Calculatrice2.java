/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gtm.livraison_test_1212;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adminl
 */
public class T_Calculatrice2 {
    
    public T_Calculatrice2() {
    }
    
Calculatrice maCalculatrice;

	@Before
	public void initialisation() {
		System.out.println("Test");
		maCalculatrice = new Calculatrice();
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
	
}
