package DekoratorMainTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;


import org.junit.Test;

import Car.Citroen;
import Car.PassangerCar;
import Car.Toyota;
import Dekorator.*;


public class MainTest {

	@Test
	public void main() {
		
		PassangerCar s1 = new Citroen();
		PassangerCar s2 = new Toyota();
	
	    System.out.println("Bez wyposażenia");
	    System.out.println(s1.about() + " " + s1.cena());
	    System.out.println(s2.about() + " " + s2.cena());
	
        //dodajemy dodatki	
	
	    s1 = new AirConditioning(s1);
        s2 = new AirConditioning(s2);
        System.out.println("z klima");
        System.out.println(s1.about() + " " + s1.cena());
        System.out.println(s2.about() + " " + s2.cena());
        
        s1 = new AlloyWheels(s1);
        s2 = new AlloyWheels(s2);
        System.out.println("z alufelgami");
        System.out.println(s1.about() + " " + s1.cena());
	    System.out.println(s2.about() + " " + s2.cena());
	
	    s1 = new CentralLocking(s1);
        s2 = new CentralLocking(s2);
        System.out.println("z centralnym zamkiem");
        System.out.println(s1.about() + " " + s1.cena());
	    System.out.println(s2.about() + " " + s2.cena());
	
	    s1 = new HeatedSeats(s1);
        s2 = new HeatedSeats(s2);
        System.out.println("z podgrzewanymi fotelami");
        System.out.println(s1.about() + " " + s1.cena());
	    System.out.println(s2.about() + " " + s2.cena());
		
	//	assertEquals("Names do not match",s1.about(), s1.cena());
		assertNotSame("It shouldn't be the same place in memory",s1, s1.about());
	//	assertEquals("Names do not match",s2.about(), s2.cena());
		assertNotSame("It shouldn't be the same place in memory",s2, s2.about());
	
	    
	    
	    
	}
	
	
	

}