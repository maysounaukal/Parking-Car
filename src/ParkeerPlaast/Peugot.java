package ParkeerPlaast;

public class Peugot extends Car {

	public Peugot(String merknaam) {
		super(merknaam);
		
	}
  public Peugot(String merknaam,double Gewicht) {
	  super(merknaam,Gewicht);
  }
	@Override
	public void FuelUp() {
	System.out.println("deze auto loopt op benzine");
		
	}
	@Override
	public String toString() {
		return "Peugot [toString()=" + super.toString() + "]";
	}
	

}
