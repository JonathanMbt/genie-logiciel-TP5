package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import myPackage.CompteEpargne;

public class TestsCompteEpargne {
	
	private CompteEpargne ce;

	@Before
	public void setUp() throws Exception 
	{
		ce = new CompteEpargne(0);
	}

	@Test
	public void testRemunerer() {
		ce.addSolde(100);
		ce.remunerer();
		assertEquals(1.032 * 100, ce.getSolde(), 0);
	}

}
