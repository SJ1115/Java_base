package day04;

public class base {
    static int n_step = 0;

    static void step(){
        n_step++;
        System.out.printf("\n------ Step %d ------\n", n_step);
    }
    static void step(String str){
        n_step++;
        System.out.printf("\n------ Step %d ------\n", n_step);
        System.out.printf("\t%s\n", str);
    }
    static void step(int n){
        n_step = n;
        System.out.printf("\n------ Step %d ------\n", n_step);
    }
    static void step(int n, String str){
        n_step = n;
        System.out.printf("\n------ Step %d ------\n", n_step);
        System.out.printf("\t%s\n", str);
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
