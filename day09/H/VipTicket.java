package day09.H;

public class VipTicket extends Ticket{

    VipTicket(String audience, int basePrice){
        super(audience, basePrice);
    }
    VipTicket(String audience){super(audience);}

    @Override
    String grade(){return "VIP";}

    @Override
    int getPrice(){
        return 80000 + basePrice;
    }

    @Override
    String benefit(){
        return "사인회 입장권 + 포토카드";
    }

    void signEvent(){
        System.out.printf("%s - 사인회 12시 입장\n", audience);
    }
}
