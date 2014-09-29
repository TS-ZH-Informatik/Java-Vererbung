package ch.klandolt.java.vererbung.business;

/**
 * Beispiel Vererbung
 * Elternklasse Person f�r Studenten und Dozenten und evt. weitere ...
 * mit den Attributen Name und Geburtsdatum
 * 
 * @author kevin.landolt
 *
 */


public class Person {
	
	/**
	 * Attribute der Person Name und Geburtsdatum
	 */
	
	private String name;
	private String birth;
	
	
	/**
	 * Konstruktor f�r eine Person 
	 * @param name
	 * @param birth
	 */
	
	public Person(String name, String birth){
		
		this.name = name;
		this.birth = birth;
		
		
	}
	
	/**
	 * �berschreiben der default Methode toString:
	 * Ausgabe der Daten nach dem Schema:
	 * Name: *Name* Geburtsdatum: *Gebdatum*
	 */
	public String toString() {
		String ausgabe;
		
		ausgabe = "Name: " + this.name + " Geburtsdatum: " + this.birth;
		
		
		return ausgabe;
	}
	

}
