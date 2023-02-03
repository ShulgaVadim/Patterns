package builder.builders;

import builder.components.Engine;
import builder.components.GPSNavigator;
import builder.components.TripComputer;
import builder.planes.Plane;
import builder.planes.PlaneType;

public class PlaneBuilder implements Builder{
	private PlaneType type;
	private int seats;
	private Engine engine;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	public void setCarType(PlaneType type) {
		this.type = type;
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	public Plane getResult() {
		return new Plane(type, seats, engine, tripComputer, gpsNavigator);
	}
}

