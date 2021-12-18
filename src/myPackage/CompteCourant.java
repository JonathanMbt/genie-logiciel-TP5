package myPackage;

public class CompteCourant extends Compte{
	
	public CompteCourant(double s) 
	{
		super(s);
	}
	
	public void retrait(double s) throws Exception
	{
		
		if(getSolde()-s>0) {
			
			setSolde(getSolde()-s);
			
		}else {
			throw new Exception("Vous n'avez pas l'argent necessaire pour effectuer ce retrait.");
		}
		
		
	}
	
	
}
