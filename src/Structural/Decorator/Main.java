package Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Music song = new Song("Bohemian Rhapsody");

        song = new GenreDecorator(song, "Рок");
        song = new YearDecorator(song, 1975);

        System.out.println(song.getDescription());
    }
}
