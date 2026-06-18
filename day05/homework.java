package day05;

import common.Base;

public class homework {

    static void startCall(){
        for(int i=0; i<3; i++) System.out.println("[AICRM 고객센터] 상담을 시작합니다.");
    }

    static void greetCustomer(String name){
        System.out.printf("%s 고객님, 무엇을 도와드릴까요??\n", name);
    }

    static void openTicket(String name, String type, int priority){
        System.out.printf("[티켓] %s / 유형 : %s / 우선순위 : %d\n", name, type, priority);
    }

    static int waitTime(int queue){
        return 3*queue;
    }

    static void waitTimeEstimator(int queue){
        int t = waitTime(queue);
        System.out.printf("현재 대기 %d명\t-> 예상 %d분\n", queue, t);
    }

    static String priority(int priority){
        if (priority > 7){
            return "긴급";
        } else if (priority > 3) {
            return "보통";
        } else {
            return "낮음";
        }
    }

    static int totalCharge(int unitPrice, int qty){
        return 2500 + unitPrice * qty;
    }

    static int sum(int[] list){
        int sum = 0;
        for (int i:list){
            sum += i;
        }
        return sum;
    }

    static double mean(int[] list){
        int sum = sum(list);
        return (double) sum/list.length;
    }

    static void notify(String name, String message){
        System.out.printf("[%s] %s\n", name, message);
    }
    static void notify(String message){
        notify("전체 공지", message);
    }

    static void showStatus(int cnt){
        System.out.printf("대기 고객 %d명\n", cnt);
    }
    static void showStatus(String message){
        System.out.println("공지 : " + message);
    }

    static int autoResponse(String name, int priority, int queue){
        String priorityMsg = priority(priority);
        int waiting = waitTime(queue);

        System.out.printf("%s - 우선순위 %s / 예상 대기 시간 %d분\n", name, priorityMsg, waiting);

        return waiting;
    }
    static void main() {

        Base.step("상담 시작 인사");

        startCall();

        Base.step("이름 맞춤 인사");

        greetCustomer("김하늘");
        greetCustomer("이도윤");
        greetCustomer("박지우");

        Base.step("티켓 접수");

        openTicket("김하늘", "환불 문의", 5);
        openTicket("이도윤", "배송 지연", 8);

        Base.step("예상 대기시간");

        waitTimeEstimator(4);
        waitTimeEstimator(10);

        Base.step("우선순위 판정"); //5

        int[] priorities = {9, 5, 2};
        for (int i : priorities) {
            System.out.printf("레벨 %d-> %s\n", i, priority(i));
        }

        Base.step("처리 비용"); // 6

        int p = 15000; int q = 4;
        System.out.printf("%d원 x %d원 + 수수료 = %d원\n", p, q, totalCharge(p, q));

        Base.step("주간 처리 건수"); // 7

        int[] weekResolved = {12, 9, 15, 11, 14};
        System.out.printf("주간 처리 합계 : %d건\n 하루 평균 : %.1f건\n", sum(weekResolved), mean(weekResolved));

        Base.step("공지 오버로딩"); // 8

        notify("금일 17시 점검");
        notify("김하늘", "환불 완료되었습니다");

        Base.step("상태 안내 오버로딩"); // 9

        showStatus(5);
        showStatus("금일 점검 예정");

        Base.step("명단 자동 응대"); //10

        String[] names = {"김하늘", "이도윤", "박지우"};
        int[] levels = {9, 5, 2};
        int[] queues = {4, 7, 2};

        int totalWait=0;

        for (int i=0; i<names.length; i++){
            totalWait += autoResponse(names[i], levels[i], queues[i]);

        }

        System.out.printf("총 예상 대기시간 : %s분\n", totalWait);

    }
}
