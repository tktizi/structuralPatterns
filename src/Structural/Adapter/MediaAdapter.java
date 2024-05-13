package Structural.Adapter;

public class MediaAdapter implements MediaPlayer {
    private final AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(AdvancedMediaPlayer advancedMusicPlayer) {
        this.advancedMusicPlayer = advancedMusicPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMusicPlayer.playMp4(fileName);
    }
}
