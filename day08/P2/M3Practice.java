package day08.P2;

import java.util.Scanner;
import java.util.ArrayList;

import common.Base;

public class M3Practice {

    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Survivor> camp = new ArrayList<>();      // 무엇을 담는 명단인가

        System.out.println();
        System.out.println("==== Step 1: 생존자 등록 ====");
        Base.step("생존자 등록");
/*
        System.out.println("이름을 입력하세요 (빈 줄 또는 끝 입력 시 종료)");

        while (true) {
            System.out.print("이름: ");
            String name = sc.nextLine();
            if (name.isEmpty() || name.equals("끝")) {   // 글자 내용 비교는 무엇으로
                break;
            }

            System.out.print("체력: ");
            int hp = Integer.parseInt(sc.nextLine());      // 숫자 한 줄 읽어 정수로

            System.out.print("탄약: ");
            int ammo = Integer.parseInt(sc.nextLine());

            Survivor s = new Survivor(name, hp, ammo);     // 입력값으로 객체 한 줄 생성
            camp.add(s);                              // 명단에 담기
            System.out.print("→ 등록 완료: ");
            s.info();
        }*/


        camp.add(new Survivor("준호", 100, 5));
        camp.add(new Survivor("미라", 80, 2));
        System.out.println("등록된 생존자: " + camp.size() + "명");

        Base.step("좀비 웨이브 1");

        int damage = 30;
        for (Survivor s : camp) {
            s.setHp(s.getHp() - damage);                  // 지금 체력 읽어 피해만큼 깎아 통로로
            System.out.println(s.getName() + " 피격! → 체력 " + s.getHp());
        }

        Base.step("웨이브 추가공격");

        int waves = 3;
        for (int w = 1; w <= waves; w++) {                // 웨이브 횟수만큼 반복
            System.out.println("[웨이브 " + w + "]");
            for (Survivor s : camp) {                     // 매 웨이브마다 명단 전체
                s.setHp(s.getHp() - damage);                // 피해량만큼 깎기
                System.out.println("  " + s.getName() + " → 체력 " + s.getHp());
            }
        }

        Base.step("캠프 현황");

        int hpSum = 0;
        int aliveCount = 0;
        for (Survivor s : camp) {
            hpSum = hpSum + s.getHp();                    // 체력 누적
            if (s.getHp() > 0) {                       // 살아있음 조건
                aliveCount++;
            }
        }
        double avgHp = (double) hpSum / camp.size();        // 정수 나눗셈 함정 피하기

        System.out.println("캠프 총원(static): " + Survivor.campCount + "명");  // 공유 카운터 접근
        System.out.println("평균 체력: " + avgHp);
        System.out.println("생존 인원(체력 > 0): " + aliveCount + "명");


        Base.step("실습");

        camp.get(0).setHp(30);
        camp.get(1).setHp(20);
        camp.add(new Survivor("박씨", 10, 4));
        camp.add(new Survivor("김씨", 15, 8));

        System.out.println("보급이전");
        Survivor p = camp.get(0);
        for (Survivor s:camp){
            s.info();
            if (p.getHp() > s.getHp()){
                p = s;
            }
        }
        System.out.printf("가장 위태로운 생존자 : %s (체력 %d)\n", p.getName(), p.getHp());

        p.setHp(p.getHp()+40);

        System.out.printf("보급 완료 : %s 체력 %d\n", p.getName(), p.getHp());





    }
}