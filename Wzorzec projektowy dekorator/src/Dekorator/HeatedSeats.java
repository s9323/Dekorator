package Dekorator;

import Car.Citroen;
import Car.PassangerCar;
import Car.Toyota;

public class HeatedSeats<T> extends CarDecorator<T> {
	
	PassangerCar car;
	
     public HeatedSeats(PassangerCar car){
	this.car = car;
        }

	
	@Override
	public String about() {
		return car.about() +" + podgrzewane fotele";
	}

	public double cena(){
		
		return car.cena()+4000;
		
	}


	@Override
	public boolean check(Object obj) {
		
		return false;
	}

}
