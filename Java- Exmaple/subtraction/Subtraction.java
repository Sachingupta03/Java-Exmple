package subtraction;

public class Subtraction {

    public void sub_Nos_int() {
        int no1 = 10;
        int no2 = 20;
        System.out.println("Subtraction of no1 and no2 is" + (no1 - no2));
    }

    public void sub_Nos_float() {
        float no1 = 1.4f;
        float no2 = 2.2f;
        System.out.println("Subtraction of no1 and no2 is" + (no1 - no2));
    }

    public void sub_Nos_double() {
        double no1 = 15.42;
        double no2 = 165.4;
        System.out.println("Subtraction of no1 and no2 is" + (no1 - no2));
    }
    public void sub_Nos_long() {
        long no1 = 46841246;
        long no2 = 4861853;
        System.out.println("Subtraction of no1 and no2 is" + (no1 - no2));
    }

    public static void main(String[] args) {
        Subtraction demo = new Subtraction();
        demo.sub_Nos_int();
        demo.sub_Nos_float();
        demo.sub_Nos_double();
        demo.sub_Nos_long();
    }
}