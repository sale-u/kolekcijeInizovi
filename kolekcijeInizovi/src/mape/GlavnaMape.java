package mape;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import zadatak28072021.Proizvod;

public class GlavnaMape {

	public static void main(String[] args) {

//		// key - value
//		Map<Integer, String> mapaImena = new HashMap<Integer, String>();
//		mapaImena.put(11, "Nenad");
//		mapaImena.put(21, "Ivan");
//		mapaImena.put(42, "Ogi");
//		mapaImena.put(101, "Milica");
//		
////		System.out.println("Ime: " + mapaImena.get(101));
//		
//		// for-Each je specificna za ocitavanje Mape
//		for (Map.Entry<Integer, String> me: mapaImena.entrySet()) {
//			System.out.print("Kljuc: " + me.getKey());
//			System.out.println("\tVrednost: " + me.getValue());
//		}

		// *********************** RETURN TO PREVIOUS COMMIT IN GITHUB
		// ******************
//		System.out.println("Proba vracanja na odredjeni commit");
		// ******************************************************************************

		User u1 = new User();
		u1.setIme("Pera");
		u1.setPrezime("Peric");
		u1.setJmbg("1234");

		User u2 = new User();
		u2.setIme("Mika");
		u2.setPrezime("Mikic");
		u2.setJmbg("9876");

		User u3 = new User();
		u3.setIme("Ruza");
		u3.setPrezime("Ruzic");
		u3.setJmbg("8170");

		Map<String, User> mapaUsera = new HashMap<>();
		mapaUsera.put(u1.getJmbg(), u1);
		mapaUsera.put(u2.getJmbg(), u2);
		mapaUsera.put(u3.getJmbg(), u3);

		// ********* UBACENA FOR-EACH ZA LISTANJE MAPE ***************
		System.out.println("Stampamo clanove Map-e kroz for-each petlju:\n" + "=".repeat(50));
		for (Map.Entry<String, User> clan : mapaUsera.entrySet()) {
			System.out.print("JMBG kljuc=" + clan.getKey());
			System.out.print("\tIme=" + clan.getValue().getIme());
			System.out.println("\tPrezime=" + clan.getValue().getPrezime());
		}
		// ********* UBACENA ITERATOR ZA LISTANJE MAPE ***************
		System.out.println("\nStampamo clanove Map-e kroz iterator:\n" + "=".repeat(50));
		Iterator<Map.Entry<String, User>> iterMap = mapaUsera.entrySet().iterator();
		while (iterMap.hasNext()) {
			Map.Entry<String, User> entry = iterMap.next();
			System.out.print("JMBG kljuc=" + entry.getKey());
			System.out.print("\tIme=" + entry.getValue().getIme());
			System.out.println("\tPrezime=" + entry.getValue().getPrezime());
		}
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("\nUnesite jmbg: ");
		String jmbgUneto = scanner.nextLine();
		scanner.close();

		if (mapaUsera.containsKey(jmbgUneto)) {
			User nadjeniUser = mapaUsera.get(jmbgUneto); // ako ne nadje objekat po kljucu onda izbacuje
															// NullPointerException -> zato stavljamo if() ispred
			System.out.println("Nadjen user: ");
			System.out.println("Ime usera: " + nadjeniUser.getIme());
			System.out.println("Prezime usera: " + nadjeniUser.getPrezime());
		} else {
			System.out.println("Ne postoji taj jmbg u nasoj mapi...");
		}

		// ************************ ZA DOMACI *************************
		// napravi klasu Proizvod
		// -sifra proizvoda -> kljuc
		// -naziv proizvoda
		// -cena proizvoda
		// u glavnoj klasi napravi 3 proizvoda, staviti u mapu korpa
		// value = ceo objekat Proizvod
		// izracunaj cenu korpe
		// ********* DOMACI URADJEN U POSEBNOM PAKETU zadatak28072021 ****************
		
	}
}
