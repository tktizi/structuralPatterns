package Structural.Composite;
import java.util.ArrayList;
import java.util.List;

public class Playlist implements MusicComponent {
    private List<MusicComponent> components = new ArrayList<>();

    public void add(MusicComponent component) {
        components.add(component);
    }

    @Override
    public void play() {
        System.out.println("Playing playlist:");
        for (MusicComponent component : components) {
            component.play();
        }
    }
}
