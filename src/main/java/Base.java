import java.util.Scanner;

/**
 * Create on 30.11.2017.
 */

public class Base {
    public static void main(String[] args) {
        Scanner Base = new Scanner(System.in);
        double fn, sn, result;
        System.out.println("Введи первое число");
        fn = Base.nextDouble();
        System.out.println("Введи второе число");
        sn = Base.nextDouble();
        result = fn + sn;
        System.out.println("Сумма равна " + result);

        Base.close();
    }
}


