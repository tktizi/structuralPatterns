package Structural.Bridge;

public class SimpleMusicController extends MusicController {
    public SimpleMusicController(MusicPlayer player) {
        super(player);
    }

    @Override
    void playMusic() {
        player.play();
    }

    @Override
    void pauseMusic() {
        player.pause();
    }

    @Override
    void stopMusic() {
        player.stop();
    }
}
