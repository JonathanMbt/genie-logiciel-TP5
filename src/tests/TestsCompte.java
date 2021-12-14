package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import myPackage.Compte;

public class TestsCompte {

	private Compte c;
	
	@Before
	public void setUp() throws Exception {
		c = new Compte(0);
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
	public void testGetSolde()
	{
		double s = c.getSolde();
		c.addSolde(100);
		assertEquals(s+100, c.getSolde(), 0);
	}

}
