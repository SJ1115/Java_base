package day05;

import common.Base;

public class P2Parameter {

    static void giveChr(){
        System.out.println("고양이에게 츄르를 줍니다");
    }

    static void giveChr2(String catname){
        System.out.printf("%s에게 츄르를 줍니다. 골골골~\n", catname);
    }

    static void serveChr(String catname, String flavor, int cnt){
        System.out.printf("[%s] %s에게 츄르 %d개를 줍니다\n", flavor, catname, cnt);
    }

    static void present(String catname, String present, int cnt){
        System.out.printf("%s에게 선물(%s) %d개 도착!!!\n", catname, present, cnt);
    }

    static void main() {
        Base.step(2, "매개변수 없이");

        giveChr();giveChr();

        Base.step("이름 맞춤");

        giveChr2("나비");
        giveChr2("치즈");
        giveChr2("깜장");

        Base.step("인자(argument)로");

        String cat1 = "삼색";

        giveChr2(cat1);

        Base.step("맞춤 급여");

        serveChr("나비", "참치", 2);
        serveChr("치즈", "치킨", 1);
        serveChr(cat1, "연어", 3);

        Base.step("실습");

        present("나비", "스크랫쳐", 1);
        present("치즈", "캣휠", 1);
        present(cat1, "집사", 1);
    }
}
