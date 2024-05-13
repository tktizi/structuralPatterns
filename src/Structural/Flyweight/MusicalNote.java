package Structural.Flyweight;

public class MusicalNote implements Note {
    private final String note;

    public MusicalNote(String note) {
        this.note = note;
    }

    @Override
    public void play() {
        System.out.println("Playing note " + note);
    }
}

