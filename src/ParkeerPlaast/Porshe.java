package ParkeerPlaast;

public class Porshe extends Car {

	public Porshe(String merknaam) {
		super(merknaam);
	
	}
	 public Porshe(String merknaam,double Gewicht) {
		  super(merknaam,Gewicht);
	  }
	@Override
	public void FuelUp() {
		System.out.println("deze auto loopt op elektriciteit");
		
	}
	@Override
	public String toString() {
		return "Porshe [toString()=" + super.toString()+ "]";
	}
	

}
