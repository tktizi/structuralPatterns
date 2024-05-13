package Structural.Proxy;

import java.util.List;

public class UniqueMusicLibraryProxy implements MusicLibrary {
    private final MusicLibrary realMusicLibrary;

    public UniqueMusicLibraryProxy() {
        this.realMusicLibrary = new RealMusicLibrary();
    }

    @Override
    public void addSong(String newSong) {
        if (!realMusicLibrary.getSongs().contains(newSong)) {
            realMusicLibrary.addSong(newSong);
        }
    }

    @Override
    public List<String> getSongs() {
        return realMusicLibrary.getSongs();
    }
}
