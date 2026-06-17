package day07.P1;

import java.util.ArrayList;
import common.Base;

public class M4ArrayList2 {

    static void printPlayer(Player p){
        System.out.printf("[선수 정보] %s / %s / %d골\n",
                p.name, p.team, p.goals);
    }

    static void main() {

        Base.step("선수단 명단");

        Player p1 = new Player("손흥민", "한국", 2);
        Player p2 = new Player("김민재", "한국", 0);
        Player p3 = new Player("이강인", "한국", 1);
        Player p4 = new Player("황희찬", "한국", 5);

        ArrayList<Player> players = new ArrayList<>();

        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);

        for (Player p: players){
            p.info();
        }

        Base.step("팀 골 총합");

        int total=0;

        for (Player p:players){
            total += p.goals;
        }

        double mean = (double)total/players.size();

        System.out.printf("팀 총 득점 : %d\n", total);

        Base.step("팀 골 평균");

        System.out.printf("팀 평균 골 : %.2f\n", mean);

        Base.step("득점왕");

        // 이때 best는 포인터에 가까움
        Player best = players.get(0);
        for (Player p:players){
            if (p.goals > best.goals){
                best = p;
            }
        }

        System.out.printf("득점왕 : %s (%d골)\n", best.name, best.goals);

        Base.step("다득점 필터링");

        for (Player p: players){
            if (p.goals >= 3) {
                System.out.printf("%s - %d골\n", p.name, p.goals);
            }
        }

        Base.step("Methods");

        printPlayer(players.get(0));
        printPlayer(best);

        Base.step("실습");

        Player worst = players.get(0);
        for (Player p:players){
            if (p.goals < worst.goals){
                worst = p;
            }
        }

        worst.info();
        printPlayer(worst);
    }
}
