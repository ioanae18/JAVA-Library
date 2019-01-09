import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Carte> lstCarti = new ArrayList<Carte>();
	private ArrayList<Cititor> lstCititori = new ArrayList<Cititor>();
	private ArrayList<Imprumut> lstImprumut = new ArrayList<Imprumut>();
	public ArrayList<Imprumut> getAllImprumuturi()
	{
		return lstImprumut;
	}
	
	public void adaugaCititori(Cititor cititor)
	{
		lstCititori.add(cititor);
	}

	public void adaugaCarti(Carte carte)
	{
		lstCarti.add(carte);
	}
	
	public Biblioteca()
	{
	
	}
	
	public boolean imprumutCarte (Imprumut imprumut)
	{
		for ( Carte crt : lstCarti )
		{
			if(crt.getISBN() == imprumut.getCarte().getISBN() && imprumut.getCarte().getImprumut() == false)
			{
				crt.getImprumut(true);
				lstImprumut.add(imprumut);
			}
			else
			{
				return false;
			}
	    }
		return true;
	}
	
}
