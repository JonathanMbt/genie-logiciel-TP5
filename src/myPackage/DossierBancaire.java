package myPackage;

public class DossierBancaire 
{
	
	private Compte compteC; //compte Courant
	private CompteEpargne compteE; //compte Epargne

	
	//Constructeur
    public DossierBancaire()
    {
    	compteC = new Compte(0);
    	compteE = new CompteEpargne(0);
    }

    public void depot(double value)
    {
    	compteC.addSolde(0.4 * value);
    	compteE.addSolde(0.6 * value);
    }
    
    public double getSoldeTotal()
    {
    	return compteC.getSolde() + compteE.getSolde();
    }
    
    public void remunerer()
    {
    	compteE.remunerer();
    }
}
