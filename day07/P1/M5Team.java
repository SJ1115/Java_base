package day07.P1;

import java.util.ArrayList;
import common.Base;

public class M5Team {
    static void main() {
        Base.step(2, "팀 만들기");

        Team team = new Team();
        team.name = "한국";

        System.out.printf("팀 이름 : %s\n선수 수 : %d명\n", team.name, team.players.size());

        Base.step("선수 추가");

        team.addPlayer(
                new Player(
                        "손흥민",
                        "한국",
                        2
                )
        );

        team.addPlayer(
                new Player(
                        "이강인",
                        "한국",
                        1
                )
        );

        System.out.printf("추가 후 선수 %d명\n", team.players.size());

        Base.step("선수 명단");

        team.showList();

        Base.step("팀 집계");

        int teamGoal = 0;
        for (Player p:team.players){
            teamGoal += p.goals;
        }
        System.out.printf("%s 총 선수 : %d골\n%s 총 골 : %d골\n", team.name, team.players.size(), team.name, teamGoal);

        Base.step("실습");

        Team team1 = new Team();
        team1.name = "체코";

        team1.addPlayer(
                new Player(
                        "시크",
                        "체코",
                        4
                )
        );
        team1.addPlayer(
                new Player(
                        "소우체크",
                        "체코",
                        1
                )
        );

        Team team2 = new Team();
        team2.name = "한국";

        team2.addPlayer(
                new Player(
                        "손흥민",
                        "한국",
                        2
                )
        );

        team2.addPlayer(
                new Player(
                        "황희찬",
                        "한국",
                        3
                )
        );

        team1.goals();
        team2.goals();

        team2.showList();
        team1.showList();

        System.out.printf("%s 총 골 : %d\n", team2.name, team2.goals);
        System.out.printf("%s 총 골 : %d\n", team1.name, team1.goals);

        if (team2.goals == team1.goals){
            System.out.println("무승부!");
        }




    }
}
