package day09.P2;

public class Dance extends Act{
    String moveName;

    Dance(String title, int durationSec, String moveName) {
        super(title, durationSec);
        this.moveName = moveName;
    }

    String detail(){
        return super.info() + "\t안무 : " + moveName;
    }

    @Override
    void perform(){
        System.out.printf("춤을 춥니다 : %s\n  - 안무 : %s\n", title, moveName);
    }

    @Override
    public String toString(){
        return "[춤] " + super.toString();
    }
}
