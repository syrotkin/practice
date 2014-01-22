package jukebox;

import java.util.Queue;


public class Playlist {

	private Song track;

	private Queue<Song> queue;

	public Playlist(Song track, Queue<Song> queue) {		
	}

	public Song getNextTrackToPlay() {
		return queue.peek();
	}

	public void queueUpTrack(Song s) {
		queue.add(s);
	}
}