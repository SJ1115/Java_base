package day11.H1;

public class Service {
    String name;
    int minute;
    int price;

    Service(String name, int minute, int price){
        this.name   = name;
        this.minute = minute;
        this.price  = price;
    }

    String info(){
        return "%s (%d분 / %d원)".formatted(name, minute, price);
    }
}
