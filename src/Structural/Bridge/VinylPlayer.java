package Structural.Bridge;

public class VinylPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Вініловий програвач: Програваю музику");
    }

    @Override
    public void pause() {
        System.out.println("Вініловий програвач: Пауза не підтримується");
    }

    @Override
    public void stop() {
        System.out.println("Вініловий програвач: Зупиняю музику");
    }
}
