package Structural.Flyweight;

public class Main {
    public static void main(String[] args) {
        String[] musicSheet = {"C", "D", "E", "C", "D", "E", "E", "E", "F", "G", "A", "B", "A", "G", "F"};


        for (String note : musicSheet) {
            Note musicalNote = NoteFactory.getNote(note);
            musicalNote.play();
        }
    }
}