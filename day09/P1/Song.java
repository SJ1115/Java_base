package day09.P1;

public class Song {
    String title;
    int durationSec;

    Song(String title, int durationSec) {
        this.title = title;
        this.durationSec = durationSec;
    }

    void info() {
        System.out.printf("%s (%d초)\n", title, durationSec);
    }
}
