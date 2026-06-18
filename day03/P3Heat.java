package day03;

import common.Base;

public class P3Heat {

    static void main() {

        Base.step(2, "체감온도");

        double temperature_perceive = 32.5;

        System.out.printf("현 체감온도 : %.2f`C : ", temperature_perceive);
        if (temperature_perceive < 28){
            System.out.println("자유활동(운동) 가능");
        } else if (temperature_perceive < 31){
            System.out.println("운동 주의");
        } else if (temperature_perceive < 33){
            System.out.println("활동 주의");
        } else if (temperature_perceive < 35){
            System.out.println("활동자제");
        } else {
            System.out.println("외출금지");
        }

        base.step("If 순서");

        temperature_perceive = 25;
        System.out.printf("현 체감온도 : %.2f`C : ", temperature_perceive);
        if (temperature_perceive > 35){
            System.out.println("자유활동(운동) 가능");
        } else if (temperature_perceive < 35){
            System.out.println("주의");
        } else if (temperature_perceive < 33){
            System.out.println("관심");
        } else if (temperature_perceive < 31){
            System.out.println("활동가능");
        } else {
            System.out.println("일상");
        }

        Base.step("Else check");

        temperature_perceive = 40;

        System.out.printf("현 체감온도 : %.2f`C : ", temperature_perceive);
        if (temperature_perceive < 28){
            System.out.println("자유활동(운동) 가능");
        } else if (temperature_perceive < 31){
            System.out.println("주의");
        } else if (temperature_perceive < 33){
            System.out.println("관심");
        } /*else if (temperature_perceive < 35){
            System.out.println("경보");
        } else {*/
            System.out.println("판정 끗");

        Base.step("동네 판정");
        String region = "서울";
        double temperature = 28.1;
        double humidity = 57;

        temperature_perceive = temperature + humidity*.05;

        System.out.printf("지역 : %s\n", region);
        System.out.printf("기온 : %.2f\t습도 : %.2f\n", temperature, humidity);
        System.out.printf("체감온도 : %.2f\n", temperature_perceive);

        String stage; String action;

        if (temperature_perceive < 28){
            stage = "일상"; action = "자유 활동 가능";
        } else if (temperature_perceive < 31){
            stage = "관심"; action = "가벼운 활동 가능";
        } else if (temperature_perceive < 33){
            stage = "주의"; action = "물 자주 마시기";
        } else if (temperature_perceive < 35){
            stage = "경고"; action = "실내활동 유지";
        } else {
            stage = "위험"; action = "야외활동 자제";
        }
        System.out.println("   :::::판정 결과:::::");
        System.out.printf("단계 : %s.\n활동 : %s.\n", stage, action);


        Base.step("실습 : 자외선");

    }
}
