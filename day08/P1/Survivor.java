package day08.P1;

import java.util.Scanner;

public class Survivor {
    String name;
    int hp;
    int ammo;

    static int campCount;
    static int totalAmmo;

    static final int MAX_CAPACITY = 50;

    Survivor(String name, int hp, int ammo){
        this.name = name;
        this.hp = hp;
        this.ammo = ammo;
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
    /*Survivor(boolean byinput){

        Scanner sc = new Scanner(System.in);
        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("체력: ");
        int hp = Integer.parseInt(sc.nextLine());

        System.out.print("탄약: ");
        int ammo = Integer.parseInt(sc.nextLine());

        this(name, hp, ammo);

    }*/

    void info(){
        System.out.printf("%s (체력 %d . 탄약 %d)\n", name, hp, ammo);
    }

    static void status(){
        System.out.printf("캠프 현황 : 총원 %d명 / 최대 %d\n", campCount, MAX_CAPACITY);
    }

    static void statusWammo(){
        System.out.printf("캠프 현황 : 총원 %d명, 탄약 %d / 최대 %d명\n", campCount, totalAmmo, MAX_CAPACITY);
    }

    /*Survivor byInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("체력: ");
        int hp = Integer.parseInt(sc.nextLine());

        System.out.print("탄약: ");
        int ammo = Integer.parseInt(sc.nextLine());

        return new Survivor(name, hp, ammo);
    }*/


}
