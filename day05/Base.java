package day05;

public class Base {
    static int n_step = 0;


    static void step(int n, String str){
        n_step = n;
        System.out.printf("\n------ Step %d : %s ------\n", n_step, str);
    }
    static void step(String str){
        n_step++;
        step(n_step, str);
    }
    static void step(int n){
        step(n, "");
    }
    static void step(){
        n_step++;
        step(n_step, "");
    }


    static void setup(int i){
        n_step = i;}
    static void setup()     {
        n_step = 0;}


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
