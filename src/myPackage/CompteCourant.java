package myPackage;

public class CompteCourant extends Compte{
	
	public CompteCourant(double s) 
	{
		super(s);
	}
	
	public boolean retrait(double s)
	{
		boolean error=false;
		if(getSolde()-s>0) {
			
			setSolde(getSolde()-s);
			
		}else {error=true;
		}
		return error;
		
	}
	
	
}
