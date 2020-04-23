package _070_Constractor1;

public class ClassicCars {

	 String make;
	 String model;
	 int modelyear;

	public ClassicCars(String cmake, String cmodel, int cmodelyear) {
		make = cmake;
		model = cmodel;
		modelyear = cmodelyear;
	}


	public static void main(String[] args) {


		ClassicCars[] myCars = new ClassicCars[3];

		myCars[0] = new ClassicCars("Chevrolet", "Camaro", 1968);
		myCars[1] = new ClassicCars("Ford", "Mustand", 1996);
		myCars[2] = new ClassicCars("Toyota", "Chevelle", 1970);

		for (int i = 0; i <myCars.length; i++)
		System.out.printf("%-10s %-15s %-15s%n",myCars[i].make,myCars[i].model,myCars[i].modelyear);

	}

}
