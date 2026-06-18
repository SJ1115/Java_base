package day11.H1;

import day11.P1.OutOfStockException;
import day11.P1.Product;

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

    static void order(Gear g, int qty) throws NotEnoughGearException {
        if (qty > g.stock){
            String error = "%s 재고 부족(재고 %d, 주문 %d)".formatted(
                    g.name, g.stock, qty);
            throw new NotEnoughGearException(error);
        }

        g.stock -= qty;

        System.out.printf("%s %d 개 주문 완료(재고 : %d)\n", g.name, qty, g.stock);
    }
}
