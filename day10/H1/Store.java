package day10.H1;

public class Store extends Property{


    Store(String address, int price) {
        super(address, price);
        type = "상가";
    }

    @Override
    int commission() {
        return price / 50;
    }
}
