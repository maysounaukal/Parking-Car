package ParkeerPlaast;

public class BMW extends Car {

	public BMW(String merknaam) {
		super(merknaam);
		
	}
	 public BMW(String merknaam,double Gewicht) {
		  super(merknaam,Gewicht);
	  }
	@Override
	public void FuelUp() {
		System.out.println("deze auto loopt op benzine");
		
	}
	@Override
	public String toString() {
		return "BMW [toString()=" + super.toString() + "]";
	}

}
