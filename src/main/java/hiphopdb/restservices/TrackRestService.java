package hiphopdb.restservices;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
import jersey.repackaged.com.google.common.collect.Lists;

@Path("/tracks")
public class TrackRestService {
	HipHopService service = ServiceProvider.getService();

	@GET
	@Produces("application/json")
	public String TrackList() {
		JsonArrayBuilder jab = Json.createArrayBuilder();
		for (Album a : service.getAlbums()) {
			for (Track t:a.getTracks()) {
			jab.add(createJson(t));
		}}
		JsonArray array = jab.build();

		return (array.toString());
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public String TrackByID(@PathParam("id") int id) {
		JsonObjectBuilder job = Json.createObjectBuilder();
		for (Album a : service.getAlbums()) {
			for (Track t:a.getTracks()) {
			if (t.getId()==id) {
				job=createJson(t);
			}
		}}
		return (job.build().toString());
	}
	
	@GET
	@Path("/album/{id}")
	@Produces("application/json")
	public String TracksByAlbumID(@PathParam("id") int id) {
		JsonArrayBuilder jab = Json.createArrayBuilder();
		Album a=service.getAlbumByID(id);
			for (Track t:a.getTracks()) {
			jab.add(createJson(t));
		}
		return (jab.build().toString());
	}
	
	@GET
	@Path("artist/{id}/top")
	@Produces("application/json")
	public String getTopByArtistID(@PathParam("id")int id){
			JsonArrayBuilder jab = Json.createArrayBuilder();
			List<Track>list=service.GetTracksByArtist(service.findArtist(id));
			Collections.sort(list, new Comparator<Track>() {

		        public int compare(Track o1, Track o2) {
		            // compare two instance of `Score` and return `int` as result.
		            return Double.compare(o1.getStreams(), o2.getStreams());
		        }
		    });
			list=Lists.reverse(list);
			List<Track> result = new ArrayList<Track>(list.subList(0,3));
			for (Track t:result) {
				jab.add(createJson(t));
			}
				return (jab.build().toString());
			}
	@GET
	@Path("artist/{id}")
	@Produces("application/json")
	public String getTracksByArtist(@PathParam("id")int id){
			JsonArrayBuilder jab = Json.createArrayBuilder();
			List<Track>list=service.GetTracksByArtist(service.findArtist(id));
			for (Track t:list) {
				jab.add(createJson(t));
			}
				return (jab.build().toString());
			}
	@GET
	@Path("/playlist/{id}")
	@Produces("application/json")
	public String getTracksByPlaylist(@PathParam("id")int id){
			JsonArrayBuilder jab = Json.createArrayBuilder();
			ArrayList<Track>tracks=service.getTracksByPlaylistID(id);
			for (Track t:tracks) {
				jab.add(createJson(t));
			}
				return (jab.build().toString());
			}
	
	public JsonObjectBuilder createJson(Track t) {
		Album al=null;
		for (Album a: service.getAlbums()) {
			for (Track t2: a.getTracks()) {
				if (t.equals(t2)) {
					al=a;
				}
			}
		}
		JsonObjectBuilder job = Json.createObjectBuilder();
		JsonObjectBuilder jobcom = Json.createObjectBuilder();
		String artiststring="";
		for (Artist a:t.getArtists()) {
			artiststring+=a.getName()+",";
		}
		artiststring = artiststring.substring(0, artiststring.length() - 1);
		job.add("id", t.getId());
		job.add("title", t.getTitle());
		job.add("artistnum",t.getArtists().size());
		job.add("artiststring", artiststring);
		JsonArrayBuilder jab = Json.createArrayBuilder();
		for (Artist a:t.getArtists()) {
			jobcom.add("id", a.getId());
			jobcom.add("name", a.getName());
			jab.add(jobcom);
		}
		job.add("artists", jab);
		job.add("streams", t.getStreams());
		job.add("albumid", al.getId());
		job.add("album", al.getTitle());
		job.add("duration", secondsToString(t.getLength()));
		job.add("url", t.getUrl());

		/*
		 * JsonArrayBuilder jab = Json.createArrayBuilder(); for (Comment
		 * c:p.getComments()) { jobcom.add("id", c.getId()); jobcom.add("author",
		 * c.getAuthor()); User u=service.getUserByName(c.getAuthor());
		 * jobcom.add("authorid", u.getId()); jobcom.add("content", c.getContent());
		 * jab.add(jobcom); } job.add("comments", jab);
		 */
		return job;
	}
	private String secondsToString(int pTime) {
	    return String.format("%02d:%02d", pTime / 60, pTime % 60);
	}
}
