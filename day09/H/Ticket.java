package day09.H;

public class Ticket {
    static int register;

    String audience;
    int basePrice;

    int bookNo;



    Ticket(String audience, int basePrice){
        this.audience = audience;
        this.basePrice = basePrice;

        register ++;
        bookNo = 100+register;
    }
    Ticket(String audience){
        this(audience, 80000);
    }

    /*void info(){
        System.out.printf("%s [%s] %d원\n", audience, grade(), getPrice());
    }*/

    String grade(){
        return "일반";
    }

    String benefit(){
        return "기본 입장";
    }

    void info(){
        System.out.printf("B%d | %s [%s] %d 원 %s\n", bookNo, audience, grade(), getPrice(), benefit());
    }

    int getPrice(){
        return basePrice;
    }
}
