package day08.P2;

import common.Base;

import java.util.Scanner;
import java.util.ArrayList;

public class M2All {
    static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Survivor> camp = new ArrayList<>();

        Base.step(2, "생존자 등록하기");

/*        while (true){
            System.out.println("-- 이름 --");
            String name = sc.nextLine();

            if (name.isEmpty() || name.trim().equals("끝")){
                break;
            }

            System.out.println("-- 체력 --");
            int hp = Integer.parseInt(sc.nextLine());

            System.out.println("-- 탄약 --");
            int ammo = Integer.parseInt(sc.nextLine());

            Survivor s = new Survivor(name,hp,ammo);
            camp.add(s);
            System.out.print("등록 완료 : ");
            s.info();
        }

        System.out.printf("등록된 생존자 : %d 명\n", camp.size());*/

        camp.add(new Survivor(
                "준호",
                120,
                5
        ));

        camp.add(new Survivor(
                "미라",
                40,
                2
        ));

        System.out.printf("등록된 생존자 : %d 명\n", camp.size());

        Base.step("캠프 명단");

        for (Survivor s:camp){
            s.info();
        }

        Base.step("캠프 현황");

        int hpSum = 0;
        for (Survivor s:camp){hpSum += s.getHp();}

        double meanHp = (double)hpSum / camp.size();

        System.out.printf("캠프 총원 %d명\n명단 인원 %d명\n평균 체력 %.1f\n", Survivor.campCount, camp.size(), meanHp);

        Base.step("실습");

        int week = 0;
        for (Survivor s:camp){
            if (s.getHp()<50) {
                week++;
                System.out.printf("[위험] %s - 체력 %d\n", s.getName(), s.getHp());
            }
        }

        System.out.printf("위험 생존자 %d명\n", week);
    }
}
