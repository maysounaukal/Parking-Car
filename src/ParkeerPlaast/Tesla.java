package ParkeerPlaast;

public class Tesla extends Car {

	public Tesla(String merknaam) {
		super(merknaam);
		// TODO Auto-generated constructor stub
	}
	 public Tesla(String merknaam,double Gewicht) {
		  super(merknaam,Gewicht);
	  }
	@Override
	public void FuelUp() {
		System.out.println("deze auto loopt op elektriciteit");
		
	}
	@Override
	public String toString() {
		return "Tesla [toString()=" + super.toString() + "]";
	}

}
