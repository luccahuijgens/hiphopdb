// Dependencies:
// https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js
// https://cdnjs.cloudflare.com/ajax/libs/html5media/1.1.8/html5media.min.js
// https://cdnjs.cloudflare.com/ajax/libs/plyr/3.3.21/plyr.min.js

// Mythium Archive: https://archive.org/details/mythium/

var audio=audio = $('#audio1').on('play', function () {
    playing = true;
    npAction.text('Now Playing...');
}).on('pause', function () {
    playing = false;
    npAction.text('Paused...');
}).on('ended', function () {
    npAction.text('Paused...');
    if ((index + 1) < trackCount) {
        index++;
        loadTrack(index);
        audio.play();
    } else {
        audio.pause();
        index = 0;
        loadTrack(index);
    }
}).get(0);

var npAction = $('#npAction')
var npTitle = $('#npTitle')

var tracks=[]
var trackCount;
var index;
var playing;
var extension;

function initialize(url){
	    $.getJSON(url,function(trackdata){
	    	$.each(trackdata,function(i,data){
	    		tracks.push(data)
	    	});
	    'use strict'
	    var supportsAudio = !!document.createElement('audio').canPlayType;
	    if (supportsAudio) {
	        // initialize plyr
	        var player = new Plyr('#audio1', {
	            controls: [
	                'restart',
	                'play',
	                'progress',
	                'current-time',
	                'duration',
	                'mute',
	                'volume'
	            ]
	        });
	        // initialize playlist and controls
	        var index = 0;
	            playing = false;
	            extension = '';
	            buildPlaylist();
	        
	        extension = audio.canPlayType('audio/mpeg') ? '.mp3' : audio.canPlayType('audio/ogg') ? '.ogg' : '';
	        loadTrack(index);
	        
	    } else {
	        // boo hoo
	        $('.column').addClass('hidden');
	        var noSupport = $('#audio1').text();
	        $('.container').append('<p class="no-support">' + noSupport + '</p>');	
	        }
});
	    }

function buildPlaylist(){
	$(tracks).each(function(key, value) {
        var trackNumber = value.id,
            trackName = value.title,
            trackDuration = value.duration;
        if (trackNumber.toString().length === 1) {
            trackNumber = '0' + trackNumber;
        }
        $('#plList').append('<li> \
            <div class="plItem"> \
                <span class="plNum">' + trackNumber + '.</span> \
                <span class="plTitle">' + trackName + '</span> \
                <span class="plLength">' + trackDuration + '</span> \
            </div> \
        </li>');
    }),
    trackCount = tracks.length
}

$('#btnPrev').on('click', function () {
    if ((index - 1) > -1) {
        index--;
        loadTrack(index);
        if (playing) {
            audio.play();
        }
    } else {
        audio.pause();
        index = 0;
        loadTrack(index);
    }
})

$('#btnNext').on('click', function () {
                if ((index + 1) < trackCount) {
                    index++;
                    loadTrack(index);
                    if (playing) {
                        audio.play();
                    }
                } else {
                    audio.pause();
                    index = 0;
                    loadTrack(index);
                }
            })
function loadTrack(id) {
	$('#npTitle').text(tracks[id].artiststring+" - "+tracks[id].title);
                index = id;
                audio.src = "/hiphopdb/"+tracks[id].url;
                $('#albumcover').attr('src', '/hiphopdb/imgs/'+tracks[id].albumid+'.jpg');
            }
function playTrack(id){
	loadTrack(id);
	audio.play();
}
function playTrackByID(id){
	playtrack=null;
	$.each(tracks, function(i,track){
		if (track.id==id){
			playtrack=track;
		}
	});
	$('#npTitle').text(playtrack.artiststring+" - "+playtrack.title);
    index = tracks.indexOf(playtrack);
    audio.src = "/hiphopdb/"+playtrack.url;
    $('#albumcover').attr('src', '/hiphopdb/imgs/'+playtrack.albumid+'.jpg');
    audio.play();
}
/*jQuery(function ($) {
    tracks =[]
    $.getJSON("http://localhost:8081/hiphopdb/restservices/tracks",function(trackdata){
>>>>>>> d7d4c21846b8a53e1d5a3ca3bfeb699483429ddc
    	$.each(trackdata,function(i,data){
    		tracks.push(data)
    	});
    'use strict'
    var supportsAudio = !!document.createElement('audio').canPlayType;
    if (supportsAudio) {
        // initialize plyr
        var player = new Plyr('#audio1', {
            controls: [
                'restart',
                'play',
                'progress',
                'current-time',
                'duration',
                'mute',
                'volume'
            ]
        });
        // initialize playlist and controls
        var index = 0,
            playing = false,
            extension = '',
            buildPlaylist = $(tracks).each(function(key, value) {
                var trackNumber = value.id,
                    trackName = value.title,
                    trackDuration = value.duration;
                if (trackNumber.toString().length === 1) {
                    trackNumber = '0' + trackNumber;
                }
                $('#plList').append('<li> \
                    <div class="plItem"> \
                        <span class="plNum">' + trackNumber + '.</span> \
                        <span class="plTitle">' + trackName + '</span> \
                        <span class="plLength">' + trackDuration + '</span> \
                    </div> \
                </li>');
            }),
            trackCount = tracks.length,
            npAction = $('#npAction'),
            npTitle = $('#npTitle'),
            audio = $('#audio1').on('play', function () {
                playing = true;
                npAction.text('Now Playing...');
            }).on('pause', function () {
                playing = false;
                npAction.text('Paused...');
            }).on('ended', function () {
                npAction.text('Paused...');
                if ((index + 1) < trackCount) {
                    index++;
                    loadTrack(index);
                    audio.play();
                } else {
                    audio.pause();
                    index = 0;
                    loadTrack(index);
                }
            }).get(0),
            btnPrev = $('#btnPrev').on('click', function () {
                if ((index - 1) > -1) {
                    index--;
                    loadTrack(index);
                    if (playing) {
                        audio.play();
                    }
                } else {
                    audio.pause();
                    index = 0;
                    loadTrack(index);
                }
            }),
            btnNext = $('#btnNext').on('click', function () {
                if ((index + 1) < trackCount) {
                    index++;
                    loadTrack(index);
                    if (playing) {
                        audio.play();
                    }
                } else {
                    audio.pause();
                    index = 0;
                    loadTrack(index);
                }
            }),
            li = $('#plList li').on('click', function () {
                var id = parseInt($(this).index());
                if (id !== index) {
                    playTrack(id);
                }
            }),
            loadTrack = function (id) {
                $('.plSel').removeClass('plSel');
                $('#plList li:eq(' + id + ')').addClass('plSel');
                npTitle.text(tracks[id].artiststring+" - "+tracks[id].title);
                index = id;
                audio.src = tracks[id].url;
                $('#albumcover').attr('src', 'imgs/'+tracks[id].albumid+'.jpg');
            },
            playTrack = function (id) {
                loadTrack(id);
                audio.play();
            };
        extension = audio.canPlayType('audio/mpeg') ? '.mp3' : audio.canPlayType('audio/ogg') ? '.ogg' : '';
        loadTrack(index);
    } else {
        // boo hoo
        $('.column').addClass('hidden');
        var noSupport = $('#audio1').text();
        $('.container').append('<p class="no-support">' + noSupport + '</p>');
    }
});
<<<<<<< HEAD
});
=======
});*/
