package day10.H1;

public class DVD extends Item {

    DVD(String title, int price){
        super(title, price);
    }

    @Override
    int lateFee() {
        return price/50 + 100;
    }
}
