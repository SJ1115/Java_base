package day08.P2;

import common.Base;

public class M1Private {

    static void main() {
        Base.step("직접 바꾸기");

        Survivor s = new Survivor("준호", 100,5);
        s.info();

        //s.hp = -50;
        s.info();

        Base.step("통로로 읽기");
        System.out.printf("이름 : %s\n체력 : %d\n탄약 : %d\n", s.getName(), s.getHp(), s.getAmmo());

        Base.step("통로로 바꾸기");

        s.setHp(80);
        s.setAmmo(10);

        System.out.print("변경 후 : ");
        s.info();

        Base.step("통로에서 거르기");

        s.setHp(-50);
        System.out.print("- 변경 : ");
        s.info();

        s.setHp(999);
        System.out.print("+ 변경 : ");
        s.info();

        Base.step("실습");

        s.setAmmo(-10);
        System.out.print("- 변경 : ");
        s.info();

        s.setAmmo(99);
        System.out.print("+ 변경 : ");
        s.info();
    }
}
