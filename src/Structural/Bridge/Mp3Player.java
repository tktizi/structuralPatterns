package Structural.Bridge;

public class Mp3Player implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("MP3 програвач: Програваю музику");
    }

    @Override
    public void pause() {
        System.out.println("MP3 програвач: Пауза");
    }

    @Override
    public void stop() {
        System.out.println("MP3 програвач: Зупиняю музику");
    }
}
