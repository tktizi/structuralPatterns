package Structural.Flyweight;
import java.util.HashMap;
import java.util.Map;

public class NoteFactory {
    private static final Map<String, Note> notes = new HashMap<>();

    public static Note getNote(String noteName) {
        if (!notes.containsKey(noteName)) {
            notes.put(noteName, new MusicalNote(noteName));
        }
        return notes.get(noteName);
    }
}
