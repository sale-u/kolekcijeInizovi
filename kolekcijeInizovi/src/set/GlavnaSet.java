package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GlavnaSet {

	public static void main(String[] args) {

		// lista vs set

		List<String> listaImena = new ArrayList<String>();
		listaImena.add("Nenad");
		listaImena.add("Ivan");
		listaImena.add("Milica");
		listaImena.add("Ogi");
		listaImena.add("Nenad"); // ArrayList dozvoljava duplikat

		System.out.println("Imena iz liste su: ");
		for (String s : listaImena) { // enhanced for (for-each)
			System.out.println(s);
		}
		System.out.println("Trece ime u listi je " + listaImena.get(2));
		
		System.out.println("Imena iz liste preko iteratora su: ");
		Iterator<String> iter = listaImena.iterator();	// dizemo iterator objekat nad listom
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}

		Set<String> setImena = new HashSet<String>();
		setImena.add("Nenad");
		setImena.add("Ivan");
		setImena.add("Milica");
		setImena.add("Ogi");
		setImena.add("Nenad"); // HashSet NE dozvoljava duplikat
		System.out.println("\nImena iz seta su: ");
		for (String s : setImena) { // enhanced for (for-each)
			System.out.println(s);
		}
		
		System.out.println("Imena iz seta preko iteratora su: ");
		Iterator<String> iterSet = setImena.iterator();	// dizemo iterator objekat nad setom
		while (iterSet.hasNext()) {
			String s = iterSet.next();
			System.out.println(s);
		}
		

		
		


	}

}
