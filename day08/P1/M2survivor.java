package day08.P1;

import common.Base;


public class M2survivor {
    static void main() {
        Base.step("기본 방식 등록");

        Survivor s1 = new Survivor();

        s1.name = "Junho";
        s1.hp = 100;
        s1.ammo = 5;

        s1.info();

        Base.step("한줄로 등록");

        Survivor s2 = new Survivor("준호", 100, 5);

        s2.info();

        Base.step("입력으로 등록");

        //
    }
}
