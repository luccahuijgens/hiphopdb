package hiphopdb.restservices;

import java.text.SimpleDateFormat;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import hiphopdb.database.Album;
import hiphopdb.database.Artist;
import hiphopdb.database.HipHopService;
import hiphopdb.database.ServiceProvider;
import hiphopdb.database.Track;

@Path("/albums")
public class AlbumRestService {
	HipHopService service = ServiceProvider.getService();
	
	@GET
	@Produces("application/json")
	public String getAlbums() {
		JsonArrayBuilder jab = Json.createArrayBuilder();
		for (Album a:service.getAlbums()) {
			jab.add(createJson(a));
		}
		return jab.build().toString();
	}
	
	@GET
	@Path("{id}")
	@Produces("application/json")
	public String getAlbumById(@PathParam("id")int id) {
		return createJson(service.getAlbumByID(id)).build().toString();
	}
	
	@GET
	@Path("{id}/albums")
	@Produces("application/json")
		public String getAlbumsByArtist(@PathParam("id")int id){	
		JsonArrayBuilder jab = Json.createArrayBuilder();
			for (Album al:service.getAlbumsByArtist(id)) {
				jab.add(createJson(al));
			}
			return (jab.build().toString());
		}
	@GET
	@Path("{id}/latest")
	@Produces("application/json")
		public String getLatestReleaseByArtist(@PathParam("id")int id){	
		JsonArrayBuilder jab = Json.createArrayBuilder();
			//for (Album al:service.getAlbumsByArtist(id)) {
				//jab.add(createJson(al));
			//}
		return (jab.build().toString());
		}
	
	public JsonObjectBuilder createJson(Album al) {
		JsonObjectBuilder job = Json.createObjectBuilder();
		JsonObjectBuilder jobcom = Json.createObjectBuilder();
		SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat dt2 = new SimpleDateFormat("yyyy");
		job.add("id", al.getId());
		job.add("title", al.getTitle());
		job.add("artistnum",al.getArtists().size());
		JsonArrayBuilder jab = Json.createArrayBuilder();
		for (Artist a:al.getArtists()) {
			jobcom.add("id", a.getId());
			jobcom.add("name", a.getName());
			jab.add(jobcom);
		}
		job.add("artists", jab);
		job.add("genre", al.getGenre());
		job.add("releasedate", dt1.format(al.getRelease()));
		job.add("releaseyear", dt2.format(al.getRelease()));
		return job;
}
}