package Dekorator;

import Car.Citroen;
import Car.Samochod_osobowy;
import Car.Toyota;

public class Podgrzewane_fotele extends Dekorator_samochodu {
	
	Samochod_osobowy samochod;
	
     public Podgrzewane_fotele(Samochod_osobowy samochod){
	this.samochod = samochod;
        }

	
	@Override
	public String about() {
		return samochod.about() +" + podgrzewane fotele";
	}

	public double cena(){
		
		if(samochod instanceof Citroen){
			return samochod.cena()+2000;
		}
		else if(samochod instanceof Toyota){
			return samochod.cena()+4000;
		}
		return 0.;
	}


	@Override
	public boolean check(Object obj) {
		
		return false;
	}

}
