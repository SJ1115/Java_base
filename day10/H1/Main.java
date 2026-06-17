package day10.H1;

import common.Base;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Property ScanProperty(){
        Scanner sc = new Scanner(System.in);

        System.out.print("매물 분류(아파트/오피스텔/상가) :");
        String type = sc.nextLine();

        System.out.print("주소 :");
        String address = sc.nextLine();

        System.out.print("매물가 :");
        int price = sc.nextInt();

        if (type.equals("아파트")){
            return new Apt(address, price);

        } else if (type.equals("오피스텔")) {
            return new Officetel(address, price);
        } else if (type.equals("상가")) {
            return new Store(address, price);
        } else {
            System.out.println("잘못된 입력");
            return null;
        }
    }

    static void main() {
        //1
        /*Base.step();
        Property p = new Property("강남 1번지", 50000);
*/
        //2
        Base.step(2, "아파트 등장");

        Apt a1 = new Apt("강남 1", 50000);

        System.out.println(a1.info());

        //3
        Base.step("오피스텔/상가 추가");

        Officetel o1 = new Officetel("역삼 2", 30000);
        Store st1 = new Store("서초 3", 20000);

        System.out.printf("%s\n%s\n", o1.info(), st1.info());

        //4
        Base.step("매물 명단");

        ArrayList<Property> estates = new ArrayList<>();

        estates.add(a1);
        estates.add(o1);
        estates.add(st1);

        for(Property p:estates){
            System.out.println(p.info());
        }

        //5
        Base.step("손님에게 보여주기");

        System.out.println(a1.showInfo());

        //6
        Base.step("약속 타입으로 다루기");

        Showable sh = a1;

        System.out.println(sh.showInfo());

        //7
        Base.step("프리미엄 배지");

        System.out.printf("배지 : %s\n", a1.badge());

        //8
        Base.step("프리미엄 매물만 추리기");

        for(Property p:estates){
            if (p instanceof Premium){
                System.out.printf("프리미엄 안내 : %s\n",p.info());
            }
        }

        //9
        Base.step("매물 종류 확인");

        String wannaType = "상가";

        for(Property p:estates){
            if (wannaType.equals(p.kind())){
                System.out.printf("%s 매물 : %s\n",wannaType, p.info());
            }
        }

        //10
        Base.step("실시간 매물 접수");

        Property prop = ScanProperty();
        System.out.printf("매물 등록 완료 : %s", prop.info());
    }
}
