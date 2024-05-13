package Structural.Facade;

// Facade class
public class MusicPlayerFacade {
    private final AudioPlayer audioPlayer;
    private final Amplifier amplifier;
    private final MusicLibrary musicLibrary;

    public MusicPlayerFacade(AudioPlayer audioPlayer, Amplifier amplifier,
                             MusicLibrary musicLibrary) {
        this.audioPlayer = audioPlayer;
        this.amplifier = amplifier;
        this.musicLibrary = musicLibrary;
    }

    public void playMusic() {
        musicLibrary.load();
        amplifier.on();
        amplifier.setVolume(50);
        audioPlayer.play();
    }

    public void pauseMusic() {
        audioPlayer.pause();
    }

    public void stopMusic() {
        audioPlayer.stop();
        amplifier.off();
        musicLibrary.unload();
    }
}
