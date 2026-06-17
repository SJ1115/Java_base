package common;

public class Base {
     static int n_step = 0;

    public static void setup(int i){
        n_step = i;
    }
    public static void setup()     {
        setup(0);
    }

    public static void step(int n, String str){
        setup(n);
        System.out.printf("\n------ Step %d : %s ------\n", n_step, str);
    }
    public static void step(String str){
        n_step++;
        step(n_step, str);
    }
    public static void step(int n){
        step(n, "");
    }
    public static void step(){
        n_step++;
        step(n_step, "");
    }





    static void main() {
        System.out.println("---------Step Test----------");

        step();
        step();
        step("Make with the String!");

        System.out.println("\n---------Reset Test----------");

        step(5);
        step(8);
        step(10, "Reset with the String!");


    }
}
