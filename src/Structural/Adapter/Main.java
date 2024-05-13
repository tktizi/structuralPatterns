package Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");

        audioPlayer = new MediaAdapter(new Mp4Player());
        audioPlayer.play("mp4", "movie.mp4");
    }
}