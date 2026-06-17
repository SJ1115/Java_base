package day10.P1House;

public class OfficeTel extends Residence implements Scorable, PetFriendly{
    int rent;
    int maintenance;

    OfficeTel(String address, int deposit, int rent, int maintenance) {
        super(address, deposit);
        this.rent = rent;
        this.maintenance = maintenance;
    }
    OfficeTel(String address, int deposit){
        this(address, deposit, 0, 0);
    }

    @Override
    int monthlyCost() {
        return rent + maintenance;
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
