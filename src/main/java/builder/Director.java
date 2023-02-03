package builder;

import builder.builders.Builder;
import builder.components.Engine;
import builder.components.GPSNavigator;
import builder.components.TripComputer;
import builder.planes.PlaneType;

public class Director {
	public void constructPassengerPlane(Builder builder) {
		builder.setCarType(PlaneType.PASSENGER_PLANE);
		builder.setSeats(500);
		builder.setEngine(new Engine(35.0, 0));
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}

	public void constructCargoPlane(Builder builder) {
		builder.setCarType(PlaneType.CARGO_PLANE);
		builder.setSeats(5);
		builder.setEngine(new Engine(50, 0));
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}

	public void constructMilitaryPlane(Builder builder) {
		builder.setCarType(PlaneType.MILITARY_PLANE);
		builder.setSeats(2);
		builder.setEngine(new Engine(2.5, 0));
	}
}

