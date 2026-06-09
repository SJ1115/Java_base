package day06;

import java.util.ArrayList;
import java.util.Collections;

public class P4ArrayList {
    static void main() {
        Base.step(3, "add");

        String[] arr = {"갑자기", "REDRED", "It's Me"};

        ArrayList<String> liked = new ArrayList<>();

        for (String a : arr){
            liked.add(a);
        }

        System.out.println("곡 담기 완료");

        Base.step("get, size");

        for (int i=0; i<2; i++){
            System.out.printf("%d번 곡 : %s\n", i, liked.get(i));
        }
        System.out.printf("곡 수 - %d\n", liked.size());

        Base.step("순회");

        for (int i=0; i<liked.size(); i++){
            System.out.printf("%d번 곡 : %s\n", i, liked.get(i));
        }

        for (String song : liked){
            System.out.println(song);
        }

        Base.step("add");

        liked.add("LEMONADE");
        System.out.printf("추가 후 총 : %d곡\n", liked.size());
        System.out.printf("마지막 곡  : %s\n", liked.get(liked.size()-1));

        Base.step("실습");

        ArrayList<String> songs = new ArrayList<>();

        songs.add("hi");
        songs.add("hi");
        songs.add("bye");

        for(String s : songs){
            System.out.println(s);
        }
        songs.removeAll(Collections.singleton("hi"));


        for(String s : songs){
            System.out.println(s);
        }
    }
}
