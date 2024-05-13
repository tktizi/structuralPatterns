package Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        MusicPlayer mp3Player = new Mp3Player();

        MusicController mp3Controller = new SimpleMusicController(mp3Player);

        mp3Controller.playMusic();
        mp3Controller.pauseMusic();
        mp3Controller.playMusic();
        mp3Controller.stopMusic();

        MusicPlayer vinylPlayer = new VinylPlayer();

        MusicController vinylController = new SimpleMusicController(vinylPlayer);

        vinylController.playMusic();
        vinylController.stopMusic();
    }
}
