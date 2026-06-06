package day02;

public class P4BMI {
    static double bmi(double w, double h){
        double out = w;
        out /= h;
        out /= h;
        return out;
    }

    static void main() {
        P2Info.next_step("자동 변환");
        int score = 95;
        double avg = score;

        System.out.println(score);
        System.out.println(avg);

        P2Info.next_step("강제 변환");
        double height = 165.3;
        int c_height = (int) height;

        System.out.println(height);
        System.out.println(c_height);

        double a = 3.3; double b = 3.5; double c = 3.9;

        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println((int)c);
        System.out.println((int)a == (int)b);

        P2Info.next_step("정수 나누기");
        int tot_score = 283;
        int num_class = 3;

        System.out.println("int 계산  : " + (tot_score / num_class) );
        System.out.println("형변환 후 : " + ((double) tot_score / num_class) );
        System.out.println("형변환 후 : " + (tot_score / ((double) num_class)) );

        P2Info.next_step("BMI 계산하기");
        double kg = 63;
        double cm = 165.5;

        double m = cm / 100;

        System.out.println("키   : " + cm + " cm");
        System.out.println("무게 : " + kg + " kg");
        System.out.println("BMI  : " + bmi(kg, m));
        System.out.println("정수 -> " + (int) bmi(kg, m));


    }
}
