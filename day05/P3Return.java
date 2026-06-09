package day05;

public class P3Return {
    static void printChr(int morning, int evening){
        int out = addChr(morning, evening);
        System.out.printf("오늘의 츄르는 : %d개\n", out);
    }

    static int addChr(int morning, int evening){
        int out = morning+evening;
        return out;
    }

    static int refill(int x){
        System.out.println("리필 직전 — 실행됨");
        return x * 2;
        //System.out.println("리필 실패!!!!!");
        //return -1;
    }

    static int countChr(int box, int chrPbox){
        return box * chrPbox;
    }

    static String afterMood(int chr){
        if (chr>=20) {
            return "행복이 폭!발!";
        }
        else if (chr>=10) {
            return "기분이 좋구나";
        }
        else return "더 달라";
    }

    static int kcal(int chr){
        return chr * 14;
    }

    static String diet(int kcal){
        if (kcal>70){
            return "다이어트 필요";
        }
        return "적정 간식";
    }

    static void showDiet(int chr){
        int k = kcal(chr);
        String diet = diet(k);
        System.out.printf("츄르 %d개 -> %dkcal\t-> %s\n", chr, k, diet);
    }

    static void main() {
        Base.step(2, "Void(출력만)");

        printChr(3,5);

        Base.step("반환값 받기");

        int chr = addChr(3,5);

        System.out.printf("오늘의 츄르 : %d개\n내일 하나 더 주면 : %d개\n", chr, chr+1);

        Base.step("return");

        int chr2 = refill(7);

        System.out.printf("리필 결과 : %d 개\n", chr2);

        Base.step("return 바로 출력하기");

        System.out.println("addChr(10, 20) = " + addChr(10, 20));
        System.out.println("addChr(addChr(1, 2), 3) = " + addChr(addChr(1, 2), 3));

        Base.step("개수로 기분 판정");

        int stock = countChr(4,6);

        System.out.printf("4 Box x 6 Chr -> %d개\n", stock);

        String mood = afterMood(stock);
        System.out.printf("츄르 %d개\t-> 기분 %s\n", stock, mood);
        System.out.printf("츄르 7개\t-> 기분 %s\n", afterMood(7));

        Base.step("실습");

        showDiet(8); showDiet(3);
    }
}
