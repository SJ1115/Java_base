package day05;

import common.Base;

public class P1Basics {

    static void giveChur(){
    System.out.println("츄르 봉지를 짭니당");
    System.out.println("나비가 츄르를 햝습니다. 골골골");
    System.out.println("---------");
    }

    static void callCat(){
        System.out.println("[간식시간] 쪼르르 달려오는 나비");
    }

    static void callCat2(){
        System.out.println("[간!식!시!간!] 거칠게 달려오는 나비");
    }

    static void cleanUp(){
        System.out.println("나비가 빈 봉지를 정리합니다. 건실하네요");
    }

    static void hunt(){
        System.out.println("나비가 봉지를 물어뜯습니다.");
    }

    static void grawl(){
        System.out.println("만족한 나비가 골골댑니다. \"으르렁\"");
    }

    static void main() {
        Base.step(2, "w.o. Method");

        System.out.println("츄르 봉지를 짭니당");
        System.out.println("나비가 츄르를 햝습니다. 골골골");
        System.out.println("---------");
        System.out.println("츄르 봉지를 짭니당");
        System.out.println("나비가 츄르를 햝습니다. 골골골");
        System.out.println("---------");
        System.out.println("츄르 봉지를 짭니당");
        System.out.println("나비가 츄르를 햝습니다. 골골골");
        System.out.println("---------");

        Base.step("Calling Method");

        giveChur();
        giveChur();
        giveChur();

        callCat();cleanUp();

        Base.step("호출 순서");

        cleanUp();giveChur();callCat();

        Base.step("실습");

        callCat2(); hunt(); grawl(); cleanUp();
    }
}
