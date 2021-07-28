package zadatak28072021;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GlavnaKlasa {

	public static void main(String[] args) {

		// ********* DOMACI URADJEN U POSEBNOM PAKETU zadatak28072021 ****************
		
		Proizvod[] asortiman = new Proizvod[6];
		asortiman[0] = new Proizvod(123, "Cokolada Milka", 180.5);
		asortiman[1] = new Proizvod(456, "Sladoled Leni", 60.0);
		asortiman[2] = new Proizvod(789, "Hleb Sava", 50.0);
		asortiman[3] = new Proizvod(110, "Jelen pivo", 118.5);
		asortiman[4] = new Proizvod(234, "Coca Cola", 90.0);
		asortiman[5] = new Proizvod(258, "Brasno belo", 45.0);
		
		// punjenje Mape korpa
		Map<Integer, Proizvod> korpa = new HashMap<>();		// HashMap sadrzi kompletan asortiman (key = sifra)
		for (int i = 0; i < asortiman.length; i++) {
			korpa.put(asortiman[i].getSifra(), asortiman[i]);
		}
		
		Map<Integer, Integer> brKomada = new HashMap<>();	// sadrzi parove sifra - broj_komada
		Scanner scanner = new Scanner(System.in);
		String ulaz;
		
		while (true) {
			System.out.println("\nIzaberite sifru proizvoda [quit = kraj] / Asortiman :\n" + "=".repeat(50));
			printAsortimana(korpa);
			ulaz = scanner.nextLine();
			if (ulaz.equalsIgnoreCase("quit")) {
				break;
			}
			int unetaSifra = Integer.valueOf(ulaz);
			if (korpa.containsKey(unetaSifra)) {
				Proizvod izabrano = korpa.get(unetaSifra);
				System.out.print("Izabrali ste : " + izabrano.getNaziv() + " *** Koliko komada ? ");
				ulaz = scanner.nextLine();
				int br = Integer.valueOf(ulaz);
				brKomada.put(izabrano.getSifra(), br);				
			} else {
				System.out.println("Uneli ste nepostojecu sifru...");
			}			
		}
		
		scanner.close();
		
		double sumaKorpe = 0;
		System.out.println("\nVasa korpa sa izabranim proizvodima izgleda ovako :\n" + "=".repeat(50));
		System.out.println("Sifra\tNaziv\t\tJed.cena\tBr.kom");
		Iterator<Map.Entry<Integer, Integer>> iterKorpe = brKomada.entrySet().iterator();
		while (iterKorpe.hasNext()) {
			Map.Entry<Integer, Integer> stavka = iterKorpe.next();
			Proizvod izabrano = korpa.get(stavka.getKey());
			int br = stavka.getValue();
			System.out.println(izabrano.getSifra() + "\t" + izabrano.getNaziv() + "\t" + izabrano.getCena() + "\t\t" + br);
			sumaKorpe += br * izabrano.getCena();
		}
		System.out.println("=".repeat(50) + "\nUkupna cena vase korpe je : \t\t" + sumaKorpe);

	}
	
	// ============================================================================
	
	public static void printAsortimana(Map<Integer, Proizvod> korpa) {
		System.out.println("Sifra\tNaziv\t\tJed.cena");
		for (Map.Entry<Integer, Proizvod> entry : korpa.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue().getNaziv() + "\t" + entry.getValue().getCena());
		}
	}

}
