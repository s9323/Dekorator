package Dekorator;

import Car.Samochod_osobowy;

public class Centralny_zamek extends Dekorator_samochodu {

	Samochod_osobowy samochod;
	
    public Centralny_zamek(Samochod_osobowy samochod){
	this.samochod = samochod;
       }

	
	@Override
	public String about() {
		return samochod.about() +" + centralny zamek";
	}

	public double cena(){
		
			return samochod.cena()+5000;
		
	}


	@Override
	public boolean check(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	}


