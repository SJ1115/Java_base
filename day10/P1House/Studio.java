package day10.P1House;

public class Studio extends Residence implements Scorable{
    int rent;

    Studio(String address, int deposit, int rent){
        super(address, deposit);
        this.rent = rent;
    }
    Studio(String address, int deposit){
        this(address, deposit, 0);
    }

    @Override
    int monthlyCost() {
        return rent;
    }

    @Override
    public int score(){
        return 100 - monthlyCost();
    }
}
