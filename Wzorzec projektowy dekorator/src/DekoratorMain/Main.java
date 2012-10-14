package DekoratorMain;

import Car.Citroen;
import Car.Samochod_osobowy;
import Car.Toyota;
import Dekorator.*;


public class Main {

	public static void main(String[] args) {
		
		Samochod_osobowy s1 = new Citroen();
		Samochod_osobowy s2 = new Toyota();
	
	    System.out.println("Bez wyposażenia");
	    System.out.println(s1.about() + " " + s1.cena());
	    System.out.println(s2.about() + " " + s2.cena());
	
        //dodajemy dodatki	
	
	    s1 = new Klimatyzacja(s1);
        s2 = new Klimatyzacja(s2);
        System.out.println("z klima");
        System.out.println(s1.about() + " " + s1.cena());
        System.out.println(s2.about() + " " + s2.cena());
        
        s1 = new Alufelgi(s1);
        s2 = new Alufelgi(s2);
        System.out.println("z alufelgami");
        System.out.println(s1.about() + " " + s1.cena());
	    System.out.println(s2.about() + " " + s2.cena());
	
	    s1 = new Centralny_zamek(s1);
        s2 = new Centralny_zamek(s2);
        System.out.println("z centralnym zamkiem");
        System.out.println(s1.about() + " " + s1.cena());
	    System.out.println(s2.about() + " " + s2.cena());
	
	
	
	}
	
	
	

}
