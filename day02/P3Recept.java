package day02;

public class P3Recept {
    static void main() {

        P2Info.next_step("산술연산");
        System.out.println(10+3);

        P2Info.next_step("연산결과저장");
        int price = 4500;
        int quantity = 2;
        System.out.println("Americano : " + price*quantity);

        P2Info.next_step("영수증만들기");
        int p1, p2, p3, q1, q2, q3;

        String menu01 = "Americano";
        p1 = 4500; q1 = 2;

        String menu02 = "Caffe Latte";
        p2 = 5000; q2 = 1;

        String menu03 = "Cheeze Cake";
        p3 = 6500; q3 = 1;

        int totalprice = q1*p1 + q2*p2 + q3*p3;

        String receipt = "------RECEIPT------\n" +
                menu01 + "\t : " + q1 + "  -->  " + q1*p1 +"\n" +
                menu02 + "\t : " + q2 + "  -->  " + q2*p2 +"\n" +
                menu03 + "\t : " + q3 + "  -->  " + q3*p3 +"\n" +
                "--- total : " + totalprice + "---"
                ;
        ;
        System.out.println(receipt);

        P2Info.next_step("나머지(%) 활용");
        int payment = 30000;
        int change = payment - totalprice;

        System.out.println("거스름돈 : " + change + "W");

        int change_tt = change / 10000;
        int change_tmp = change % 10000;

        int change_ft = change_tmp / 5000;
        change_tmp = change_tmp % 5000;

        int change_t = change_tmp / 1000;
        change_tmp = change_tmp % 1000;

        int change_fh = change_tmp / 500;
        change_tmp = change_tmp % 500;

        int change_h = change_tmp / 500;

        String bill_cnt = "만원 \t: " + change_tt + " 장\n" +
                "오천원 \t: " + change_ft + " 장\n" +
                "천원 \t: "   + change_t + " 장\n" +
                "오백원 \t: " + change_fh + " 개\n" ;
        System.out.println(bill_cnt);
        //System.out.println(change_tt + "\n" + change_ft+ "\n" + change_t+ "\n" + change_fh+ "\n" + change_h);

        P2Info.setup(6);
        P2Info.next_step("연산 우선순위");

        System.out.println( 2+3*4 );
        System.out.println( (2+3)*4 );
    }
}
