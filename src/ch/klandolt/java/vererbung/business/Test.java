package ch.klandolt.java.vererbung.business;
/**
 * Test Klasse 
 * 
 * 
 * @author kevin.landolt
 *
 */


public class Test {

	public static void main(String[] args) {
		
		
		Student Flavio = new Student("Hugo Blaser", "01.02.1990", "Informatik");
		
		System.out.println(Flavio.toString());
		
		Dozent PJost = new Dozent("Max Muster", "01.01.1970", 10000.0);
		
		System.out.println(PJost.toString());
		
		
		

	}

}
