package Dekorator;

import Car.Citroen;
import Car.Samochod_osobowy;
import Car.Toyota;

public class Klimatyzacja extends Dekorator_samochodu{
     Samochod_osobowy samochod;
	
	
	public Klimatyzacja(Samochod_osobowy samochod){
		this.samochod = samochod;
	}
	
	
	@Override
	public String about() {
		return samochod.about() +" + klimatyzacja";
	}

	public double cena(){
		
		if(samochod instanceof Citroen){
			return samochod.cena()+10000;
		}
		else if(samochod instanceof Toyota){
			return samochod.cena()+15000;
		}
		return 0.;
	}


	@Override
	public boolean check(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
