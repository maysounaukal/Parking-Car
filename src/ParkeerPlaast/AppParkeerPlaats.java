package ParkeerPlaast;

import java.util.Random;

public class AppParkeerPlaats {

	public static void main(String[] args) {
		ParkeerPlaats kouter = new ParkeerPlaats();
		Random rand = new Random();
		Car cars = null;
		for( int i = 0; i < 10; i++) {
		
		int choice = rand.nextInt(5);
		switch(choice) {
		case 0 : cars = new Peugot("Peugot",1200);break;
		case 1 : cars = new Porshe("Porshe",1200);break;
		case 2 : cars = new BMW("BMW",1800); break;
		case 3 : cars = new Tesla("Tesla",300);break;
		case 4 : cars = new Audi("Audi",1500); break;
		}
		  kouter.addCars(cars);
		}
 
 kouter.printParkeerLayout();
	}

}
