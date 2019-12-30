package ParkeerPlaast;

import java.util.Arrays;

public class ParkeerPlaats {
   Car[] cars = new Car[0];



public ParkeerPlaats() {
	// TODO Auto-generated constructor stub
}

public Car[] getCars() {
	return cars;
}

public void setCars(Car[] cars) {
	this.cars = cars;
}

public void addCars(Car car) {
	cars = Arrays.copyOf(cars, cars.length + 1);
	cars[cars.length - 1] = car;
}
   
public void printParkeerLayout() {
 int count = 0;
 for(Car c: cars) {
	 System.out.println("|" + c.toString() + "|");
	 if(count % 3 == 0 ) {
		 System.out.println();
		
	 }
	count++;
}
}




}
