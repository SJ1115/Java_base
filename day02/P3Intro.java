package day02;

public class P3Intro {

    static void main() {
        P2Info.setup();

        P2Info.next_step("String 연습");
        String name = "SungJu";
        String city = "Seoul";
        String hobby = "Walk";

        System.out.println(name);
        System.out.println(city);
        System.out.println(hobby);

        String longstr = "Salesforce AI CRM Track 2기\"\"" +
                "Salesforce AI CRM Track 2기";

        System.out.println(longstr);

        P2Info.next_step("Char/Str 연습");

        char grade = 'A';
        char gender = 'M';
        char mbti1 = 'I';

        String code = "" + grade + gender + mbti1;

        System.out.println(code);

        P2Info.next_step("문자열 변수 표현");

        char lName = '이';
        String fname = "성주";

        String KorName = lName+fname;

        System.out.println(KorName);

        System.out.println(KorName+20);

        P2Info.next_step("재할당");
        int age = 25;
        double height = 165.;
        boolean likeCoffee = true;
        //char age = '5';

        String fullIntro = "이름?나이?취미?성격?";
        String enter = " ";

        fullIntro = "이름 : " + KorName + enter +
                    "나이 : " + age + enter +
                    "신장 : " + height + enter +
                    "성격 : " + mbti1 + enter +
                    "취미 : " + hobby + enter +
                    "커피 : " + likeCoffee
                ;

        System.out.println(fullIntro);

        enter = "\n";
        fullIntro = "이름 : " + KorName + enter +
                "나이 : " + age + enter +
                "신장 : " + height + enter +
                "성격 : " + mbti1 + enter +
                "취미 : " + hobby + enter +
                "커피 : " + likeCoffee
        ;

        System.out.println(fullIntro);
    }

}
