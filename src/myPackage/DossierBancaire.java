package myPackage;

public class DossierBancaire 
{
	
	private Compte compteC; //compte Courant
	
	//Constructeur
    public DossierBancaire()
    {
    	compteC = new Compte(0);
    }

    public void depot(double value)
    {
    	compteC.addSolde(value);
    }
    
    public double getSoldeTotal()
    {
    	return compteC.getSolde();
    }
    
    public void remunerer() {}
}
