package day08.H1;

import common.Base;

import java.util.ArrayList;
import java.util.Scanner;

public class M1conference {
    static void main() {
        // 1
        Base.step("오늘의 공략 리스트");

        Company c1 = new Company("가나테크", 1, 3);


        c1.info();

        // 2
        Base.step("입장 + 명찰발급");

        Applicant a1 = Applicant.scan();

        // 3
        Base.step("친구도 입장");

        Applicant a2 = new Applicant("강관람", 0);

        System.out.printf("%s / %s\n", a2.name, a2.major);

        // 4
        Base.step("스탬프 위조 방지");

        a1.setApplied(-2);

        System.out.printf("보정된 스탬프 수 : %d\n", a1.getApplied());

        // 5
        Base.step(5, "스탬프 투어 시작");

        Applicant a3 = new Applicant("오대박", "컴퓨터", 0);

        Company c2 = new Company("다라소프트", 2, 1);

        a3.applied2(c1);
        a3.applied2(c2);

        System.out.printf("전광판 - 오늘 총 지원 수 : %d\n", Applicant.totalApplied);

        // 6
        Base.step("경품 추천 전광판");

        Company c3 = new Company("마바인터렉티브", 4, 3);

        Company.status();

        // 7
        Base.step("목표 부스 찾기");

        ArrayList<Company> booths = new ArrayList<>();

        booths.add(c1); booths.add(c2); booths.add(c3);

        String keyword = "다라소프트";

        boolean found = false;
        for (Company c:booths){
            if (c.name.equals(keyword)){
                System.out.printf("%s 부스 : %d번%n", c.name, c.booth);
                found = true;
            }
        }

        if (!found){
            System.out.printf("%s 부스를 찾지 못했습니다.\n", keyword);
        }


        // 8
        Base.step("오늘의 동선 요약");

        int totalOpening=0;
        for(Company c:booths){
            c.info();
            totalOpening += c.openings;
        }
        System.out.printf("총 채용공고 : %d건\n", totalOpening);

        // 9
        Base.step("네트워킹 존");

        ArrayList<Applicant> applicants = new ArrayList<>();

        applicants.add(
                new Applicant("이마켓", "경영", 2)
        );
        applicants.add(
                new Applicant("김코딩", "컴퓨터", 1)
        );
        applicants.add(
                new Applicant("박인사", "행정", 1)
        );

        int businessCnt = 0;
        for(Applicant a:applicants){
            if (a.major.equals("경영")){
                a.info();
                businessCnt ++;
            }
        }

        System.out.printf("경영학 존 : 인원 %d명\n", businessCnt);

        // 10
        Base.step("단체 등록");

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Applicant> finalList = new ArrayList<>();
        int finalSum=0;

        for (int i=0; i<n; i++){
            Applicant lastman = Applicant.scanWapp();
            finalSum += lastman.getApplied();
        }
        System.out.printf("등록 인원 : %d명 / 총 지원 건수 %d / 평균 지원 수 %.1f\n",  n, finalSum, (double)finalSum/n);
    }
}
