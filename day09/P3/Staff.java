package day09.P3;

public class Staff {
    String name;

    Staff(String name){
        this.name = name;
    }

    void duty(){
        System.out.printf("%s : 대기 중\n", name);
    }

    void info(){
        System.out.printf("%s (스태프)\n", name);
    }
}
