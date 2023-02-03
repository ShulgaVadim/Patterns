package builder.components;

import builder.planes.Plane;

public class TripComputer {

	private Plane plane;

	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	public void showFuelLevel() {
		System.out.println("Fuel level: " + plane.getFuel());
	}

	public void showStatus() {
		if (this.plane.getEngine().isStarted()) {
			System.out.println("Engine is started");
		} else {
			System.out.println("Enngine isn't started");
		}
	}
}
