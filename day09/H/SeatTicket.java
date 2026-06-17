package day09.H;

public class SeatTicket extends Ticket{

    SeatTicket(String audience, int basePrice){
        super(audience, basePrice);
    }
    SeatTicket(String audience){super(audience);}

    @Override
    String grade(){return "지정석";}

    @Override
    String benefit(){
        return "지정 좌석 입장";
    }
}
