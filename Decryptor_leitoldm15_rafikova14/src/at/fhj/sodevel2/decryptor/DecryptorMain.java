package at.fhj.sodevel2.decryptor;

public class DecryptorMain {

	public static void main(String[] args) {
		// Decryptor erstellen
		Decryptor d = new Decryptor("fhqu qnf Jneffreenq fb svaqrfg qh nhqu qra pnpu tyrvpu");

		// Alle Ergebnisse durchgehen
		int i = 0;
		for(String result : d.getResults()) {
			System.out.println("Offset " + i + ": " + result);
			i++;
		}
	}

}
