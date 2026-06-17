package day09.P2;

public class Talk extends Act{
    String message;

    Talk(String title, int durationSec, String message) {
        super(title, durationSec);
        this.message = message;
    }

    String detail(){
        return super.info() + "\t멘트 : " + message;
    }

    @Override
    void perform(){
        System.out.printf("말을 합니다 : %s\n  - 멘트 : %s\n", title, message);
    }

    @Override
    public String toString(){
        return "[멘트] " + super.toString();
    }
}
