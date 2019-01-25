package hiphopdb.database;

public class ServiceProvider {
	private static HipHopService hService = new HipHopService();

	public static HipHopService getService() {
		return hService;
	}
}