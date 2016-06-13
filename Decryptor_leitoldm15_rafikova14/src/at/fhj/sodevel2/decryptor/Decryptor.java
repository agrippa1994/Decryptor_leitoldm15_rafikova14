package at.fhj.sodevel2.decryptor;

public class Decryptor {
	private String input;
	
	/**
	 * Konstruktor
	 * @param input Der zu entschlüsselte Text
	 */
	public Decryptor(String input) {
		this.input = input;
	}

	/**
	 * Entschlüsselt einen Text mit einem bestimmten Offset
	 * @param offset Offset zwischen 0 - 25
	 * @return entschlüsselten Text
	 */
	private String decrypt(int offset) {
		String result = "";
		
		// Jeden Buchstaben durchgehen
		for(int i = 0; i < input.length(); i++) {
			
			// Aktuellen Buchstaben in c speichern
			char c = input.charAt(i);
			
			boolean isLowerCase = false;
			if(c >= 'a' && c <= 'z') {
				// c ist zwischen a bis z
				isLowerCase = true;
			} else if(c >= 'A' && c <= 'Z') {
				// c ist zwishen A bis Z
				isLowerCase = false;
			} else {
				// Wenn Buchstabe außerhalb von a oder z ist --> ignorieren
				result += c;
				continue;
			}
			
			//
			char newChar;
			if(isLowerCase)
				 newChar = (char) (((c - 'a' + offset) % 26) + 'a');
			else
				newChar = (char) (((c - 'A' + offset) % 26) + 'A');
			
			// Entschlüsselten Buchstaben am Ergebnis anhängen
			result += String.valueOf(newChar);
		}
		
		return result;
	}
	
	/**
	 * Erstellt alle Entschlüsselungsmöglichkeiten 
	 * @return entschlüsselte Texte
	 */
	public String[] getResults() {
		String[] results = new String[26];
		
		for(int i = 0; i < results.length; i++)
			results[i] = decrypt(i);
		
		return results;
	}
	
}
