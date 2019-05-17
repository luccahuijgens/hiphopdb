package hiphopdb.database;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import jersey.repackaged.com.google.common.collect.Lists;

public class HipHopService {
private static HipHopService instance;
private DataSource data;
private ArrayList<Album>albums;
private ArrayList<Artist>artists;
private ArrayList<Playlist>playlists;

private HipHopService() {
	   data=new DataSource();
	   albums=data.GetAlbums();
	   artists=data.GetArtists();
	   playlists=data.GetPlaylists();
}

public static HipHopService getInstance() {
	if (instance==null) {
		instance=new HipHopService();
	}
	return instance;
}
public ArrayList<Album> getAlbums(){
	return albums;
}
public ArrayList<Artist> getArtists(){
	return artists;
}
public ArrayList<Track> GetTracksByArtist(Artist find){
	ArrayList<Track>tracks=new ArrayList<Track>();
	for (Album a:albums){
		for (Artist art:a.getArtists()){
			if (art.equals(find)){
				tracks.addAll(a.getTracks());
			}
		}
	}
	return tracks;
}
public ArrayList<Track> getMostPlayed(){
	ArrayList<Track>tracks=data.getTracks();
	Collections.sort(tracks, new Comparator<Track>() {

        public int compare(Track o1, Track o2) {
            // compare two instance of `Score` and return `int` as result.
            return Integer.compare(o1.getStreams(), o2.getStreams());
        }
    });
	Collections.reverse(tracks);
	return tracks;
}
public ArrayList<Track> getMostPlayedByArtist(Artist a){
	ArrayList<Track>tracks=GetTracksByArtist(a);
	Collections.sort(tracks, new Comparator<Track>() {

        public int compare(Track o1, Track o2) {
            // compare two instance of `Score` and return `int` as result.
            return Integer.compare(o1.getStreams(), o2.getStreams());
        }
    });
	Collections.reverse(tracks);
	return tracks;
}
public Artist findArtist(int id) {
	for (Artist a:artists) {
		if (a.getId()==id) {
			return a;
		}
	}
	return null;
}
public ArrayList<Album> getAlbumsByArtist(int id) {
	ArrayList<Album>result=new ArrayList<Album>();
	Artist a=findArtist(id);
	for (Album al:albums) {
		for (Artist art:al.getArtists()) {
			if (a.equals(art)) {
				result.add(al);
			}
		}
	}
	return result;
}
public Album getAlbumByID(int id) {
	for (Album a:albums) {
		if (a.getId()==id) {
			return a;
		}
	}
	return null;
}
public ArrayList<Playlist> getPlaylists(){
	ArrayList<Playlist>PL=new ArrayList<Playlist>();
	for (Playlist p:playlists) {
		PL.add(p);
	}
	return PL;
}
public Playlist findPlaylist(int id) {
	for (Playlist p:playlists) {
		if(p.getId()==id) {
			return p;
		}
	}
	return null;
}
public ArrayList<Track> getTracksByPlaylistID(int id) {
	Playlist result=null;
	for (Playlist p:playlists) {
		if(p.getId()==id) {
			result=p;
		}
	}
	return result.getTracks();
}
}