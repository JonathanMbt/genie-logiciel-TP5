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
    	compteC.addSolde(0.4 * value); // 40% reverse sur le compte courant
    	compteE.addSolde(0.6 * value); // 60% reverse sur le compte epargne
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
    
    public void remunerer()// appel a la fonction remunerer uniquement presente dans la classe CompteEpargne
    {
    	compteE.remunerer();
    }
    
    
}

