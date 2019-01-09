
public class Carte {
	private int ISBN;
	private String Editura;
	private String Autor;
	private int An;
	private boolean Imprumutata;
	

	
	public boolean isImprumutata() {
		return Imprumutata;
	}

	public void setImprumutata(boolean imprumutata) {
		Imprumutata = imprumutata;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getEditura() {
		return Editura;
	}

	public void setEditura(String editura) {
		Editura = editura;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getAn() {
		return An;
	}

	public void setAn(int an) {
		An = an;
	}

	
	
	@Override
	public String toString() {
		return "Carte [ISBN=" + ISBN + ", Editura=" + Editura + ", Autor=" + Autor + ", An=" + An + ", Imprumutata="
				+ Imprumutata + "]";
	}

	public Carte() {
		super();
		ISBN = 1;
		Editura = "";
		Autor = "";
		An = 2000;
		Imprumutata=false;
	}
	
	public Carte(int ISBN, String editura, String autor, int an, boolean imprumutata) {
		super();
		this.Imprumutata = imprumutata;
		this.ISBN = ISBN;
		this.Editura = editura;
		this.Autor = autor;
		this.An = an;
	}
}
