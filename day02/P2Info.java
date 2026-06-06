package day02;

public class P2Info {
    static int step = 0;

    static void next_step(){
        step++;
        System.out.printf("\n------ Step %d ------\n", step);
    }
    static void next_step(String str){
        step++;
        System.out.printf("\n------ Step %d ------\n", step);
        System.out.printf("\t%s\n", str);
    }

    static void setup(int i){step = i;}
    static void setup()     {step = 0;}

    static void countup(){step++;}

    static void main() {
        countup();

        next_step();
        int age=25;
        System.out.println(age);

        next_step();
        double height = 165.5;
        System.out.println(height);

        next_step("boolean");
        boolean is_hungry = true;
        boolean is_drowsy = false;

        System.out.println(is_hungry);
        System.out.println(is_drowsy);
        System.out.println(is_drowsy & is_hungry);

        next_step("My Info");
        double eye = 1.1;
        boolean is_hot = true;

        System.out.println(eye);
        System.out.println(is_hot);

        String new1 = "hi" + 'h' + 3 + "0";

        System.out.println(new1);
    }
}
