package liste;

import java.util.ArrayList;
import java.util.List;

public class GlavnaListe {

	public static void main(String[] args) {

		// instancirali smo listu BEZ generickog tipa (neparametrizovanu)
		// i u nju guramo svasta od tipova podataka
		// ali tako se ne radi vec nam treba parametrizovana (genericki tip) lista
//		List sveIsvasta = new ArrayList();
//
//		sveIsvasta.add(32);
//		sveIsvasta.add("Pera");
//		sveIsvasta.add(true);
//		sveIsvasta.add(2.3);

		
		
		// instancirali smo listu sa generickim tipom
		List<String> sveIsvasta = new ArrayList<String>();

		
		sveIsvasta.add("32");
		sveIsvasta.add("Pera");
		sveIsvasta.add("Sta hocu...");
		sveIsvasta.add("...");
		sveIsvasta.add("32");

		String izListe = sveIsvasta.get(1);
		System.out.println(izListe + "\n=====================");

		for (int i = 0; i < sveIsvasta.size(); i++) {
			System.out.println(sveIsvasta.get(i));
		}

		// izbacio sam iz liste string "..." pod indeksom = 3
		sveIsvasta.remove(3);
		System.out.println("Nakon izbacivanja: ");
		for (int i = 0; i < sveIsvasta.size(); i++) {
			System.out.println(sveIsvasta.get(i));
		}

		String treci = sveIsvasta.get(3);
		System.out.println("Treci je sad " + treci);

		// ocisti celu listu
		sveIsvasta.clear();
		System.out.println("Nakon ciscenja: ");
		for (int i = 0; i < sveIsvasta.size(); i++) {
			System.out.println(sveIsvasta.get(i));
		}

		sveIsvasta.add("Nenad");
		sveIsvasta.add("Ogi");

		System.out.println("Nakon ponovnog dodavanja: ");
		// enhanced for loop - for each
		for (String s : sveIsvasta) {
			System.out.println(s);
		}

		System.out.println("\n" + sveIsvasta);

	}

}
