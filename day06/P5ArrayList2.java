package day06;

import java.util.ArrayList;

public class P5ArrayList2 {

    static void addNew(ArrayList<String> list, String song){
        if (list.contains(song)){
            System.out.printf("%s : 이미 있는 노래\n", song);
        } else {
            System.out.printf("%s : 곡 목록에 추가\n", song);
            list.add(song);
        }
    }

    static void main() {
        Base.step("초기 목록");

        ArrayList<String> liked = new ArrayList<>();

        liked.add("갑자기");
        liked.add("REDRED");
        liked.add("It's Me");
        liked.add("LEMONADE");

        System.out.println("현재 곡 수: " + liked.size() + "곡");

        for (String song : liked) System.out.println(song);

        Base.step("값으로 삭제");

        liked.remove("REDRED");

        System.out.printf("현재 곡 수 : %d\n", liked.size());
        for (String song : liked) System.out.println(song);

        Base.step("index로 삭제");

        liked.remove(0);

        System.out.printf("현재 곡 수 : %d\n", liked.size());
        for (String song : liked) System.out.println(song);

        Base.step("확인하기");

        System.out.println("It's Me 있나? " + liked.contains("It's Me"));
        System.out.println("갑자기 있나? " + liked.contains("갑자기"));

        if (liked.contains("LEMONADE")) {
            System.out.println("LEMONADE는 이미 목록에 있어요");
        }

        Base.step("중복 없이 추가하기");

        addNew(liked, "It's Me");
        addNew(liked, "소문의 낙원");

        System.out.printf("현재 곡 수 : %d\n", liked.size());
        for (String song : liked) System.out.println(song);


    }

}
