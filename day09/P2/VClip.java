package day09.P2;

public class VClip extends Act{
    String clipName;

    VClip(String title, int durationSec, String clipName) {
        super(title, durationSec);
        this.clipName = clipName;
    }

    String detail(){
        return super.info() + "\t영상 : " + clipName;
    }

    @Override
    void perform(){
        System.out.printf("영상을 켭니다 : %s\n  - 영상 : %s\n", title, clipName);
    }

    @Override
    public String toString(){
        return "[영상] " + super.toString();
    }
}
