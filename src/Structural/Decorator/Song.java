package Structural.Decorator;

public class Song implements Music {
    private String title;

    public Song(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return "Пісня: " + title;
    }
}
