package day10.H1;

public abstract class Property implements  Showable{
    String address;
    int price;
    String type;

    Property(String address, int price){
        this.address = address;
        this.price   = price;
    }

    abstract int commission();

    String info(){
        return "%s (%d만 / 수수료 %d만)".formatted(address, price, commission());
    }

    String kind(){return type;}

    public String showInfo(){
        return "[매물 소개] %s / 수수료 %d만".formatted(address, commission());
    }
}
