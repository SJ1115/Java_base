package day10.H1;

import common.Base;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Objects.isNull;

public class Main2 {

    static Item findByTitle(ArrayList<Item> items, String title){
        for (Item i : items){
            if (title.equals(i.title)){
                return i;
            }
        }
        return null;
    }

    static String checkByTitle(ArrayList<Item> items, String title){
        Item i = findByTitle(items, title);
        if (isNull(i)){
            return "%s : 자료 없음".formatted(title);
        } else {
            return "찾음 : %s".formatted(i.info());
        }
    }

    static Item ScanItem(){
        Scanner sc = new Scanner(System.in);

        System.out.print("분류 (도서/DVD/잡지) :");
        String type = sc.nextLine();

        System.out.print("제목 :");
        String title = sc.nextLine();

        System.out.print("정가(원) :");
        int price = sc.nextInt();

        switch (type) {
            case "도서" -> {
                return new Book(title, price);
            }
            case "DVD" -> {
                return new DVD(title, price);
            }
            case "잡지" -> {
                return new Magazine(title, price);
            }
            default -> {
                System.out.println("잘못된 입력");
                return null;
            }
        }
    }

    static void main() {
        Base.step("자료 계층 + 연체료");

        Book i1 = new Book("파이썬 기초", 15000);
        DVD i2 = new DVD("요리 강좌", 20000);
        Magazine i3 = new Magazine("월간 사진", 8000);

        System.out.println(i1.info());
        System.out.println(i2.info());
        System.out.println(i3.info());

        ArrayList<Item> items = new ArrayList<>();
        items.add(i1);
        items.add(i2);
        items.add(i3);

        Base.step("예약/추천 약속");

        System.out.printf("%s %s\n배지 : %s\n", i1.reserveInfo(), i1.info(), i1.badge());

        Base.step("추천 자료 안내");

        for(Item i : items){
            if (i instanceof Featured){
                System.out.printf("추천 안내 : %s -> %s\n", i.info(), ((Featured) i).badge());
            }
        }

        Base.step("제목으로 검색");

        System.out.println(checkByTitle(items,"파이썬 기초"));
        System.out.println(checkByTitle(items,"양자역학 입문"));

        Base.step("야간 반납 접수");

        Item i4 = ScanItem();

        System.out.printf("자료 등록 완료 : %s\n", i4.info());
    }
}
