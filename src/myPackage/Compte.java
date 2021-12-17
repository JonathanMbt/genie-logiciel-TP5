package myPackage;

abstract class Compte 
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
	public void setSolde(double s)
	{
		solde = s;
	}
	
}
