package day06;

import common.Base;

public class P2Loop {

    static int sum(int[] list){
        int sum = 0;
        for (int l: list){
            sum += l;
        }
        return sum;
    }

    static void main() {
        Base.step(2, "전체 순회");

        String[] titles = {"갑자기", "REDRED", "It's Me", "LEMONADE", "소문의 낙원"};
        int[] likes = {40972, 54036, 37132, 29186, 78989};

        for (int i=0; i<titles.length; i++){
            System.out.printf("%d번 : %s\t(likes %d)\n", i, titles[i], likes[i]);
        }

        Base.step("좋아요 합계");

        int sum=0;
        for (int l: likes){
            sum += l;
        }

        System.out.printf("좋아요 합계 : %d\n", sum);

        Base.step("좋아요 평균");

        System.out.printf("좋아요 평균 : %.1f\n", (double)sum/likes.length);

        Base.step("최고 인기곡");


        int imax = 0;
        int lmax = 0;

        for (int i=0; i<likes.length; i++){
            if (lmax < likes[i]){
                imax = i;
                lmax = likes[i];
            }
        }

        System.out.printf("최고 인기곡 : %s (likes %d)\n", titles[imax], lmax);

        Base.step("메서드로 접근");

        System.out.println("메서드로 구한 합계: " + sum(likes));

        Base.step("실습");

        int imin = 0;
        int lmin = likes[0];

        for (int i=1; i<likes.length; i++){
            if (lmin > likes[i]){
                imin = i;
                lmin = likes[i];
            }
        }

        System.out.printf("최저 인기곡 : %s (likes %d)\n", titles[imin], lmin);

    }
}
