package hiphopdb.database;

public class ServiceProvider {
	private static HipHopService hService = HipHopService.getInstance();

	private ServiceProvider() {
	}

	public static HipHopService getService() {
		return hService;
	}
}
