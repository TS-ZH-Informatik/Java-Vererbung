package ch.klandolt.java.vererbung.business;

import java.math.BigDecimal;

public class Dozent extends Person{
	
	private BigDecimal Salary;

	/**
	 * 
	 * Konstruktor f�r einen Dozent
	 * @param name
	 * @param birth
	 * @param Salary
	 */
	public Dozent(String name, String birth, Double Salary) {
		super(name, birth);
		
		this.Salary = BigDecimal.valueOf(Salary);
		
	}
	
	
	/**
	 * �berschreiben der default Methode toString:
	 * Ausgabe der Daten nach dem Schema:
	 * Name: *Name* Geburtsdatum: *Gebdatum* Lohn: *Lohn(auf 2 Kommastellen)*
	 */
	public String toString() {
		String ausgabe;
		
		ausgabe = super.toString();
		
		ausgabe = ausgabe + " Lohn: " + this.Salary.setScale(2).toString();
		
		
		return ausgabe;
	}

}
