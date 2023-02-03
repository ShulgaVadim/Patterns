package builder;

import builder.builders.PlaneBuilder;
import builder.planes.Plane;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Director director = new Director();
		PlaneBuilder builder = new PlaneBuilder();

		System.out.println("Please enter plane type:");
		System.out.println("1. Passenger");
		System.out.println("2. Cargo");
		System.out.println("3. Military");
		String choice = scanner.nextLine();
		switch (choice) {
			case ("1"):
			default:
				director.constructPassengerPlane(builder);
				break;
			case ("2"):
				director.constructCargoPlane(builder);
				break;
			case ("3"):
				director.constructMilitaryPlane(builder);
				break;
		}

		Plane plane = builder.getResult();
		System.out.println("Plane built:\n" + plane.getPlaneType());

	}
}
