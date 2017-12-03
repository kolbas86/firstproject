import java.util.Scanner;

/**
 * Create on 30.11.2017
 */

public class Base {
    public static void main(String[] args) {
                                                // Create Scanner
        Scanner Base = new Scanner(System.in);
        double fn, sn, result;
        System.out.println("Введи первое число");
                                                // first number
        fn = Base.nextDouble();
        System.out.println("Введи второе число");
                                               // second number
        sn = Base.nextDouble();
        result = fn + sn;
        System.out.printf("Сумма равна %.4f " ,result);

        Base.close();
    }
}


