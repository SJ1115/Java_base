package day07.P1;

import common.Base;

public class M2Method {
    static void main() {
        Base.step("선수 입장");

        Player p1 = new Player("손흥민", "대한민국", 0);


        System.out.print("득점 전 : ");
        p1.info();

        Base.step("골 넣기");

        p1.score(1);

        System.out.print("득점 후 : ");
        p1.info();

        Base.step("한줄 소개");
        p1.info();

        Base.step("필드 사용");

        System.out.printf("이름 : %s\n", p1.name);

        System.out.print("info : ");
        p1.info();

        Base.step("다득점");

        p1.score(2);

        p1.info();

        Base.step("실습");

        p1.assists(2);

        p1.info();

    }
}
