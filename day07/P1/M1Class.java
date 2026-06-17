package day07.P1;

import common.Base;

public class M1Class {
    static void main() {
        Base.step(2, "Player 만들기");

        Player p1 = new Player();

        p1.name = "손흥민";
        p1.team = "한국";
        p1.goals = 0;

        System.out.println("선수생성완료");

        Base.step("필드 읽기");

        System.out.printf("선수 : %s\n국가 : %s\n득점 : %d\n", p1.name, p1.team, p1.goals);

        Base.step("New Player");

        Player p2 = new Player("이강인", "한국", 2);

        System.out.printf("선수 : %s\n국가 : %s\n득점 : %d\n", p2.name, p2.team, p2.goals);

        Base.step("한 줄 정보");

        p1.info();
        p2.info();

        Base.step("실습");

        //Player p3 = new Player("");

    }
}
