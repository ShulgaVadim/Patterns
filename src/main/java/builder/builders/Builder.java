package builder.builders;

import builder.components.Engine;
import builder.components.GPSNavigator;
import builder.components.TripComputer;
import builder.planes.PlaneType;

public interface Builder {

	void setCarType(PlaneType type);
	void setSeats(int seats);
	void setEngine(Engine engine);
	void setTripComputer(TripComputer tripComputer);
	void setGPSNavigator(GPSNavigator gpsNavigator);
}
