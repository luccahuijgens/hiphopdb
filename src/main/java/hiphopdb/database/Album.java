package hiphopdb.database;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Album {
private int id;
private String title;
private List<Artist> artists;
private String genre;
private Date release;
private List<Track> tracks;

public Album(int id, String title, String genre, Date release) {
	super();
	this.id = id;
	this.title = title;
	this.artists = new ArrayList<>();
	this.genre = genre;
	this.release = release;
	this.tracks = new ArrayList<>();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public List<Artist> getArtists() {
	return artists;
}
public void setArtists(List<Artist> artists) {
	this.artists = artists;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public Date getRelease() {
	return release;
}
public void setRelease(Date release) {
	this.release = release;
}
public List<Track> getTracks() {
	return tracks;
}
public void setTracks(List<Track> tracks) {
	this.tracks = tracks;
}
public void addArtist(Artist a) {
	this.artists.add(a);
}
public void addTrack(Track t) {
	this.tracks.add(t);
}

}
