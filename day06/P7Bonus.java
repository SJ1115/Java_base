package day06;

public class P7Bonus {

    static void main() {
        Base.step(2, "value");

        int cntA = 5;
        int cntB = 5;

        double scA = 9.1;
        double scB = 9.1;

        char grA = 'A';
        char grB = 'A';

        System.out.printf("비교 결과\n%b %b %b\n", cntA==cntB,
                scA==scB, grA==grB);

        Base.step("Instance");

        Integer a = new Integer(1);
        Integer b = new Integer(1);

        Double c = new Double(1.1);
        Double d = new Double(1.1);

        String e = new String("REDRED");
        String f = new String("REDRED");

        System.out.printf("비교 결과\n%d   <->   %d : %b\n%.1f <-> %.1f : %b\n%s <-> %s : %b\n", a, b, a==b, c, d,
                c==d, e, f, e==f);

        Base.step("Equals()로 비교");

        System.out.printf("비교 결과\n%d   <->   %d : %b\n%.1f <-> %.1f : %b\n%s <-> %s : %b\n", a, b, a.equals(b), c, d,
                c.equals(d), e, f, e.equals(f));

        Base.step("Literal 비교");

        String g = "Lemonade";
        String h = "Lemonade";

        System.out.printf("\"%s\" == \"%s\"\t\t : %b\n\"%s\".equals(\"%s\")\t : %b\n", g, h, g==h, g, h,  g.equals(h));

        Base.step("배열도 비교");

        String[] listA = {"갑자기", "REDRED"};
        String[] listB = {"갑자기", "REDRED"};

        System.out.println("listA == listB : " + (listA == listB));

        String[] listC = listA;   // 같은 보관함 번호를 그대로 복사
        System.out.println("listA == listC : " + (listA == listC));

        System.out.println("내용 같은지 : " + java.util.Arrays.equals(listA, listB));

        Base.step("copy...?");

        int x = 5;
        int y = x;
        y = 99;
        System.out.println("값형  → x: " + x + ", y: " + y);

        int[] before = {3,5};//{"갑자기", "REDRED"};
        int[] after = before;
        after[0] = 1;//"Whiplash";     // after의 0번 칸만 바꿨는데...
        System.out.println("참조형 → before[0]: " + before[0] + ", after[0]: " + after[0]);

        Base.step("Deep Copy(?)");

        String[] origin = {"갑자기", "REDRED"};
        String[] copy = origin.clone();

        copy[0] = "Whiplash";             // copy만 바꿈

        System.out.println("origin[0]: " + origin[0]);
        System.out.println("copy[0]  : " + copy[0]);
        System.out.println("origin == copy : " + (origin == copy));
    }
}
