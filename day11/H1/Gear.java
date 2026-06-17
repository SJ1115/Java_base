package day11.H1;

public class Gear {
    String name;
    int dailyFee;
    int stock;

    Gear(String name, int dailyFee, int stock){
        this.name = name;
        this.dailyFee = dailyFee;
        this.stock = stock;
    }
    Gear(String name, int dailyFee){
        this(name, dailyFee, 0);
    }

    String info(){
        return "%s (일일 %d원 / 보유 %d개)".formatted(name, dailyFee, stock);
    }
}
