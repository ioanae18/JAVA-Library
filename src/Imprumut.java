
public class Imprumut {
     private int ID;
     private String dataImprumut;
     private String dataReturnare;
     private Carte carte;
     private Cititor cititor;
     
     
     
	public Carte getCarte() {
		return carte;
	}

	public void setCarte(Carte carte) {
		this.carte = carte;
	}

	public Cititor getCititor() {
		return cititor;
	}

	public void setCititor(Cititor cititor) {
		this.cititor = cititor;
	}

	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getDataImprumut() {
		return dataImprumut;
	}
	
	public void setDataImprumut(String dataImprumut) {
		this.dataImprumut = dataImprumut;
	}
	
	public String getDataReturnare() {
		return dataReturnare;
	}
	
	public void setDataReturnare(String dataReturnare) {
		this.dataReturnare = dataReturnare;
	}
	

	
	@Override
	public String toString() {
		return "Imprumut [ID=" + ID + ", dataImprumut=" + dataImprumut + ", dataReturnare=" + dataReturnare + ", carte="
				+ carte + ", cititor=" + cititor + "]";
	}


	public Imprumut(int id, String dataimprumut, String datareturnare, Carte crt, Cititor cit) {
		super();
		carte = crt;
		cititor = cit;
		ID = id;
		dataImprumut = dataimprumut;
		dataReturnare = datareturnare;
	}
	
	
     
     
}
