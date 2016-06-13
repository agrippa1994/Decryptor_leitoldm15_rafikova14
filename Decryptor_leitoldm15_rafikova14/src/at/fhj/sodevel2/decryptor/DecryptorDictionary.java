package at.fhj.sodevel2.decryptor;

import java.util.ArrayList;
import java.util.List;

public class DecryptorDictionary {
	private Decryptor decrypt;
	private Dictionary dict;
	private int minLength;
	
	public DecryptorDictionary(Decryptor decrypt, Dictionary dict, int minLength) {
		this.decrypt = decrypt;
		this.dict = dict;
		this.minLength = minLength;
	}
	
	public List<String> getResults() {
		// Speichern der entschlüsselten Möglichkeiten in decryptedResults
		String[] decryptedResults = decrypt.getResults();
		
		// Speichern der Wörter in words
		List<String> words = dict.getWords();
	
		// Hier werden nur die entschlüssteln Möglichkeiten gespeichert
		// die Wörter von words enthalten
		List<String> results = new ArrayList<>();
		
		// Durchgehen aller entschlüsselten Werte
		for(String decrypted : decryptedResults) {
			
			// Durchgehen aller Wörter
			for(String word : words) {
				
				// Wort nur dann suchen, wenn die Wortlänge größer minLength ist
				if(word.length() < minLength)
					continue;
				
				// Überprüfen ob Wort im entschlüsselten Text ist
				if(decrypted.contains(word)) {
					// Hinzufügen zu den Ergebnissen
					results.add(decrypted);
					
					// Schleife der Wörter abbrechen, da Wort gefunden
					break;
				}
			}
		}
		
		return results;
	}
	
}
