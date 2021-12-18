package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import myPackage.CompteCourant;

public class TestsCompteCourant {

	private CompteCourant c;
	
	@Before
	public void setUp() throws Exception {
		c = new CompteCourant(0);
	}

	@Test
	public void testConstructor() 
	{
		assertEquals(0, c.getSolde(), 0);
	}
	
	@Test
	public void testAddSolde()
	{
		c.addSolde(10);
		assertEquals(10, c.getSolde(), 0);
	}
	
	@Test
	public void testRetraitImpossible()
	{
		try 
		{
			c.retrait(10);
			fail("Devrait throw une exception etant donne que le solde devient negatif.");
		}catch(Exception e) {
				assert(e.getMessage().contains("Vous n'avez pas l'argent necessaire pour effectuer ce retrait."));
		}	
	}
	
	@Test
	public void testRetraitPossible()
	{
		c.addSolde(100);
		try 
		{
			c.retrait(10);
			assertEquals(90, c.getSolde(), 0);
		}catch(Exception e) {
			fail(e.getMessage());
		}	
	}
	
	@Test
	public void testGetSolde()
	{
		double s = c.getSolde();
		c.addSolde(100);
		assertEquals(s+100, c.getSolde(), 0);
	}

}
