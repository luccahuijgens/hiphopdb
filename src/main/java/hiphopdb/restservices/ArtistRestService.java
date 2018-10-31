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

import hiphopdb.database.Artist;
import hiphopdb.database.HipHopService;
import hiphopdb.database.ServiceProvider;

@Path("/artists")
public class ArtistRestService {
	HipHopService service = ServiceProvider.getService();

	@GET
	@Produces("application/json")
	public String getArtists() {
		JsonArrayBuilder jab = Json.createArrayBuilder();
		for (Artist a : service.getArtists()) {
			jab.add(createJson(a));
		}
		JsonArray array = jab.build();

		return (array.toString());
	}
	
	@GET
	@Path("{id}")
	@Produces("application/json")
	public String getArtistByID(@PathParam("id")int id) {
		Artist a=service.findArtist(id);
		JsonObjectBuilder job=createJson(a);
		return job.build().toString();
	}
	
	public JsonObjectBuilder createJson(Artist a) {
		JsonObjectBuilder job = Json.createObjectBuilder();
		SimpleDateFormat dt1 = new SimpleDateFormat("dd-mm-yyyy");
		job.add("id", a.getId());
		job.add("name", a.getName());
		job.add("realname", a.getRealname());
		job.add("birthday", dt1.format(a.getBirthday()));
		job.add("activeyear", a.getActivedate());
		job.add("bio", a.getBio());

		/*
		 * JsonArrayBuilder jab = Json.createArrayBuilder(); for (Comment
		 * c:p.getComments()) { jobcom.add("id", c.getId()); jobcom.add("author",
		 * c.getAuthor()); User u=service.getUserByName(c.getAuthor());
		 * jobcom.add("authorid", u.getId()); jobcom.add("content", c.getContent());
		 * jab.add(jobcom); } job.add("comments", jab);
		 */
		return job;
	}
}
