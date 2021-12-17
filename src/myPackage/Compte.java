package myPackage;

abstract class Compte 
{
	
	private double solde;
	
	public Compte(double s)
	{
		solde = s;
	}
	
	public void addSolde(double s) // permet d'ajouter une certaine somme au solde du compte
	{
		solde += s;
	}
	
	public double getSolde() // permet de retourner le solde du compte
	{
		return solde;
	}
	
	public void setSolde(double s)
	{
		solde = s;
	}
	
}

