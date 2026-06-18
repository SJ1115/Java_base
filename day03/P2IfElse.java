package day03;

import common.Base;

public class P2IfElse {

    static void main() {
        Base.step(2, "Single If");

        boolean has_ticket = false;

        if (has_ticket) {
            System.out.println("입장 가능");
        }
        System.out.println("Ticket Check");

        Base.step("If-Else");

        int height = 35;
        if (height >= 40){
            System.out.println("슬라이드 탑승 가능");
        }
        else {
            System.out.println("키 제한");
        }
        System.out.println("Height Check");

        Base.step(5, "자동정렬");
        int uvIndex=8;
        if (uvIndex>=8){
System.out.println("자외선 매우 강함 — 선크림 SPF 50+");
                    }else{
                System.out.println("자외선 보통 — 일반 선크림 OK");
        }


        Base.step("추가문제");
        height = 165;
        int age = 28;
        boolean has_license = true;

        System.out.printf("키   : %d\n나이 : %d\n자격증 %b\n", height, age, has_license);

        if(height>=130){
            System.out.printf("입장");
        }else{
            System.out.printf("키즈풀만");
        }
        System.out.println(" 가능");

        System.out.printf("따릉이 이용 ");
        if(age>12){
            System.out.println(" 가능");
        }else{
            System.out.println(" 불가");
        }

        System.out.printf("야간 패키지 ");
        if(age>18 && has_license){
            System.out.println("가능");
        } else {System.out.println(" 불가");
        }


    }
}
