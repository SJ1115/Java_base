package day09.P2;

import common.Base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class M6Practice {

    static void main() {
        Base.step("곡 사전");

        HashMap<String, Song> songs = new HashMap<>();   // 키는 제목(글자), 값은 노래 객체
        songs.put("좋은 날", new Song("좋은 날", 215, "다 같이 후렴 떼창"));  // 사전에 한 곡 넣기
        songs.put("밤편지", new Song("밤편지", 250, "잔잔하게 1절"));
        songs.put("블루밍", new Song("블루밍", 219, "후렴 손 흔들기"));
        songs.put("라일락", new Song("라일락", 215, "엔딩 떼창"));

        System.out.printf("준비된 곡 수 : %d\n", songs.size());

        Base.step("신청곡 받기");

        Scanner sc = new Scanner(System.in);

        ArrayList<Act> setlist = new ArrayList<>();   // 무대 동작을 담는 셋리스트
        setlist.add(new Talk("오프닝 멘트", 30, "와 주셔서 고마워요"));
        /*System.out.println("신청곡 제목을 입력하세요 (빈 줄이면 마감)");
        while (true) {
            System.out.print("신청곡: ");
            String title = sc.nextLine();
            if (title.isEmpty()) {
                break;
            }
            if (songs.containsKey(title)) {                   // 그 제목이 사전에 있는지 확인
                setlist.add(songs.get(title));        // 사전에서 그 노래를 꺼내 셋리스트로
                System.out.println("→ 셋리스트 추가: " + title);
            } else {
                System.out.println("→ 준비되지 않은 곡이에요: " + title);
            }
        }*/

        setlist.add(songs.get("좋은 날"));
        setlist.add(songs.get("밤편지"));

        setlist.add(new Dance("엔딩 안무", 60, "피날레"));
        System.out.println("임시 신청으로 셋리스트 동작 수: " + setlist.size());

        Base.step("공연 진행");

        for (Act a : setlist){
            a.perform();
        }

        Base.step("앵콜");

        for (Act a : setlist) {
            if (a instanceof Song) {                   // 이 무대 동작이 노래인지 확인
                System.out.println("앵콜: " + a);
            }
        }

        Base.step("실습");

        setlist.add(new Talk("마무리 멘트", 20, "오늘 정말 행복했어요"));

        for (Act a : setlist) {
            if (a instanceof Talk) {                   // 이 무대 동작이 노래인지 확인
                System.out.println("앵콜: " + a);
            }
        }
    }
}
