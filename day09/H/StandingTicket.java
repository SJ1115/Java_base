package day09.H;

public class StandingTicket extends Ticket{

    StandingTicket(String audience, int basePrice){
        super(audience, basePrice);
    }
    StandingTicket(String audience){super(audience);}

    @Override
    String grade(){return "스탠딩";}

    @Override
    int getPrice(){
        return (basePrice - 30000);
    }

    @Override
    String benefit(){
        return "스탠딩 구역 입장";
    }
}
