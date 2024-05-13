package Structural.Facade;

// Main class
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        MusicPlayerFacade musicPlayerFacade = new MusicPlayerFacade(audioPlayer, new Amplifier(), new MusicLibrary());

        System.out.println("=== Playing music ===");
        musicPlayerFacade.playMusic();

        System.out.println("\n=== Pausing music ===");
        musicPlayerFacade.pauseMusic();

        System.out.println("\n=== Stopping music ===");
        musicPlayerFacade.stopMusic();
    }
}
