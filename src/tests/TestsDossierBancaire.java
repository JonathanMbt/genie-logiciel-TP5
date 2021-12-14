package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import myPackage.DossierBancaire;

public class TestsDossierBancaire 
{
	
	private DossierBancaire dossier;
	
	@Before
	public void setup()
	{
		dossier = new DossierBancaire();
	}
	
	
	@Test  
	public void testDepot() 
	{
		double s = dossier.get_solde();
		dossier.deposer(100);
		assertEquals(s + 100, dossier.get_solde(), 0); //voir documentation en ligne sur assertions Junit 
	}
	
	@Test
	public void testGetSolde()
	{
		dossier.deposer(100);
		assertEquals(100, dossier.get_solde(), 0);
	}
	
	@Test
	public void testConstructeur()
	{
		assertEquals(0, dossier.get_solde(), 0);
	}
}
