package ParkeerPlaast;

public abstract class Car {
private String merknaam;
private double Gewicht;

public Car(String merknaam,double Gewicht) {
	this.merknaam = merknaam;
	this.Gewicht = Gewicht;
}
public Car(String merknaam) {
	this.merknaam = merknaam;
}

public abstract void FuelUp();
@Override
public String toString() {
	return "Car [merknaam=" + merknaam + ", Gewicht=" + Gewicht + "]";
}

}
