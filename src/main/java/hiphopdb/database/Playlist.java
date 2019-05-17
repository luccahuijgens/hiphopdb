package hiphopdb.database;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
private int id;
private String title;
private String author;
private String description;
private List<Track>tracks;

public Playlist(int id, String title, String author, String description) {
	super();
	this.id = id;
	this.title = title;
	this.author = author;
	this.description = description;
	this.tracks=new ArrayList<>();
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

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public List<Track> getTracks() {
	return tracks;
}

public void setTracks(List<Track> tracks) {
	this.tracks = tracks;
}
public void addTrack(Track t) {
	tracks.add(t);
}

}
