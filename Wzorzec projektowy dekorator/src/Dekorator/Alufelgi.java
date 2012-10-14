package Dekorator;

import Car.Samochod_osobowy;

public class Alufelgi extends Dekorator_samochodu {
Samochod_osobowy samochod;
	
	
	public Alufelgi(Samochod_osobowy samochod){
		this.samochod = samochod;
	}
	
	
	@Override
	public String about() {
		return samochod.about() +" + alufelgi";
	}

	public double cena(){
		
	
		return samochod.cena()+ 8000;
		
		
	}


	@Override
	public boolean check(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	}
	
