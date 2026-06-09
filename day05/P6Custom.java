package day05;

public class P6Custom {

    static void callCat(String name) {
        System.out.println(name + "야~ 간식 시간이다옹!");
    }


    static String judgeMood(int hunger) {
        if (hunger >= 8) {
            return "매우 배고픔";
        } else if (hunger >= 4) {
            return "조금 배고픔";
        } else {
            return "느긋함";
        }
    }


    static int chrByMood(int base, String mood) {
        int extra;
        if (mood.equals("매우 배고픔")) {
            extra = 2;
        } else if (mood.equals("조금 배고픔")) {
            extra = 1;
        } else {
            extra = 0;
        }
        return base + extra;
    }

    static int happyScore(int chr) {
        return chr * 10;
    }

    static int processCat(String name, int hunger, int base){
        callCat(name);
        String mood = judgeMood(hunger);
        int chr = chrByMood(base, mood);
        int score = happyScore(chr);

        System.out.printf("  기분 : %s / 츄르 %d 급여 / 행복도 %d\n", mood, chr, score);

        return chr;
    }

    static double mean(int total, int cnt){
        return (double)total/cnt;
    }

    static void main() {
        Base.step(3, "고양이 한 마리");

        int chr = processCat("나비", 9, 3);

        String[] names = {"나비", "치즈", "까망"};
        int[] hungers = {9, 5, 2};
        int[] bases = {3, 3, 3};

        int total = 0;

        for (int i=0; i<names.length; i++){
            chr = processCat(names[i], hungers[i], bases[i]);

            total += chr;
        }

        Base.step("자동 급식");

        System.out.printf("총 고양이 수 : %d 마리\n", names.length);
        System.out.printf("총 급여 츄르 : %d 개\n" , total);

        Base.step("평균 급여 개수");

        double mean = mean(total, names.length);
        System.out.printf("평균  츄르량 : %.1f 개\n" , mean);


        Base.step("실습");

        int bestChr=0;
        String bestCat = "";

        for (int i=0; i<names.length; i++){
            chr = processCat(names[i], hungers[i], bases[i]);

            if (chr > bestChr){
                bestChr = chr;
                bestCat = names[i];
            }
        }

        System.out.println("---------");
        System.out.printf("오늘 최고 행복 고양이 : %s(%d개)\n", bestCat, bestChr);
    }
}
