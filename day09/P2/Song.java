package day09.P2;

public class Song extends Act{
    String lyricLine;

    Song(String title, int durationSec, String lyricLine) {

        super(title, durationSec);
        this.lyricLine = lyricLine;
    }

    String detail(){
        return super.info() + "\t후렴 : " + lyricLine;
    }

    @Override
    void perform(){
        System.out.printf("노래 합니다 : %s\n  - 후렴 : %s\n", title, lyricLine);
    }

    @Override
    public String toString(){
        return "[노래] " + super.toString();
    }
}
