package day06;

import java.util.ArrayList;

public class Homework {

    static int sum(int[] list){
        int out = 0;
        for(int n: list) out += n;
        return out;
    }

    static double mean(int[] list){
        int sum = sum(list);
        return (double)sum/list.length;
    }

    static void showAct(ArrayList<String> actions){
        for (String a : actions){
            System.out.printf("  - %s\n", a);
        }
    }

    static void addAct(String act, ArrayList<String> actions) {
        if (actions.contains(act)){
            System.out.printf("%s - 이미 해봄\n", act);
        } else {
            System.out.printf("%s - 새로 시도\n", act);
            actions.add(act);
        }
    }

        static void main() {
        Base.step("졸음 지수 기록");

        int[] drowsy = {2, 4, 5, 9, 7};

        System.out.printf("측정 교시 : %d\n1교시 졸음 : %d\n5교시 졸음 : %d\n", drowsy.length, drowsy[0], drowsy[4]);

        Base.step("교시별 졸음량");

        for(int i=0; i<drowsy.length; i++){
            System.out.printf("%d교시 졸음 지수 : %d\n", i+1, drowsy[i]);
        }

        Base.step("하루 졸음 총합");

        System.out.printf("졸음 총합 : %d\n", sum(drowsy));
        System.out.printf("졸음 평균 : %.1f", mean(drowsy));

        Base.step("가장 졸린 시간");

        int maxi=0;
        int maxd=0;
        for (int i=0; i<drowsy.length; i++){
            if (maxd < drowsy[i]){
                maxd = drowsy[i];
                maxi = i;
            }
        }

        System.out.printf("가장 졸린 교시 : %d교시 (졸음 %d)\n", maxi+1, maxd);

        Base.step("졸음 위험 시간");

        int cnt = 0;
        for (int d : drowsy){
            if (d>=7) {cnt ++;}
        }

        System.out.printf("졸음 위험(7이상) 교시 : %d개\n", cnt);

        Base.step("졸음 깨우기 행동");

        ArrayList<String> actions = new ArrayList<>();
        actions.add("커피");
        actions.add("세수");
        actions.add("스트레칭");

        System.out.printf("졸음 깨우기 시도 : %d가지\n", actions.size());

        Base.step("행동 목록");

        System.out.printf("첫 행동 : %s\n", actions.get(0));

        showAct(actions);

        Base.step("효과없는행동제거");

        actions.remove("스트레칭");
        System.out.printf("남은 행동 : %d가지\n", actions.size());
        showAct(actions);

        Base.step("새 행동만 추가");

        addAct("커피", actions);
        addAct("창문 열기", actions);

        Base.step("졸음 리포트");

        System.out.printf("[졸음 리포트] 평균 졸음 %.1f / 최고 졸림 %d교시 / 깨우기 시도 %d가지\n", mean(drowsy), maxi, actions.size());
    }
}
