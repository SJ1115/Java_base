package day10.P1House;

public abstract class Residence {
    String address;
    int deposit;

    Residence(String address, int deposit){
        this.address = address;
        this.deposit = deposit;
    }

    String info(){
        return "%s(보증금 %d)".formatted(address, deposit);
    }

    abstract int monthlyCost();

    String info2(){
        return "%s(보증금 %d / 월 %d)".formatted(address, deposit, monthlyCost());
    }
}
