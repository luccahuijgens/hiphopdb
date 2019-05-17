package hiphopdb.database;

import java.util.ArrayList;
import java.util.List;

public class Track {
private int id;
private String title;
private List<Artist>artists;
private int streams;
private int length;
private String url;

public Track(int id, String title, int streams,int length, String url) {
	super();
	this.id = id;
	this.title = title;
	this.streams=streams;
	this.length = length;
	this.url = url;
	this.artists=new ArrayList<>();
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
public int getStreams() {
	return streams;
}
public void setStreams(int streams) {
	this.streams = streams;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public void addArtist(Artist a) {
	this.artists.add(a);
}



}
