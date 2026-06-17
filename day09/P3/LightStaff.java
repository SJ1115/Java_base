package day09.P3;

public class LightStaff extends Staff{
    LightStaff(String name){
        super(name);
    }

    @Override
    void duty() {
        System.out.printf("%s : 조명 세팅\n", name);
    }

}
