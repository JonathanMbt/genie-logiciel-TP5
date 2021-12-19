package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import myPackage.DossierBancaire;

public class TestsDossierBancaire 
{
	
	private DossierBancaire dossier;
	
	@Before
	public void setUp()
	{
		dossier = new DossierBancaire();
	}
	
	
	@Test  
	public void testDepot() 
	{
		double s = dossier.getSoldeTotal();
		dossier.depot(100);
		assertEquals(s + 100, dossier.getSoldeTotal(), 0); //voir documentation en ligne sur assertions Junit 
	}
	
	@Test
	public void testGetSolde()
	{
		dossier.depot(100);
		assertEquals(100, dossier.getSoldeTotal(), 0);
	}
	
	@Test
	public void testConstructeur()
	{
		assertEquals(0, dossier.getSoldeTotal(), 0);
	}
	
	@Test
	public void testRemunerer()
	{
		dossier.depot(100);
		dossier.remunerer();
		assertEquals(0.6*100*1.032+0.4*100, dossier.getSoldeTotal(), 0);
	}
}
