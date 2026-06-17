package day08.P2;

public class Survivor {
    private String name;
    private int hp;
    private int ammo;

    static int campCount;
    static int totalAmmo;

    static final int MAX_CAPACITY = 50;

    private int checkHp(int hp){
        if (hp > 100) hp = 100;
        else if (hp < 0) hp = 0;

        return hp;
    }

    private int checkAmmo(int ammo){
        if (ammo > 100) ammo = 100;
        else if (ammo < 0) ammo = 0;

        return ammo;
    }

    Survivor(String name, int hp, int ammo){
        this.name = name;
        this.hp = checkHp(hp);
        this.ammo = checkAmmo(ammo);
        campCount++;
        totalAmmo += ammo;
    }
    Survivor(String name, int hp){
        this(name, hp, 0);
    }
    Survivor(String name){
        this(name, 100);
    }
    Survivor(){
        this("");
    }


    void info(){
        System.out.printf("%s (체력 %d . 탄약 %d)\n", name, hp, ammo);
    }

    static void status(){
        System.out.printf("캠프 현황 : 총원 %d명 / 최대 %d\n", campCount, MAX_CAPACITY);
    }

    static void statusWammo(){
        System.out.printf("캠프 현황 : 총원 %d명, 탄약 %d / 최대 %d명\n", campCount, totalAmmo, MAX_CAPACITY);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = checkAmmo(ammo);
    }

    public void setHp(int hp) {
        this.hp = checkHp(hp);
    }

    public void setName(String name) {
        this.name = name;
    }
}
