package jukebox;

public class TrackSelector {

	private Song currentSong;

	public TrackSelector(Song s) {
		currentSong = s;
	}

	public void setCurrentSong(Song s) {
		currentSong = s;
	}
	public Song getCurrentSong() {
		return currentSong;
	}
}
