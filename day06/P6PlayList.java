package day06;

import java.util.ArrayList;

public class P6PlayList {
    // (1) 차트 출력 — 배열 + 일반 for
    static void printChart(String[] titles, int[] likes) {
        for (int i = 0; i < titles.length; i++) {        // 배열 칸 개수
            System.out.println((i + 1) + ". " + titles[i] + " (좋아요 " + likes[i] + ")");
        }
    }

    // (2) 좋아요 합계 — 향상된 for + 반환
    static int totalLikes(int[] nums) {
        int total = 0;
        for (int n : nums) {                            // 어느 배열을 도나
            total += n;
        }
        return total;                                     // 결과 돌려주기
    }

    // (3) 중복 없이 담기 — contains + add
    static void addIfNew(ArrayList<String> list, String song) {
        if (list.contains(song)) {                          // 이미 있는지 확인
            System.out.println(song + " — 이미 담음");
        } else {
            list.add(song);                            // 목록에 추가
            System.out.println(song + " — 담기 완료");
        }
    }

    // (4) 내 플레이리스트 출력 — size + 향상된 for
    static void showPlaylist(ArrayList<String> list) {
        System.out.println("내 플레이리스트 (" + list.size() + "곡):");   // 개수
        for (String s : list) {                         // 어느 목록을 도나
            System.out.println("  - " + s);
        }
    }


    static void main() {

        Base.step(3, "인기 차트");

        String[] titles = {"갑자기", "REDRED", "It's Me", "LEMONADE", "소문의 낙원"};
        int[] likes = {40972, 54036, 37132, 29186, 78989};

        printChart(titles, likes);

        int total = totalLikes(likes);
        System.out.println("좋아요 합계: " + total);
        System.out.println("평균 좋아요: " + (double) total / likes.length);

        Base.step("내 목록");

        ArrayList<String> myList = new ArrayList<>();   // 빈 목록 생성

        addIfNew(myList, "갑자기");
        addIfNew(myList, "소문의 낙원");
        addIfNew(myList, "갑자기");      // 중복 시도
        addIfNew(myList, "It's Me");

        showPlaylist(myList);

        Base.step("편집(삭제)");

        myList.remove("소문의 낙원");   // 곡 이름으로 삭제
        System.out.println("'소문의 낙원' 삭제");

        showPlaylist(myList);

    }
}
