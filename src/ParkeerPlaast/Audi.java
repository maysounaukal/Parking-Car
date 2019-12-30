package ParkeerPlaast;

public class Audi extends Car {

	public Audi(String merknaam) {
		super(merknaam);
		
	}
	 public Audi(String merknaam,double Gewicht) {
		  super(merknaam,Gewicht);
	  }
	@Override
	public void FuelUp() {
		System.out.println("deze auto loopt op elektriciteit");
		
	}
	@Override
	public String toString() {
		return "Audi [toString()=" + super.toString() + "]";
	}

}
