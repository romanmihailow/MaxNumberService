import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int a = in.nextInt();
        System.out.print("Введите число B: ");
        int b = in.nextInt();

        CalcService service = new CalcService();
        int myMax = service.max(a, b);

//        int a = 50;
//        int b = 6;
//        int result;
//        if (a > b) {
//          result = a;
//        } else {
//          result = b;
//        }
        System.out.println("MAX " + myMax);
    }
}