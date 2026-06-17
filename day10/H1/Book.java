package day10.H1;

public class Book extends Item implements Reservable, Featured{

    Book(String title, int price){
        super(title, price);
    }

    @Override
    int lateFee(){
        return price/100;
    }

    @Override
    public String reserveInfo() {
        return "[예약 가능]";
    }

    @Override
    public String badge(){
        return "이달의 추천";
    }

}
