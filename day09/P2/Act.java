package day09.P2;

public class Act {

    String title;
    int durationSec;

    Act(String title, int durationSec) {
        this.title = title;
        this.durationSec = durationSec;
    }

    void perform() {
        System.out.println("무대 진행: " + title);
    }

    String info() {
        return title + " (" + durationSec + "초)";
    }

    public String toString(){
        return "%s (%d초)".formatted(title, durationSec);
    }
}
