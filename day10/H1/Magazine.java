package day10.H1;

public class Magazine extends Item {

    Magazine(String title, int price){
        super(title, price);
    }

    @Override
    int lateFee() {
        return price / 200;
    }
}
