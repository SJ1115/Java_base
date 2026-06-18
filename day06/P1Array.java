package day06;

import java.util.ArrayList;
import java.util.Arrays;

import common.Base;

public class P1Array {

    static void main() {
        Base.step(2, "변수 여러개");

        String song1 = "갑자기";
        String song2 = "REDRED";
        String song3 = "It's Me";
        String song4 = "LEMONADE";
        String song5 = "소문의 낙원";

        System.out.println(song1);
        System.out.println(song2);
        System.out.println(song3);
        System.out.println(song4);
        System.out.println(song5);

        Base.step("배열");

        String[] titles = {"어쩐지",
                "REDRED",
                "It's Me",
                "LEMONADE",
                "최고의 연애"};


        Base.step(4, "인덱스로 접근");

        System.out.println("0번 곡: " + titles[0]);
        System.out.println("1번 곡: " + titles[1]);
        System.out.println("4번 곡: " + titles[4]);

        Base.step(5, "length");

        System.out.println("플레이리스트 곡 수: " + titles.length + "곡");
        System.out.println("마지막 곡: " + titles[titles.length - 1]);

        Base.step("제목+아티스트");

        String[] artists = {"아이오아이", "CORTIS", "아일릿", "aespa", "AKMU"};

        int[] ids = {0,2,4};
        for(int i: ids){
            System.out.println(titles[i] + " - " + artists[i]);
        }

        Base.step("실습");

        System.out.printf("첫\t곡 : %s\n", titles[0]);
        System.out.printf("마지막\t곡 : %s\n", titles[titles.length-1]);
        System.out.printf("총 %d곡\n", titles.length);


        Base.step(4, "인덱스:AR");

        ArrayList<String> title2 = new ArrayList<>(Arrays.asList(titles));

        System.out.println("0번 곡: " + title2.get(0));
        System.out.println("1번 곡: " + title2.get(1));
        System.out.println("4번 곡: " + title2.get(4));

    }
}
