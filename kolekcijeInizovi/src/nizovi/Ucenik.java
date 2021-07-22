package nizovi;

public class Ucenik {

	private String ime;
	private double prosek;
		
	public Ucenik(String ime, double prosek) {
		super();
		this.ime = ime;
		this.prosek = prosek;
	}
	
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public double getProsek() {
		return prosek;
	}
	public void setProsek(double prosek) {
		this.prosek = prosek;
	}
	
}
