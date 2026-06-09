package day06;

public class P3Each {
    public static void main(){
        Base.step(2, "Simple for");

        String[] titles = {"갑자기", "REDRED", "It's Me", "LEMONADE", "소문의 낙원"};

        for (int i=0; i<titles.length; i++){
            System.out.println(titles[i]);
        }

        Base.step("Enhanced for");

        for (String title: titles){
            System.out.println(title);
        }

        Base.step("Sum with for-each");

        int[] likes = {40972, 54036, 37132, 29186, 78989};

        int sum = 0;

        for (int like : likes) {
            sum += like;
        }

        System.out.printf("좋아요 합계: %d\n", sum);

        Base.step("번호가 필요할 때");

        for (int i=0; i<titles.length; i++){
            System.out.printf("%d번 곡 : %s\n", i+1, titles[i]);
        }

        Base.step("변경시도");

        for (String t:titles){
            t = "hi";
        }

        System.out.println("0번 : "+titles[0]);

        Base.step("실습");

        for (int i=0; i<titles.length; i++){
            if (likes[i] > 50000){
                System.out.println(likes[i]);
            }
        }
    }
}
