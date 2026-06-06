package day01;

public class homework{
    static String t0_name = "이성주";
    static String t3_mbti = "INTP";

    static int i = 0;
    public static void main() {
        System.out.println("\n");

        //0
        i++;
        System.out.printf("문제 %d :\n", i);
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s%n", t0_name);
        }
        System.out.println("\n");

        //1
        i++;
        System.out.printf("문제 %d :\n", i);
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println("\n\n");

        //2
        i++;
        System.out.printf("문제 %d :\n", i);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n");

        //3
        i++;
        System.out.printf("문제 %d :\n", i);
        System.out.printf("%s", t3_mbti);
        System.out.println("\n\n");

        //4
        i++;
        System.out.printf("문제 %d :\n", i);
        for (int i = 0; i < 3; i++) {
            System.out.println("안녕하세요");
        }
        System.out.println("\n");

        //5
        i++;
        System.out.printf("문제 %d :\n", i);
        System.out.println("20260601");
        System.out.println("\n");

        //6
        i++;
        System.out.printf("문제 %d :\n", i);
        System.out.println("양념게장\n");
        System.out.println("피자\n");
        System.out.println("초밥\n");

        //7
        i++;
        System.out.printf("문제 %d :\n", i);
        System.out.println("강의명 출력 (\"Salesforce AI CRM Track 2기\")\n");

        //8
        i++;
        System.out.printf("문제 %d :\n", i);
        System.out.println("아직 잘 모르겠다...\n");

        //9
        i++;
        System.out.printf("문제 %d :\n", i);
        System.out.println("여러 가지를 배우면서, 하나에만 집중해 고수가 되기보다는 두루두루 다 할 수 있게 되기\n");

    }
}