package Dekorator;

import Car.PassangerCar;

public class CentralLocking<T> extends CarDecorator<T> {

	PassangerCar car;
	
    public CentralLocking(PassangerCar car){
	this.car = car;
       }

	
	@Override
	public String about() {
		return car.about() +" + centralny zamek";
	}

	public double cena(){
		
			return car.cena()+5000;
		
	}


	@Override
	public boolean check(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	}


