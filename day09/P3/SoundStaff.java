package day09.P3;

public class SoundStaff extends Staff{
    SoundStaff(String name){
        super(name);
    }

    @Override
    void duty() {
        System.out.printf("%s : 음향 점검\n", name);
    }

}
