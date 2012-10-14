package Dekorator;

import Car.*;

public class AirConditioning<T> extends CarDecorator<T>{
     PassangerCar car;
	
	
	public AirConditioning(PassangerCar car){
		this.car = car;
	}
	
	
	@Override
	public String about() {
		return car.about() +" + klimatyzacja";
	}

	public double cena(){
		
		if(car instanceof Citroen){
			return car.cena()+10000;
		}
		else if(car instanceof Toyota){
			return car.cena()+15000;
		}
		return 0.;
	}

	@Override
	public boolean check(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
