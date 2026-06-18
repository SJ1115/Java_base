package day04;

import common.Base;

public class P4Nested {
    public static void main(){
        Base.step(2, "중첩");

        for (int i=0; i<3; i++){
            System.out.printf("%d번째 i-loop 시작\n", i+1);
            for (int j=0; j<4; j++){
                System.out.printf("\tj = %d\n", j+1);
            }
        }

        Base.step("구구단 2단");

        for (int i=1; i<=9; i++){
            System.out.printf("2 x %d = %d\n", i, 2*i);
        }

        Base.step("전체");

        for(int i=2; i<10; i++){
            for (int j=1; j<10; j++){
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
            System.out.println("------------");
        }

        Base.step("일주일 안부전화");

        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        String[] times = {"아침", "점심", "저녁"};

        for (int i=0; i<days.length; i++){
            String d = days[i];
            System.out.printf("%s 안부인사\n", d);
            for (int j=0; j<times.length; j++){
                String t = times[j];
                System.out.printf("  %s 전화\n", t);


            }
        }

        Base.step("Heart Bomb");

        int rows=5;
        int cols=3;

        for (int i=0; i<rows; i++) {
            String line = "";
            for (int j=0; j<cols; j++){
                line += "♡";

            }
            System.out.println(line);
        }

        Base.step("실습");

        days = new String[]  {" 영화관 ", "감성카페", "한강공원"};
        times = new String[] {"점심", "저녁", "야경"};

        int course = 0;

        for(int i=0; i<days.length; i++){
            for (int j=0; j<times.length; j++){
                course ++;
                System.out.printf("코스 %d :  %s 에서 %s 데이트\n", course, days[i], times[j]);
            }
        }
        System.out.printf("총 %d가지 데이트 코스 완성!\n", days.length * times.length);


    }
}
