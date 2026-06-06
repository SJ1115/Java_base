package day03;

public class P1Comp {

    static void main() {
        base.step(2, "비교 연산자");

        int i = 5;
        System.out.println( i == 3 );

        i = 3;
        System.out.println( i == 3 );
        System.out.println( i > 3 );
        System.out.println( i >= 3 );
        System.out.println( i < 3 );
        System.out.println( i <= 3 );

        base.step("체크 : 성인여부");

        int age = 25;

        boolean is_adult = age >= 19;
        boolean is_minor = age < 19;

        System.out.println("나이   : " + age + "\n성인   : " + is_adult + "\n미성년 : " + is_minor);

        base.step("논리 연산자");

        System.out.println( true && true  );
        System.out.println( true && false );
        System.out.println( true || false );
        System.out.println(false || false );
        System.out.println( true ^  true  );
        System.out.println( true ^ false  );
        System.out.println( !true  );
        System.out.println( !false );

        base.step( "체크 : 입장자격" );

        boolean has_ticket = true;

        System.out.println(is_adult && has_ticket);

        boolean is_VIP = false;

        System.out.println(is_VIP || (is_adult && has_ticket));

        int start_time = 900;
        int curr_time = 1111;

        boolean is_started = curr_time >= start_time;

        System.out.println(!is_started);

        base.step("연산자 오류 실험");

        int price = 8000;
        boolean is_check = price == 8000;
        System.out.println(is_check);
        //boolean is_check = price = 8000;


        base.step(7, "추가문제");

        boolean is_early = true;
        System.out.printf("Age : %d\tTickets : %b\n", age, has_ticket);
        System.out.printf("General Lounge\t: %b\nVIP Lounge\t: %b\n", age>19&&has_ticket, is_early||is_VIP);
        System.out.printf("Refund : %b", !is_started);

    }
}
