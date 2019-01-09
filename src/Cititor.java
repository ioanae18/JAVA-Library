
public class Cititor {
	private String Nume;
	private String Prenume;
	private int codCititor;
	private String dataInscrierii;

	public String getNume() {
		return Nume;
	}

	public void setNume(String nume) {
		Nume = nume;
	}

	public String getPrenume() {
		return Prenume;
	}

	public void setPrenume(String prenume) {
		Prenume = prenume;
	}

	public int getCodCitior() {
		return codCititor;
	}

	public void setCodCitior(int codCititor) {
		this.codCititor = codCititor;
	}

	public String getDataInscrierii() {
		return dataInscrierii;
	}

	public void setDataInscrierii(String dataInscrierii) {
		this.dataInscrierii = dataInscrierii;
	}

	@Override
	public String toString() {
		return "Cititor [Nume=" + Nume + ", Prenume=" + Prenume + ", codCitior=" + codCititor + ", dataInscrierii="
				+ dataInscrierii + "]";
	}

	public Cititor() {
		super();
		Nume = "";
		Prenume = "";
		codCititor = 1;
		dataInscrierii = "1-1-2000";
	}
	
	public Cititor(String nume, String prenume, int codCititor, String dataInscrierii) {
		Nume = nume;
		Prenume = prenume;
		this.codCititor = codCititor;
		this.dataInscrierii = dataInscrierii;
	}
}
