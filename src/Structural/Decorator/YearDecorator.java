package Structural.Decorator;

public class YearDecorator extends MusicDecorator {
    private int year;

    public YearDecorator(Music decoratedMusic, int year) {
        super(decoratedMusic);
        this.year = year;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Рік випуску: " + year;
    }
}
