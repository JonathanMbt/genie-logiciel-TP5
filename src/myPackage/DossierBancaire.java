package myPackage;

public class DossierBancaire 
{
	
	private CompteCourant compteC; //compte Courant
	private CompteEpargne compteE; //compte Epargne
	
	//Constructeur
    public DossierBancaire()
    {
    	compteC = new CompteCourant(0);
    	compteE = new CompteEpargne(0);
    }

    public void depot(double value)
    {
    	compteC.addSolde(0.4 * value);
    	compteE.addSolde(0.6 * value);
    }
    public void retrait(double value)
    {
    	try {
    		compteC.retrait(value);
    	}catch(Exception e) {
    		
    		e.printStackTrace();
    	}
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
