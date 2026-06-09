package day05;

public class P5Overloading {

    static void giveChr(){
        System.out.println("기본 츄르 1개를 내놓습니다");
    }
    static void giveChr(String name){
        System.out.printf("%s에게 츄르 1개를 줍니다\n", name);
    }
    static void giveChr(String name, boolean vip){
        if (vip){
            System.out.printf("[VIP] %s에게 츄르를 바치고 쓰다듬기 서비스 \n", name);
        } else {
            giveChr(name);
        }
    }

    /////////////////

    static void feedAlarm(int cnt){
        System.out.printf("대기 중인 고양이 %d 마리 : 곧 간식 시간!\n", cnt);
    }
    static void feedAlarm(String message){
        System.out.printf("공지 : %s\n", message);
    }

    /////////////////

    static void showSnack(String snack, int cnt){
        System.out.printf("%s맛 츄르 %d개 준비!!\n", snack, cnt);
    }
    static void showSnack(int cnt){
        System.out.printf("츄르 %d개 준비!!\n", cnt);
    }

    static void main() {
        Base.step(4, "오버로딩 자동선택");

        giveChr();
        giveChr("나비");
        giveChr("치즈", false);
        giveChr("깜장", true);

        Base.step("자료형이 다른 오버로딩");

        feedAlarm(5);
        feedAlarm("오늘 츄르 품절!!!");

        Base.step("실습");

        showSnack(3);
        showSnack("참치", 5);
    }
}
