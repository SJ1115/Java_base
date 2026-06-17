package day10.H1;

public class Apt  extends Property implements Premium{

    Apt(String address, int price) {
        super(address, price);
        type = "아파트";
    }

    @Override
    int commission() {
        return price/100;
    }

    @Override
    public String badge() {
        return "Premium 매물";
    }
}
