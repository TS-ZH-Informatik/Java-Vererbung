package ch.klandolt.java.vererbung.business;

public class Student extends Person {
	
	private String Studienrichtung;
	
	
	
	/**
	 * 
	 * Konstruktor für einen Student 
	 * @param name
	 * @param birth
	 * @param Studienrichtung
	 */
	public Student(String name, String birth, String Studienrichtung) {
		super(name, birth);
		
		this.Studienrichtung = Studienrichtung;
	
	}
	
	
	/**
	 * Überschreiben der default Methode toString:
	 * Ausgabe der Daten nach dem Schema:
	 * Name: *Name* Geburtsdatum: *Gebdatum* Studienrichtung: *Studienrichtung*
	 */
	public String toString() {
		String ausgabe;
		
		ausgabe = super.toString();
		
		ausgabe = ausgabe + " Studienrichtung: " + this.Studienrichtung;
		
		
		return ausgabe;
	}
	
	

}
