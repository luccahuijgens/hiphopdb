package hiphopdb.database;

import java.util.ArrayList;
import java.util.Date;

public class Album {
private int id;
private String title;
private ArrayList<Artist> artists;
private String genre;
private Date release;
private ArrayList<Track> tracks;

public Album(int id, String title, String genre, Date release) {
	super();
	this.id = id;
	this.title = title;
	this.artists = new ArrayList<Artist>();
	this.genre = genre;
	this.release = release;
	this.tracks = new ArrayList<Track>();
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
public ArrayList<Artist> getArtists() {
	return artists;
}
public void setArtists(ArrayList<Artist> artists) {
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
public ArrayList<Track> getTracks() {
	return tracks;
}
public void setTracks(ArrayList<Track> tracks) {
	this.tracks = tracks;
}
public void addArtist(Artist a) {
	this.artists.add(a);
}
public void addTrack(Track t) {
	this.tracks.add(t);
}

}
