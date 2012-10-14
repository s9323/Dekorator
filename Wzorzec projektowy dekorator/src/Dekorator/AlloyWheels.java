package Dekorator;

import Car.PassangerCar;

public class AlloyWheels<T> extends CarDecorator<T> {
PassangerCar car;
	
	
	public AlloyWheels(PassangerCar car){
		this.car = car;
	}
	
	
	@Override
	public String about() {
		return car.about() +" + alufelgi";
	}

	public double cena(){
		
	
		return car.cena()+ 8000;
		
		
	}


	@Override
	public boolean check(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	}
	
