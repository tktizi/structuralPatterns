package Structural.Decorator;

public abstract class MusicDecorator implements Music {
    protected Music decoratedMusic;

    public MusicDecorator(Music decoratedMusic) {
        this.decoratedMusic = decoratedMusic;
    }

    @Override
    public String getDescription() {
        return decoratedMusic.getDescription();
    }
}
