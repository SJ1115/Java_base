package day08.P1;

import common.Base;
import java.util.Scanner;

public class M1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Base.step("이름 받기");

        /*System.out.print("이름을 입력하세요 :");
        String name = sc.nextLine();
*/
        String name = "성주";

        System.out.printf("환영합니다. %s님\n", name);

        Base.step("암구호");

/*
        System.out.print("암구호를 대세요 :");
        String password = sc.nextLine();
*/
        String password = "초록";

        if (password.equals("초록")){
            System.out.println("통과. 들어오세요.");
        } else {
            System.out.println("거부. 사살합니다.");
        }

        Base.step("함정 확인");
/*

        System.out.print("다시 대 보세요 :");
        String again = sc.nextLine();
*/
        String again = "초록";

        System.out.println("== 비교 결과: " + (again == "초록"));
        System.out.println(".equals 비교 결과: " + again.equals("초록"));

        Base.step("반복 검문");

        /*while(true){
            System.out.print("암구호: ");
            String try1 = sc.nextLine();

            if (try1.equals("초록")){
                System.out.println("통과! 캠프에 들어왔습니다.");
                break;
            } else {
                System.out.println("다시.");
            }

        }*/

        Base.step("다듬기");

        /*System.out.print("영문 암구호: ");
        String raw = sc.nextLine();
        String cleaned = raw.trim().toUpperCase();

        if (cleaned.equals("GREEN")) {
            System.out.println("통과 - (다듬은 값: [" + cleaned + "])");
        } else {
            System.out.println("거부 - (다듬은 값: [" + cleaned + "])");
        }*/

        Base.step("실습");

        System.out.println("2차 암구호");
        while(true) {
            System.out.print("암구호: ");
            String try1 = sc.nextLine();

            try1 = try1.trim().toUpperCase();

            if (try1.equals("초록초록초초록")) {
                System.out.println("통과! 안전지대 진입.");
                break;
            } else {
                System.out.println("다시.");
            }

        }


        }
}
