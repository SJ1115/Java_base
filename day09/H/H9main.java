package day09.H;

import common.Base;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class H9main {

    static void checkTicket(String tName, HashMap<String,Ticket> tickets){
        boolean check = tickets.containsKey(tName);
        String chText;
        if (check) {
            chText = "있음";
        } else {
            chText = "없음";
        }

        System.out.printf("%s 예매 %s\n", tName, chText);
    }

    static Ticket TicketByScan(){
        Scanner sc = new Scanner(System.in);

        System.out.print("관객명을 입력하세요 :");

        String name = sc.nextLine();

        System.out.print("등급을 입력하세요 :");

        String tier = sc.nextLine();

        if ("VIP".equals(tier)){
            return new VipTicket(name);
        } else if ("지정석".equals(tier)){
            return new SeatTicket(name);
        } else if ("스탠딩".equals(tier)){
            return new StandingTicket(name);
        } else {
            return new Ticket(name);
        }
    }

    static void main() {
        //1
        Base.step("예매소 기본 티켓");

        Ticket t1 = new Ticket("지민팬", 110000);

        //t1.info();

        //2
        Base.step("Vip 티켓 등장");

        VipTicket v1 = new VipTicket("정국팬", 110000);

        //v1.info();

        //3
        Base.step("지정석 / 스탠딩 추가");

        SeatTicket s1 = new SeatTicket("뷔팬", 110000);
        StandingTicket g1 = new StandingTicket("RM팬", 110000);

        //s1.info();
        //g1.info();

        //4
        Base.step("부모 타입에 자식 담기");

        ArrayList<Ticket> tickets = new ArrayList<>();

        tickets.add(v1);
        tickets.add(s1);
        tickets.add(g1);

        for (Ticket t : tickets){
            System.out.printf("%s\t%d원\n", t.grade(), t.getPrice());
        }

        //5
        Base.step("예매목록");

        tickets.add(t1);

        for (Ticket t: tickets){
            //t.info();
        }

        //6
        Base.step("예매번호로 검색");

        HashMap<String, Ticket> reservations = new HashMap<>();

        reservations.put("B101", new VipTicket("지민팬", 110000));
        reservations.put("B102", new SeatTicket("진팬", 110000));
        reservations.put("B103", new StandingTicket("슈가팬", 110000));

        System.out.print("B101 조회 : ");
        //reservations.get("B101").info();

        //7
        Base.step("없는 예매번호 확인");

        checkTicket("B101", reservations);
        checkTicket("B999", reservations);

        System.out.printf("없는 번호 조회 결과 : %s\n", reservations.get("B999"));

        //8
        Base.step("사인회 대상 추리기");

        System.out.print("사인회 안내 :");
        for (Ticket t : tickets){
            if (t instanceof VipTicket){
                System.out.printf("%s (%s)\n", t.audience, t.grade());
            }
        }

        //9
        Base.step("예매번호 본인 확인");

        String code = "B102";

        System.out.printf("%s 조회 : ", code);
        if (reservations.containsKey(code)){
            //reservations.get(code).info();

            System.out.printf("%s 본인 확인 완료\n", reservations.get(code).grade());
        } else {
            System.out.println("실패");
        }

        //10
        Base.step("실시간 접수");

        code = "B200";

        Ticket n1 = TicketByScan();

        System.out.print("예매 완료 : ");
        //n1.info();

        tickets.add(n1);

        reservations.put(code, n1);

        System.out.printf("검색표 등급 확인 (%s) : ", code);
        //reservations.get(code).info();
    }
}
