package day05;

import common.Base;

public class P4Calculator {
    static int add(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b){
        return a - b;
    }
    static int mul(int a, int b){
        return a * b;
    }
    static double div(int a, int b){
        return (double) a / b;
    }

    static int dailyChr(int cats, int ChrPDay){
        int base = mul(cats, ChrPDay);
        return base + 2;
    }

    static int sum(int[] nums){
        int sum = 0;
        for (int n: nums){
            sum += n;
        }
        return sum;
    }

    static int[] suMax(int[] nums){
        int sum = 0;
        int max = 0;
        for (int n: nums){
            sum += n;

            if (n>max) {
                max = n;
            }
        }
        return new int[] {sum, max};
    }


    static void main() {

        Base.step(3, "사칙연산");

        int stock = 8;
        int used = 3;

        System.out.printf("입고 후 : %d + %d = %d 개\n", stock, used, add(stock,used));
        System.out.printf("소비 후 : %d - %d = %d 개\n", stock, used, sub(stock,used));
        System.out.printf("%d 박스 x %d 개 : %d 개\n", stock, used, mul(stock,used));
        System.out.printf("%d 마리당  : %.3f 개\n", used, div(stock,used));

        Base.step("하루 필요량");

        int need = dailyChr(3, 4);

        System.out.printf("고양이 %d x %d 개 + 여분 = %d 개\n", 3, 4, dailyChr(3,4));

        Base.step("주간 소비(반복)");

        int[] weekUse= {10, 12, 8,14, 11};

        int total = sum(weekUse);
        double mean = div(total, weekUse.length);

        System.out.printf("주간 츄르 소비 합계 : %d개\n 하루 평균 소비 : %.1f개\n", total, mean);

        Base.step("실습");

        int[] sumNmax = suMax(weekUse);

        System.out.printf("주간 합계 : %d개\n최대 소비일 : %d개\n", sumNmax[0], sumNmax[1]);

    }
}
