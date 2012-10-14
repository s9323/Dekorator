package Car;

public abstract class PassangerCar implements PassangerCarInterface {

	protected String car ="Samochod podstawowy";
	
	public String about(){
		return car;
	}
	
	public double cena() {
		return 0;
	}
}
