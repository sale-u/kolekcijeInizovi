package nizovi;

import java.util.Arrays;

public class GlavnaNizovi {

	public static boolean zamisljeniBroj(int brojKojiSamZamislio, int[] loto) {
		boolean zamisljeni = false;

		for (int i = 0; i < loto.length; i++) {
			if (loto[i] == brojKojiSamZamislio) {
				zamisljeni = true;
				break;
			}
		}
		return zamisljeni;
	}

	public static double prosekOcena(int[] ocene) {
		double prosek = 0;
		int zbir = 0;
		for (int i = 0; i < ocene.length; i++) {
			zbir += ocene[i];
		}
		prosek = (double) zbir / ocene.length;

		return prosek;
	}

	public static void prikaziUcenike(Ucenik[] ucenici) {
		for (int i = 0; i < ucenici.length; i++) {
			System.out.println("Ucenik " + ucenici[i].getIme() + " ima prosek: " + ucenici[i].getProsek());
		}

	}

	// ************************* DOMACI ****** ARRAY SORTING ********************
	
	// ************************* BUBLLE SORT *************************************
	public static int[] bublleSort(int[] niz) {
		// veci clanovi niza budu potiskivani tokom svake iteracije ka kraju niza (kao sto mehurici vazduha idu na gore)
		// sortiranje se prekida kada u iteraciji nije izvrseno swapovanje nijednog para clanova
		
		int[] aux = Arrays.copyOf(niz, niz.length);	// pravimo kopiju ulaznog niza kako ne bi promene radili nad njim

		boolean noSwap = false;
		int temp;
		int oduzmi = 0;

		while (!noSwap) {
			noSwap = true;
			oduzmi++;		// nakon svake iteracije, nema potrebe opet ici do kraja niza jer veliki clanovi su vec tamo
			for (int i = 0; i < aux.length - oduzmi; i++) {
				if (aux[i] > aux[i + 1]) {
					temp = aux[i];
					aux[i] = aux[i + 1];
					aux[i + 1] = temp;
					noSwap = false;		// indikator da li je potrebno ici u sledecu iteraciju
				}
			}
		}
		return aux;
	}
	

	// ************************* INSERTION SORT *********************************
	public static int[] insertionSort(int[] niz) {
		// Idemo s leva na desno i posmatramo svaki od elemenata.
		// Ako se i-ti element nalazi desno od “vecih” elemenata, onda se on pomera na levo
		// sve dok se ne bude levo od svih vecih elemenata.
		// Sada su svi elementi levo od i-tog u pravilnom rastucem redosledu a oni
		// elementi desno od i-tog nisu ni analizirani.
		// Potom idemo dalje po elementima sve do kraja

		int[] aux = Arrays.copyOf(niz, niz.length);	// pravimo kopiju ulaznog niza kako ne bi promene radili nad njim
		int temp;

		for (int i = 1; i < aux.length; i++) {
			for (int j = i; j > 0; j--) {
				if (aux[j - 1] > aux[j]) { 	// da li je levi clan niz[j-1] veci od desnog niz[j]
					temp = aux[j - 1];		// ako jeste, onda zamenimo mesta izmedju clanova niz[j-1] i niz[j]
					aux[j - 1] = aux[j];
					aux[j] = temp;
				} else {
					break; // levi clan je manji od desnog pa izlazim iz j for-a
				}
			}
		}
		return aux;
	}
	

	public static void main(String[] args) {

		// loto kombinacije
		int[] lotoKombinacije = new int[9]; // napravili niz koji ce primiti 7x int brojeva (naknadno dodato jos 2 clana)
		lotoKombinacije[0] = 2;
		lotoKombinacije[1] = 34;
		lotoKombinacije[2] = 17;
		lotoKombinacije[3] = 12;
		lotoKombinacije[4] = 21;
		lotoKombinacije[5] = 7;
		lotoKombinacije[6] = 29;

		System.out.println("Izvuceni loto brojevi su: ");
		for (int i = 0; i < lotoKombinacije.length; i++) {
			System.out.println(lotoKombinacije[i]);
		}

		// ********************* DOMACI ********* SORTIRANJE *************
		System.out.println("Nakon Bublle sortiranja:\n====================");
		int[] sorted = bublleSort(lotoKombinacije);
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i]);
		}
		System.out.println("\nNakon Insertion sortiranja:\n====================");
		sorted = insertionSort(lotoKombinacije);
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i]);
		}
		System.out.println();
		
		// *********************************************************************

		boolean zamisljeni = zamisljeniBroj(12, lotoKombinacije);
		System.out.println("Da li sam zamislio jedan od loto brojeva: " + zamisljeni);

		int ocene[] = { 3, 4, 5, 2, 4 };
		System.out.println(ocene[2]);

		double prosek = prosekOcena(ocene);
		System.out.println("Prosek ocena je " + prosek);

		String[] mojaOmiljenaImena = new String[4];
		mojaOmiljenaImena[0] = "Ogi";
		mojaOmiljenaImena[1] = "Milica";
		mojaOmiljenaImena[3] = "Maja";

		System.out.println("Omiljena imena: ");

		for (int i = 0; i < mojaOmiljenaImena.length; i++) {
			System.out.println(mojaOmiljenaImena[i]);
		}

		Ucenik ucenik1 = new Ucenik("Pera", 4.5);
		Ucenik ucenik2 = new Ucenik("Mile", 3.8);
		Ucenik ucenik3 = new Ucenik("Ruza", 5.0);

		Ucenik[] sviUcenici = { ucenik1, ucenik2, ucenik3 };

		prikaziUcenike(sviUcenici);

	}

}
