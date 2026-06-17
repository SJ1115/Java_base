package day10.H1;

abstract public class Item {
    String title;
    int price;

    Item(String title, int price){
        this.title = title;
        this.price = price;
    }

    String info(){
        return "%s (정가 %d원 / 연체료 %d원)".formatted(title, price, lateFee());
    }

    abstract int lateFee();


}
