package day09.P1;

import common.Base;
import java.util.HashMap;

public class M1Map {
    static void main() {
        //1
        Base.step("곡 목록");

        HashMap<String, Song> book = new HashMap<>();

        book.put("좋은 날", new Song("좋은 날", 215));
        book.put("밤편지", new Song("밤편지", 250));
        book.put("블루밍", new Song("블루밍", 219));

        System.out.printf("등록된 곡 수 : %d곡\n", book.size());

        //2
        Base.step("신청곡 찾기");

        Song s = book.get("좋은 날");

        s.info();

        //3
        Base.step("신청곡 확인");

        String[] titles = {"블루밍", "스물셋"};

        for (String t:titles){
            System.out.printf("%s 있나요? %b\n", t, book.containsKey(t));
        }

        Song n = book.get(titles[1]);
        System.out.println("스물셋 조회 결과: " + n);



        //4
        Base.step("전체 곡 목록");

        for (String t: book.keySet()){
            System.out.print("- ");
            book.get(t).info();
        }

        //5
        Base.step("실습");

        String t = "라일락";
        book.put(t, new Song(t, 215));

        System.out.printf("%s 등록됨? %b\n", t, book.containsKey(t));
        book.get(t).info();

        t = "팔레트";
        System.out.printf("%s 조회 : %s\n", t, book.get(t));


    }

}
