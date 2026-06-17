package day09.P3;

public class MediaStaff extends Staff{
    MediaStaff(String name){
        super(name);
    }

    @Override
    void duty() {
        System.out.printf("%s : 카메라 세팅\n", name);
    }

}
