package at.fhj.sodevel2.decryptor;

public class DecryptorMain {

	public static void main(String[] args) {
		// Decryptor erstellen
		Decryptor decryptor = new Decryptor("fhqu qnf Jneffreenq fb svaqrfg qh nhqu qra pnpu tyrvpu");

		// Alle Ergebnisse durchgehen
		int i = 0;
		for(String result : decryptor.getResults()) {
			System.out.println("Offset " + i + ": " + result);
			i++;
		}
		
	
		System.out.println("\n\n");
		System.out.println("Ergebnisse mit Wörterbuch abgleichen");
		
		// Dictionary erstellen
		Dictionary dict = new Dictionary("dict.txt");
		
		// Decryptor mit Wörterbuch erstellen
		DecryptorDictionary dd = new DecryptorDictionary(decryptor, dict, 5);
		for(String result : dd.getResults()) {
			System.out.println(result);
		}
	}

}
