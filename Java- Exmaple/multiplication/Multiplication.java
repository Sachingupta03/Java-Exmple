package multiplication;

public class Multiplication {

    public void mul_Nos_int() {
        int no1 = 10;
        int no2 = 20;
        System.out.println("Multiplication of no1 and no2 is" + (no1 * no2));
    }

    public void mul_Nos_float() {
        float no1 = 1.4f;
        float no2 = 2.2f;
        System.out.println("Multiplication of no1 and no2 is" + (no1 * no2));
    }

    public void mul_Nos_double() {
        double no1 = 15.42;
        double no2 = 165.4;
        System.out.println("Multiplication of no1 and no2 is" + (no1 * no2));
    }
    public void mul_Nos_long() {
        long no1 = 46841246;
        long no2 = 4861853;
        System.out.println("Multiplication of no1 and no2 is" + (no1 * no2));
    }

    public static void main(String[] args) {
        Multiplication demo = new Multiplication();
        demo.mul_Nos_int();
        demo.mul_Nos_float();
        demo.mul_Nos_double();
        demo.mul_Nos_long();
    }
}

