package Structural.Proxy;

import java.util.List;

public interface MusicLibrary {
    void addSong(String songName);

    List<String> getSongs();
}
