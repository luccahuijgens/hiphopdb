function loadAlbum(id){
var albumint=0;
	$.getJSON("http://localhost:8080/hiphopdb/restservices/playlists/"+id, function(playlist){
document.title="HipHopDB - "+playlist.title;
$('#albumlist').append(
"<div id=albumcontainer class=albumcontainer style=background-color:#0a1a24>"+
"<div class=albuminfo style=padding:16px;>"+
"<img src=/hiphopdb/imgs/playlist/"+playlist.id+".jpg"+
" style=width:25%;height:25%;float:left;padding:8px; />"+playlist.description+"<br><h3>"+playlist.author+"</h3>"+
"<h1 style=float:left;>"+
	"<b>"+playlist.title+"</b></h1></div>"+
						"<table id=tracklist><thead><tr>"+
								"<th>#</th>"+
								"<th>Title</th>"+
								"<th>Streams</th>"+
								"</tr></thead><tbody></tbody></table></div></div><br>");
								
$.getJSON("http://localhost:8080/hiphopdb/restservices/tracks/playlist/"+playlist.id, function(tracks){
	$.each(tracks, function (i,track){		
								$('#tracklist').append("<tr onclick=playTrackByID("+track.id+")>"+
									"<td>"+(i+1)+"</td>"+
									"<td>"+track.title+"</td>"+
									"<td>"+track.streams+"</td></tr>");
});
		});
	});
}