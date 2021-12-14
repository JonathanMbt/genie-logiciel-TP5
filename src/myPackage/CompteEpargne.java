package myPackage;

public class CompteEpargne extends Compte 
{

	public CompteEpargne(double s) 
	{
		super(s);
	}
	
	public void remunerer()
	{
		addSolde(0.032 * getSolde());
	}

}
