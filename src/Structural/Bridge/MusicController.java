package Structural.Bridge;

public abstract class MusicController {
    protected MusicPlayer player;

    public MusicController(MusicPlayer player) {
        this.player = player;
    }

    abstract void playMusic();
    abstract void pauseMusic();
    abstract void stopMusic();
}