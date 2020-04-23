package _070_Constractor1;

import java.util.ArrayList;
import java.util.List;

public class CarsWorld {

	String make;
	String model;
	String year;
	String type;
	String usage;
	String wheel_system;

	// Cars with 2 parameters
	public CarsWorld(String cmake, String cmodel) {
		make = cmake;
		model = cmodel;
	}

	// Cars with 5 parameters
	public CarsWorld(String cmake, String cmodel, String cyear, String cusage, String ctype) {
		make = cmake;
		model = cmodel;
		year = cyear;
		usage = cusage;
		type = ctype;
	}

	// Cars with 6 parameters
	public CarsWorld(String cmake, String cmodel, String cyear, String cusage, String ctype, String cwheel_system) {
		make = cmake;
		model = cmodel;
		year = cyear;
		usage = cusage;
		type = ctype;
		wheel_system = cwheel_system;
	}

	public static void main(String[] args) {

		List<CarsWorld> myCars = new ArrayList<>();

		myCars.add(new CarsWorld("Chevrolet", "Camaro"));
		myCars.add(new CarsWorld("Ford", "Mustand", "1969", "Classic", "Sport"));
		myCars.add(new CarsWorld("Tesla", "Model X", "2020", "Electric", "SUV", "AWD"));

		String format = "%-20s %-15s %-15s %-15s %-15s %-10s%n";

		System.out.println();
		System.out.printf(format, "Make", "Model", "Model Year", "Usage", "Type", "Wheel System");
		System.out.printf(format, "---------", "----------", "------------", "------", "-------", "----------");

		for (CarsWorld x : myCars)
			System.out.printf(format, x.make, x.model, x.year, x.usage, x.type, x.wheel_system);

	}
}
