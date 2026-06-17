package day07.H1;

import common.Base;

import java.util.ArrayList;

public class Main {
    static void main() {
        //1
        Base.step("Suspect found");

        Suspect s1 = new Suspect(
                "아스트로",
                false, false,
                "초코바"
        );

        System.out.printf("%s 등록 완료\n", s1.name);

        //2
        Base.step("Suspect 신상");

        s1.showEach();

        //3
        Base.step("한 줄 소개");

        s1.showAtOne();

        //4
        Base.step("용의자가 여러명");

        Suspect s2 = new Suspect("코디", false, true, "감자칩");
        Suspect s3 = new Suspect("클라우디", true, true, "사탕");

        ArrayList<Suspect> suspects = new ArrayList<>();

        suspects.add(s1);
        suspects.add(s2);
        suspects.add(s3);

        System.out.printf("등록된 용의자 %d명\n", suspects.size());

        //5
        Base.step("단서 평가");

        for (Suspect s: suspects){
            s.suspicionScore();
            System.out.printf("%s\t(선호: %s)\t의심도 %d\n", s.name, s.favoriteSnack, s.suspicion);
        }

        //6
        Base.step("알리바이 체크");

        int count_noAlibi = 0;

        for (Suspect s:suspects){
            if (!s.hasAlibi){
                System.out.printf("알리바이 없음 : %s\n", s.name);
                count_noAlibi++ ;
            }
        }
        System.out.printf("알리바이 없는 용의자 : %d\n", count_noAlibi);

        //7
        Base.step("가장 수상한 자");

        Suspect top = suspects.get(0);

        for (Suspect s: suspects){
            if (s.suspicion > top.suspicion){
                top = s;
            }
        }

        System.out.printf("가장 수상한 자 : %s (의심도 %d)\n", top.name, top.suspicion);

        //8
        Base.step("수사본부 종합");

        int suspectSum = 0;
        for (Suspect s: suspects){
            suspectSum += s.suspicion;
        }

        System.out.printf("전체 의심점수 합계 : %d\n", suspectSum);

        int threshold = 3;
        System.out.printf("[중점 수사 대상] - 의심점수 %d 이상\n", threshold);

        for (Suspect s:suspects){
            if (s.suspicion >= threshold){
                s.showBrief();
            }
        }

        //9
        Base.step("사건 파일");

        System.out.println("[탕비실 간식 실종 사건]");
        for (Suspect s: suspects){
            System.out.printf("- %s\n", s.name);
        }

        //10
        Base.step("범인 지목");

        System.out.print("[수사 종결] 사건 : 탕비실 간식 실종 사건 - ");

        System.out.printf("범인은 %s (의심점수 %d)\n", top.name, top.suspicion);

    }
}
