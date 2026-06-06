
package day02;

public class P5Order {

    static class Menu {
        String name;
        int price, quantity;

        Menu(String n, int p, int q){
            this.name = n;
            this.price = p;
            this.quantity = q;
        }

        int bill(){
            return price * quantity;
        }

        void receipt(){
            System.out.println(name + "\t" + quantity);
        }
    }

    static class Bill{
        static int discount(int price, boolean discount, double discount_rate){


            if (discount) {
                return (int)((1 - discount_rate) * price);
            }
            else {return price;}
        }

        static int[] change(int bill, int paid){
            int change = bill - paid;

            int change_tt = change / 10000;
            int change_tmp = change % 10000;

            int change_ft = change_tmp / 5000;
            change_tmp = change_tmp % 5000;

            int change_t = change_tmp / 1000;
            change_tmp = change_tmp % 1000;

            int change_fh = change_tmp / 500;
            change_tmp = change_tmp % 500;

            int change_h = change_tmp / 100;

            int[] out = new int[] {change_tt, change_ft, change_t, change_fh, change_h};

            return out;
        }

        static void receipt(int[] bills){
            String out = "만원  : " + bills[0] + " 장\n" +
            "오천원: " + bills[1] + " 장\n" +
            "천원  : " + bills[2] + " 장\n" +
            "오백원: " + bills[3] + " 개\n" +
            "백원  : " + bills[4] + " 개\n" ;

            System.out.println(out);
        }
    }


    static void main() {
        String cafe_name = "SeSAC";
        int branchid = 1;

        String cafe_loc = "서울 중구 창경궁로5다길 27";

        boolean discount = true;
        double discount_r = .1;

        Menu M1 = new Menu("Americano", 3000, 4);
        Menu M2 = new Menu("Caffe Latte", 3500, 1);
        Menu M3 = new Menu("Americano Decaf", 3300, 2);

        int price = M1.bill() + M2.bill() + M3.bill();

        price = Bill.discount(price, discount, discount_r);

        int pay = (int) Math.ceil(price/10000.0) * 10000;

        System.out.println("총액 : " + pay + " W");

        M1.receipt();
        M2.receipt();
        M3.receipt();

        Bill.receipt(Bill.change(price, pay));



    }
}
