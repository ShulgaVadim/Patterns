package builder.components;

public class GPSNavigator {
	private String route;

	public GPSNavigator() {
		this.route = "Beauvais–Tillé Airport, Paris, France";
	}

	public GPSNavigator(String manualRoute) {
		this.route = manualRoute;
	}

	public String getRoute() {
		return route;
	}
}
