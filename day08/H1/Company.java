package day08.H1;

import java.util.Scanner;

public class Company {
    String name;
    int openings;
    int booth;

    static int boothCnt;
    static final int MAX_BOOTH = 20;

    Company(String name, int openings, int booth){
        this.name=name;
        this.booth=booth;
        this.openings=openings;

        boothCnt ++ ;
    }
    Company(String name){
        this(name, -1, -1);
    }


    void info(){
        System.out.printf("%s (부스 %d번) - 채용공고 %d건\n", name, booth, openings);
    }

    static void status(){
        System.out.printf("등록 부스 : %d / 상한 %d\n", boothCnt, MAX_BOOTH);
    }
}
