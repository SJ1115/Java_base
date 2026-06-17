package day10.H1;

public class Officetel extends Property{


    Officetel(String address, int price) {
        super(address, price);
        type = "오피스텔";
    }

    @Override
    int commission() {
        return 10 + price / 100;
    }
}
