package Structural.Decorator;

public class GenreDecorator extends MusicDecorator {
    private String genre;

    public GenreDecorator(Music decoratedMusic, String genre) {
        super(decoratedMusic);
        this.genre = genre;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Жанр: " + genre;
    }
}

