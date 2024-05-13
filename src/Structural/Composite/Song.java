package Structural.Composite;

// Листок
public class Song implements MusicComponent {
    private String name;

    public Song(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + name);
    }
}
