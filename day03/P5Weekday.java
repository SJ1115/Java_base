package day03;

public class P5Weekday {
    static void main() {
        base.step(2, "Summer Activity");

        int day = 3;

        switch (day){
            case 1:
                System.out.println("월 : 한강 러닝");
                break;
            case 2:
                System.out.println("화 : 빙수 카페");
            case 3:
                System.out.println("수 : 워터 파크");
                break;
            case 4:
                System.out.println("목 : 한강 치맥");
                break;
            case 5:
                System.out.println("금 : 여름 축제");
                break;
            case 6:
                System.out.println("토 : 해수 욕장");
                break;
            case 7:
                System.out.println("일 : 풀   빌라");
                break;
            default: // case 7
                System.out.printf("고장!!!!! day = %d는 유효하지 않은 입력\n", day);
        }

        base.step("break 누락");

        day = 2;
        switch (day){
            case 1:
                System.out.println("월 : 한강 러닝");
                break;
            case 2:
                System.out.println("화 : 빙수 카페");
                //break;
            case 3:
                System.out.println("수 : 워터 파크");
                //break;
            case 4:
                System.out.println("목 : 한강 치맥");
                break;
            case 5:
                System.out.println("금 : 여름 축제");
                //break;
            case 6:
                System.out.println("토 : 해수 욕장");
            case 7:
                System.out.println("일 : 풀   빌라");
            default: // case 7
                System.out.printf("고장!!!!! day = %d는 유효하지 않은 입력\n", day);
        }

        day = 6;
        switch (day){
            case 6:
            case 7:
                System.out.println("주말 : 호캉스");
                break;
            default: // case 7
                System.out.println("평일 : 무리ㄴ");
        }

        base.step("Switch vs IF");

        day = 4;

        if (day == 1){
            System.out.println("Mon");
        }
        else if (day == 2){
            System.out.println("Tue");
        }
        else if (day == 3){
            System.out.println("Wed");
        }
        else if (day == 4){
            System.out.println("Thu");
        }
        else if (day == 5){
            System.out.println("Fri");
        }
        else if (day == 6){
            System.out.println("Sat");
        }
        else {
            System.out.println("Sun");
        }

        base.step( "Beach & City");

        String beach = "해운대";

        switch (beach){
            case "해운대":
                System.out.println("부산 : 부산국제영화제");
                break;
            case "경포대":
                System.out.println("강릉 : 카페거리");
                break;
            case "낙산":
                System.out.println("양양 : 서핑 + EDM");
                break;
            case "을왕리":
                System.out.println("인천 : 조개구이");
                break;
            default:
                System.out.printf("%s : 알 수 없는 해변\n", beach);
        }

        base.step("실습 : 오늘의 빙수");

        beach = "녹차빙수";

        switch (beach){
            case "팥빙수":
                System.out.println("팥 : 근본.");
                break;
            case "망고빙수":
                System.out.println("망고 : 부드러운 단맛");
                break;
            case "딸기빙수":
                System.out.println("딸기 : 새콤달콤의 정석");
                break;
            case "인절미빙수":
                System.out.println("인절미 : 근본 v2");
                break;
            default:
                System.out.println("녹차 : 은은한 부드러움");
        }
    }
}
