package day07.P1;

import java.util.ArrayList;
import common.Base;

public class M3ArrayList {
    public static void main(){

        Base.step("선수들 만들기");
        Player p1 = new Player("손흥민", "한국", 2);
        Player p2 = new Player("김민재", "한국", 0);
        Player p3 = new Player("이강인", "한국", 1);

        System.out.println("생성 완료");

        Player[] l1 = {p1, p2};

        Base.step("리스트에 담기");

        ArrayList<Player> players = new ArrayList<>();

        players.add(p1);
        players.add(p2);
        players.add(p3);

        System.out.printf("명단 선수 : %d명\n", players.size());

        Base.step("명단 호명");

        for (Player p: players){
            p.info();
        }

        Base.step("골 기록");

        int totalGoals = 0;

        for (Player p: players){
            System.out.printf("%s 선수 %d골\n", p.name, p.goals);
            totalGoals += p.goals;
        }
        System.out.printf("팀 전체 골 합계 : %d골\n", totalGoals);

        Base.step("실습");

        players.add(new Player("오바마", "미국", 50));
        players.add(new Player("트럼프", "미국", 50));

        for (Player p: players){
            System.out.printf("%s 선수 %d골\n", p.name, p.goals);
            totalGoals += p.goals;
        }
        System.out.printf("총 선수 : %d명\n", players.size());

    }
}
