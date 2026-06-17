package day08.H1;

import java.util.Scanner;

public class Applicant {
    String name;
    String major;
    private int applied;

    static int totalApplied;

    Applicant(String name, String major, int applied){
        this.name=name;
        this.major=major;
        this.applied=applied;
    }
    Applicant(String name, int applied){
        this(name, "미정", applied);
    }

    public int getApplied() {
        return applied;
    }
    public void setApplied(int applied){
        if (applied < 0){
            applied = 0;
        }
        this.applied = applied;
    }

    void info(){
        System.out.printf("%s / 전공 %s / 지원 %d건\n", name, major, applied);
    }

    void applied2(Company c){
        this.applied ++;
        totalApplied ++;

        System.out.printf("%s -> %s  지원. 스탬프 획득!\n", this.name, c.name);
    }

    static Applicant scan(){
        Scanner sc = new Scanner(System.in);

        System.out.print("지원자 이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("지원자 전공을 입력하세요: ");
        String major = sc.nextLine();

        Applicant out = new Applicant(name, major, 0);
        System.out.printf("입장 : %s / %s\n", name, major);

        return out;
    }

    static Applicant scanWapp(){
        Scanner sc = new Scanner(System.in);

        System.out.print("지원자 이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("지원자 전공을 입력하세요: ");
        String major = sc.nextLine();

        System.out.print("지원수: ");
        String apply = sc.nextLine();

        Applicant out = new Applicant(name, major, Integer.parseInt(apply));
        System.out.printf("입장 : %s / %s\n", name, major);

        return out;
    }

}
