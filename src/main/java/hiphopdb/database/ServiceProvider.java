package hiphopdb.database;

public class ServiceProvider {
	private static HipHopService hService = HipHopService.getInstance();

	public static HipHopService getService() {
		return hService;
	}
}