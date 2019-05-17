package hiphopdb.database;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HipHopService {
private static HipHopService instance;

private DataSource data;
private ArrayList<Album>albums;
private ArrayList<Artist>artists;
private ArrayList<Playlist>playlists;

private HipHopService() {
	   data=new DataSource();
	   albums=new ArrayList<>(data.getAlbums());
	   artists=new ArrayList<>(data.getArtists());
	   playlists=new ArrayList<>(data.getPlaylists());
}

public static HipHopService getInstance() {
	if (instance==null) {
		instance=new HipHopService();
	}
	return instance;
}

public List<Album> getAlbums(){
	return albums;
}
public List<Artist> getArtists(){
	return artists;
}
public List<Track> getTracksByArtist(Artist find){
	ArrayList<Track>tracks=new ArrayList<>();
	for (Album album:albums){
		for (Artist artist:album.getArtists()){
			if (artist.equals(find)){
				tracks.addAll(album.getTracks());
			}
		}
	}
	return tracks;
}
public List<Track> getMostPlayed(){
	ArrayList<Track>tracks=new ArrayList<>(data.getTracks());
	Collections.sort(tracks, new Comparator<Track>() {
        public int compare(Track o1, Track o2) {
            // compare two instance of `Score` and return `int` as result.
            return Integer.compare(o1.getStreams(), o2.getStreams());
        }
    });
	Collections.reverse(tracks);
	return tracks;
}
public List<Track> getMostPlayedByArtist(Artist a){
	ArrayList<Track>tracks=new ArrayList<>(getTracksByArtist(a));
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
	for (Artist artist:artists) {
		if (artist.getId()==id) {
			return artist;
		}
	}
	return null;
}
public List<Album> getAlbumsByArtist(int id) {
	ArrayList<Album>result=new ArrayList<>();
	Artist artist=findArtist(id);
	for (Album album:albums) {
		for (Artist albumartist:album.getArtists()) {
			if (artist.equals(albumartist)) {
				result.add(album);
			}
		}
	}
	return result;
}
public Album getAlbumByID(int id) {
	for (Album album:albums) {
		if (album.getId()==id) {
			return album;
		}
	}
	return null;
}
public List<Playlist> getPlaylists(){
	return playlists;
}
public Playlist findPlaylist(int id) {
	for (Playlist playlist:playlists) {
		if(playlist.getId()==id) {
			return playlist;
		}
	}
	return null;
}
public List<Track> getTracksByPlaylistID(int id) {
	Playlist result=null;
	for (Playlist playlist:playlists) {
		if(playlist.getId()==id) {
			result=playlist;
		}
	}
	if (result!=null) {
	return result.getTracks();
	}else {
		return new ArrayList<Track>();
	}
}
}
