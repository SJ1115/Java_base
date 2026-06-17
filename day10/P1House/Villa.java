package day10.P1House;

public class Villa extends Residence implements Scorable, PetFriendly{
    int rent;
    int maintenance;

    Villa(String address, int deposit, int rent, int maintenance) {
        super(address, deposit);
        this.rent = rent;
        this.maintenance = maintenance;
    }
    Villa(String address, int deposit){
        this(address, deposit, 0, 0);
    }

    @Override
    int monthlyCost() {
        return maintenance + rent;
    }

    @Override
    public int score(){
        return 100 - monthlyCost();
    }

    @Override
    public boolean allowsPet() {
        return true;
    }
}
