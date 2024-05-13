package Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new RealMusicLibrary();
        musicLibrary.addSong("Bohemian Rhapsody by Queen");
        musicLibrary.addSong("Bohemian Rhapsody by Queen");
        System.out.println(musicLibrary.getSongs());
        System.out.println("======================");
        musicLibrary = new UniqueMusicLibraryProxy();
        musicLibrary.addSong("Bohemian Rhapsody by Queen");
        musicLibrary.addSong("Bohemian Rhapsody by Queen");
        System.out.println(musicLibrary.getSongs());

    }
}
