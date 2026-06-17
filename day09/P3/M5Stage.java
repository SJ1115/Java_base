package day09.P3;

import common.Base;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class M5Stage {
    static void main() {
        Base.step("공통부모 생성");

        Staff s0 = new Staff("김대기");
        s0.duty();

        Base.step("역할별 스태프");

        SecurityStaff s1 = new SecurityStaff("최안보");
        SoundStaff s2 = new SoundStaff("박소리");
        LightStaff s3 = new LightStaff("이광명");

        s1.duty(); s2.duty(); s3.duty();

        Base.step("공연전 점호");

        ArrayList<Staff> crew = new ArrayList<>();

        crew.add(s1);
        crew.add(s2);
        crew.add(s3);

        for (Staff s: crew){
            s.duty();
        }

        Base.step("보안 작업");

        for (Staff s: crew){
            if (s instanceof SecurityStaff){
                System.out.print("무대 앞 통제 : ");
                s.info();
            }
        }

        Base.step("실습");

        crew.add(new MediaStaff("송출중"));

        for (Staff s: crew){
            s.duty();
        }




    }
}
