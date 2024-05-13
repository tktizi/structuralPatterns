package Structural.Proxy;

import java.util.ArrayList;
import java.util.List;

public class RealMusicLibrary implements MusicLibrary {
    private List<String> songs;

    public RealMusicLibrary() {
        this.songs = new ArrayList<>();
    }

    @Override
    public void addSong(String songName) {
        songs.add(songName);
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}