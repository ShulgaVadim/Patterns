package builder.planes;

import builder.components.Engine;
import builder.components.GPSNavigator;
import builder.components.TripComputer;

public class Plane {
	private final PlaneType planeType;
	private final int seats;
	private final Engine engine;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;
	private double fuel = 0;

	public Plane(PlaneType planeType, int seats, Engine engine,
	           TripComputer tripComputer, GPSNavigator gpsNavigator) {
		this.planeType = planeType;
		this.seats = seats;
		this.engine = engine;
		this.tripComputer = tripComputer;
		if (this.tripComputer != null) {
			this.tripComputer.setPlane(this);
		}
		this.gpsNavigator = gpsNavigator;
	}

	public PlaneType getPlaneType() {
		return planeType;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public int getSeats() {
		return seats;
	}

	public Engine getEngine() {
		return engine;
	}

	public TripComputer getTripComputer() {
		return tripComputer;
	}

	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}
}

