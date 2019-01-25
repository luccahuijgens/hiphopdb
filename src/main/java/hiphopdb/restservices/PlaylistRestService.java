package hiphopdb.restservices;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import hiphopdb.database.HipHopService;
import hiphopdb.database.Playlist;
import hiphopdb.database.ServiceProvider;

@Path("playlists")
public class PlaylistRestService {
	HipHopService service = ServiceProvider.getService();
	
	@GET
	@Produces("application/json")
	public String getPlaylists() {
		JsonArrayBuilder jab = Json.createArrayBuilder();
		for (Playlist p:service.getPlaylists()){
			jab.add(createJson(p));
		}
		return jab.build().toString();
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public String getPlaylists(@PathParam("id")int id) {
		return createJson(service.findPlaylist(id)).build().toString();
	}
	
	public JsonObjectBuilder createJson(Playlist p) {
		JsonObjectBuilder job = Json.createObjectBuilder();
		job.add("id", p.getId());
		job.add("title", p.getTitle());
		job.add("author", p.getAuthor());
		job.add("description", p.getDescription());
		return job;
	}
}
