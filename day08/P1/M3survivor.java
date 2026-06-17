package day08.P1;

import common.Base;

public class M3survivor {
    static void main() {
        Base.step("생존자 등록");

        Survivor s1 = new Survivor("준호", 100, 5);
        Survivor s2 = new Survivor("민서", 90, 3);
        Survivor s3 = new Survivor("도윤", 80, 8);

        s1.info();s2.info();s3.info();

        Base.step("탄약 빼고");

        Survivor s4 = new Survivor("서연", 70, 2);
        Survivor s5 = new Survivor("하준", 60);

        s4.info();s5.info();

        Base.step("총원 세기");

        Survivor s6 = new Survivor("지우", 100, 4);
        System.out.printf("등록후 총원 : %d\n", Survivor.campCount);

        Survivor s7 = new Survivor("나윤", 85);
        System.out.printf("등록후 총원 : %d\n", Survivor.campCount);

        Base.step("캠프 현황");

        Survivor.status();

        Base.step("정원 확인");

        if (Survivor.campCount >= Survivor.MAX_CAPACITY) {
            System.out.println("캠프가 가득 찼습니다 — 지금은 받을 수 없어요");
        } else {
            Survivor c = new Survivor("태오", 95, 6);
            System.out.print("등록 완료 : ");
            c.info();

            Survivor.status();
        }

        Base.step("실습");

        Survivor.statusWammo();
    }
}
