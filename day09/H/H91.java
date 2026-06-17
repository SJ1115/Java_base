package day09.H;

import common.Base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class H91 {
    static void checkTicket(Integer id, HashMap<Integer, Ticket> book){
        if (book.containsKey(id)){
            book.get(id).info();
        } else {
            System.out.printf("예매 없음 : B%d\n", id);
        }
    }

    static void searchByNo(Integer id, HashMap<Integer, Ticket> book){
        if (book.containsKey(id)){
            System.out.print("찾음 : ");
        }

        checkTicket(id, book);
    }

    static void main() {
        //1
        Base.step("등급별 티켓 계층");

        Ticket t1 = new VipTicket("지민팬", 110000);
        Ticket t2 = new SeatTicket("정국팬", 110000);
        Ticket t3 = new StandingTicket(" 뷔팬 ", 110000);

        t1.info(); t2.info(); t3.info();

        //2
        Base.step("예매 조회");

        HashMap<Integer, Ticket> book = new HashMap<Integer,Ticket>();

        book.put(t1.bookNo, t1);
        book.put(t2.bookNo, t2);
        book.put(t3.bookNo, t3);

        checkTicket(101, book);
        checkTicket(999, book);


        //3
        Base.step("VIP 사인회");

        for (Ticket t: book.values()){
            if (t instanceof VipTicket){
                ((VipTicket) t).signEvent();
            }
        }

        //4
        Base.step("예매번호 검색");

        searchByNo(102, book);
        searchByNo(777, book);

        //5
        Base.step("예매 접수");

    }
}
