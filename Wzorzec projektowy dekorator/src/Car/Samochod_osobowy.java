package Car;

public abstract class Samochod_osobowy implements Samochod_osobowy_Interface {

	protected String samochod ="Samochod podstawowy";
	
	public String about(){
		return samochod;
	}
	
	public double cena() {
		return 0;
	}
}
