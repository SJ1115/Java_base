package day03;

public class P4Ticket {
    static int ticket_price(boolean is_EB){
        return is_EB ? 88000 : 120000;
    }

    static void main() {
        base.step(2, "Early-Bird Discount");

        boolean is_EB = true;

        int price = ticket_price(is_EB);

        System.out.printf("얼리버드 : %b\n", is_EB);
        System.out.printf("티켓가격 : %d 원", price);

        base.step("if-else version");

        price = 120000;
        if( is_EB ) price = 88000;
        System.out.printf("얼리버드 : %b\n", is_EB);
        System.out.printf("티켓가격 : %d 원", price);

        base.step("SUMMER FESTA tickets");

        boolean is_student = true;

        int waterBomb = is_student ? 88000 : 120000;
        int penta = is_student ? 175000 : 220000;
        int DMZPeace = is_student ? 65000 : 85000;
        int BeachWave = is_student ? 79000 : 99000;

        System.out.printf("워터밤     %d W\n", waterBomb);
        System.out.printf("펜타포트   %d W\n", penta);
        System.out.printf("DMZ평화    %d W\n", DMZPeace);
        System.out.printf("비치웨이브 %d W\n", BeachWave);

        int total = waterBomb+penta+DMZPeace+BeachWave;
        System.out.printf("총 %d W\n", total);

        base.step("++Student Discount");

        int final_price = (is_EB && is_student) ? (int)(price*.7) : price;

        System.out.printf("얼리버드+학생 : %b\n", (is_EB && is_student));
        System.out.printf("기본 가격 : %d\n", price);
        System.out.printf("최종 가격 : %d\n", final_price);

        base.step("결재 등급");
        int total_spent = 350000;

        String tier = total_spent >= 200000 ? "VIP" : "일반";
        String benefit = total_spent >= 200000 ? "라운지+우선입장+굿즈" : "일반입장";

        System.out.printf("누적 결재금액 : %d\n", total_spent);
        System.out.printf("등급 : %s\n", tier);
        System.out.printf("혜택 : %s\n", benefit);

        base.step("실습");

        boolean is_weekend = true;
        boolean is_season  = true;
        String membership  = "Gold";

        price = 200000;
        int price_weekend = is_weekend ? (int)(price * 1.3) : price;
        int price_season  = is_season ? (int)(price_weekend * 1.2) : price_weekend;

        int price_final;
        if (membership == "VIP"){
            price_final = price;
        } else if (membership == "Gold"){
            price_final = (int) (price_season * .9);
        } else if (membership == "Silver"){
            price_final = (int) (price_season * .95);
        } else {
            price_final = price_season;
        }

        System.out.printf("평일   : %b\n", !is_weekend);
        System.out.printf("성수기 : %b\n", is_season);
        //System.out.printf("회원   : %s 등급 \n", membership);

        System.out.printf("기본 가격 : %d\n", price);
        System.out.printf("최종 가격 : %d\n", price_final);
        System.out.printf("객실 등급 : %s\n", price_final<300000 ? "Standard" : "Sweet");
    }
}
