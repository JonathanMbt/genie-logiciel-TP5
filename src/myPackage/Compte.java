package myPackage;

public class Compte 
{
	
	private double solde;
	
	public Compte(double s)
	{
		solde = s;
	}
	
	public void addSolde(double s)
	{
		solde += s;
	}
	
	public double getSolde()
	{
		return solde;
	}
	
}
