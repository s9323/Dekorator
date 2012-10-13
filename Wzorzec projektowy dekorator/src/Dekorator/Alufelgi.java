package Dekorator;

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
	}
	
