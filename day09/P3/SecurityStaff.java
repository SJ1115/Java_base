package day09.P3;

public class SecurityStaff extends Staff{
    SecurityStaff(String name){
        super(name);
    }

    @Override
    void duty() {
        System.out.printf("%s : 입구 보안 점검\n", name);
    }

}
