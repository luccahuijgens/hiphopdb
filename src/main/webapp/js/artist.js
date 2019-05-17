function loadArtistHeader(id){
$.getJSON("http://localhost:8081/hiphopdb/restservices/artists/"+id, function (artist){
$('#artistheader').append(
		"<img src=/hiphopdb/imgs/banner/"+id+".jpg style=width:100%;max-width:1344px; height:auto; max-height:350px;>"+
		"<div class=\"w3-display-bottomleft w3-container w3-text-white w3-padding-32 w3-hide-small\">"+
		"<h1><b>"+artist.name+"</b></h1></div>"
		);
document.title="HipHopDB - "+artist.name;
});
}

function loadTopTracks(id){
var firstalbum=0;
$.getJSON("http://localhost:8081/hiphopdb/restservices/albums/"+id+"/albums", function(albums){
	firstalbum=$(albums).first().id*5-1;
});
$.getJSON("http://localhost:8081/hiphopdb/restservices/tracks/artist/"+id+"/top",function(tracks){
$.each(tracks,function(i, track){
			$('#populairTrackTable').append("<tr onclick=playTrackByID("+track.id+")>"+
			"<td><img style=width:35px;height:35px; src=/hiphopdb/imgs/"+track.albumid+".jpg></td>"+
			"<td>"+track.title+"</td>"+
			"<td>"+track.streams+"</td></tr>");
	});
});
}

function loadAlbums(id){
var albumint=0;
const monthNames = ["January", "February", "March", "April", "May", "June",
	  "July", "August", "September", "October", "November", "December"
	];
	$.getJSON("http://localhost:8081/hiphopdb/restservices/albums/"+id+"/albums", function(albums){
		$.each(albums, function (i,album){
			albumint=album.id;
$('#albumlist').append(
"<div id=albumcontainer"+i+" class=albumcontainer style=background-color:#0a1a24>"+
"<div class=albuminfo style=padding:16px;>"+
"<img src=/hiphopdb/imgs/"+album.id+".jpg"+
" style=width:25%;height:25%;float:left;padding:8px; />"+album.releaseyear+"<br>"+
"<h1 style=float:left;>"+
	"<b>"+album.title+"</b></h1></div>"+
						"<table id=tracklist"+albumint+"><thead><tr>"+
								"<th>#</th>"+
								"<th>Title</th>"+
								"<th>Streams</th>"+
								"</tr></thead><tbody></tbody></table></div></div><br>");
								
$.getJSON("http://localhost:8081/hiphopdb/restservices/tracks/album/"+album.id, function(tracks){
	$.each(tracks, function (i,track){		
								$('#tracklist'+track.albumid).append("<tr onclick=playTrackByID("+track.id+")>"+
									"<td>"+(i+1)+"</td>"+
									"<td>"+track.title+"</td>"+
									"<td>"+track.streams+"</td></tr>");
	});
});
		});
var album=albums[albums.length-1];
var from = album.releasedate.split("-")
var f = new Date(from[1]+"-"+from[0]+"-"+from[2])
console.log(f)
$('#latestrlbody').append("<img src=/hiphopdb/imgs/"+album.id+".jpg "+
		"style=\"width: 180px; height: 180px;float: left;\" />"+
			"<span style=\"padding-left:16px;color:#ced1d3;width:70%;height:100%;float:left;\" >"+
			"<h3><b><br>"+album.title+"</b>"+
			"</h3><br>"+monthNames[f.getMonth()]+" "+f.getDay()+", "+f.getFullYear()+"</span");
	});
}