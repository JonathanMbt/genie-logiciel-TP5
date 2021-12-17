package myPackage;

public class DossierBancaire 
{
	
	private Compte compteC; //compte Courant
	private CompteEpargne compteE; //compte Epargne

	
	//Constructeur
    public DossierBancaire()
    {
    	compteC = new Compte(0); // initialisation du compte courant à 0€
    	compteE = new CompteEpargne(0); // initialisation du compte courant à 0€
    }

    public void depot(double value)
    {
    	compteC.addSolde(0.4 * value); // 40% reversé sur le compte courant
    	compteE.addSolde(0.6 * value); // 60% reversé sur le compte épargne
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
