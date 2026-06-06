package day02;

public class P1variable {
    static void main() {
        // int
        int age     = 25;
        int year    = 2026;
        int score   = 95;
        int height  = 165;
        int class_num = 7;

        System.out.printf("%d\n%d\n%d\n%d\n%d\n",
                age, year, score, height, class_num);

        // Long
        long timestamp = 17172000000000L;
        long galaxy_star = 100110010001000L;

        System.out.println(timestamp);
        System.out.println(galaxy_star);

        // error
        /*
        int 2age = 3;
        int user num = 6;
        int long = 3;
        int user = 'hi';
        */

        // CamelCase
        int myAge = 25;
        int favorNum = 7777;
        int gradePoint = 95;
        int teamNum = 7;
        System.out.printf("%d\n%d\n%d\n%d\n",
                myAge, favorNum, gradePoint, teamNum);



        int myBestHeight = 167;
        int myWorstScore = 40;
        int todayWakeUpTime = 630;
        System.out.printf("%d\n%d\n%d\n",
                myBestHeight, myWorstScore, todayWakeUpTime);

        boolean is_hunb = true;


    }
}
