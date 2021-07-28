package zadatak28072021;

public class Proizvod {

	private int sifra;
	private String naziv;
	private double cena;
	
	public Proizvod(int sifra, String naziv, double cena) {
		super();
		this.sifra = sifra;
		this.naziv = naziv;
		this.cena = cena;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
	
	@Override
	public String toString() {
		return sifra + "\t" + naziv + "\t" + cena;
	}
	
	
}
