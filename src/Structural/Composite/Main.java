package Structural.Composite;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Song 1");
        Song song2 = new Song("Song 2");
        Song song3 = new Song("Song 3");

        Playlist playlist1 = new Playlist();
        playlist1.add(song1);
        playlist1.add(song2);

        Playlist playlist2 = new Playlist();
        playlist2.add(song3);

        Playlist mainPlaylist = new Playlist();
        mainPlaylist.add(playlist1);
        mainPlaylist.add(playlist2);

        mainPlaylist.play();
    }
}
