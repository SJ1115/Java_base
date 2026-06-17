package day11.P1;

public class Product {
    String name;
    int price;
    int stock;

    Product(String name, int price, int stock){
        this.name=name;
        this.price=price;
        this.stock=stock;
    }
    Product(String name, int price){
        this(name, price, 0);
    }

    String info(){return "%s %d원 (재고 %d)".formatted(name, price, stock);}
}
