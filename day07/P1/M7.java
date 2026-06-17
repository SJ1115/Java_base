package day07.P1;

import java.util.ArrayList;
import common.Base;

public class M7 {
    static void printRoster(Team t) {
        System.out.println("[" + t.name + " 명단] " + t.players.size() + "명");   // 선수 수
        for (Player p : t.players) {                       // 팀 안의 어느 목록을 도나
            System.out.print("  - ");
            p.info();// 선수 한 줄 정보
        }
    }

    // (2) 한 팀 총 골 — 누적 후 반환
    static int totalGoals(Team t) {
        int total = 0;                                  // for 밖 선언
        for (Player p : t.players) {
            total = total + p.goals;                     // 각 선수 골 누적
        }
        return total;                                     // 합계 돌려주기
    }

    // (3) 최강팀 — 총 골이 가장 많은 Team 객체 반환 (totalGoals 재사용)
    static Team strongestTeam(ArrayList<Team> group) {
        Team best = group.get(0);                       // 첫 팀을 일단 후보로
        for (Team t : group) {
            if (totalGoals(t) > totalGoals(best)) {     // 후보 팀 총 골과 비교
                best = t;                            // 더 많이 넣은 팀으로 교체
            }
        }
        return best;
    }

    // My - Weekest Team
    static Team weekestTeam(ArrayList<Team> group) {
        Team worst = group.get(0);                       // 첫 팀을 일단 후보로
        for (Team t : group) {
            if (totalGoals(t) < totalGoals(worst)) {     // 후보 팀 총 골과 비교
                worst = t;                            // 더 많이 넣은 팀으로 교체
            }
        }
        return worst;
    }

    // (4) 대회 득점왕 — 모든 팀의 모든 선수를 중첩 for로 비교
    static Player tournamentTopScorer(ArrayList<Team> group) {
        Player best = group.get(0).players.get(0);      // 첫 팀의 첫 선수를 후보로
        for (Team t : group) {                          // 바깥: 팀 순회
            for (Player p : t.players) {                   // 안쪽: 그 팀 선수 순회
                if (p.goals > best.goals) {
                    best = p;                        // 더 많이 넣은 선수로 교체
                }
            }
        }
        return best;
    }
    /////////////////////////////////////
    static void main() {
        Base.step(2, "조 편성");

        Team t1 = new Team();
        t1.name = "체코";
        Player g1 = new Player();
        g1.name = "시크";
        g1.team = t1.name;
        g1.goals = 3;
        Player g2 = new Player();
        g2.name = "소우체크";
        g2.team = t1.name;
        g2.goals = 2;

        t1.addPlayer(g1);
        t1.addPlayer(g2);

        Team t2 = new Team();
        t2.name = "대한민국";
        Player n1 = new Player();
        n1.name = "손흥민";
        n1.team = t2.name;
        n1.goals = 4;
        Player n2 = new Player();
        n2.name = "황희찬";
        n2.team = t2.name;
        n2.goals = 3;
        t2.addPlayer(n1);
        t2.addPlayer(n2);

        Team t3 = new Team();
        t3.name = "멕시코";
        Player d1 = new Player();
        d1.name = "라울";
        d1.team = t3.name;
        d1.goals = 1;
        Player d2 = new Player();
        d2.name = "에드손";
        d2.team = t3.name;
        d2.goals = 2;
        t3.addPlayer(d1);
        t3.addPlayer(d2);

        ArrayList<Team> group = new ArrayList<>();

        group.add(t1);                                // 팀을 조에 담기
        group.add(t2);
        group.add(t3);

        System.out.println("조 편성 완료 — " + group.size() + "개 팀");

        Base.step("조별 명단");

        for (Team t : group) {        // 조를 순회
            printRoster(t);       // 꺼낸 팀을 통째로 넘기기
        }

        Base.step("팀당 총 골");

        int leagueTotal = 0;                  // for 밖 선언
        for (Team t : group) {
            int sum = totalGoals(t);       // 이 팀 총 골
            System.out.println(t.name + ": " + sum + "골");
            leagueTotal = leagueTotal + sum; // 리그 합계에 누적
        }
        System.out.println("리그 전체: " + leagueTotal + "골");

        Base.step("최강 팀 + 대회 득점왕");

        Team best = strongestTeam(group);          // 조를 통째로 넘기기
        Player ace = tournamentTopScorer(group);   // 조를 통째로 넘기기

        System.out.println("최강팀: " + best.name + " (" + totalGoals(best) + "골)");
        System.out.println("대회 득점왕: " + ace.name + " (" + ace.team + ", " + ace.goals + "골)");  // 득점왕 이름

        System.out.println("[조별리그 리포트] " + group.size() + "개 팀 | 리그 "
                + leagueTotal + "골 | 최강팀 " + best.name
                + " | 득점왕 " + ace.name);

        Base.step("실습");

        Team worst = weekestTeam(group);
        System.out.printf("꼴찌 팀: %s (%d골)\n", worst.name, totalGoals(worst));

        double meanGoal = (double)leagueTotal/group.size();
        System.out.printf("리그 평균 : %.1f골\n", meanGoal);

        int upperCnt = 0;

        for (Team t:group){
            if((double)totalGoals(t) > meanGoal){
                upperCnt++;
            }
        }
        System.out.printf("평균보다 많이 넣은 팀 : %d\n", upperCnt);

    }
}
