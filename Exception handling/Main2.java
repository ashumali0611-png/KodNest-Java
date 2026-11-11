
import java.util.Scanner;

class Main2 {

    public static void main(String[] args) {
        System.out.println("Main method execution started....");
        try {
            divide();
        } catch (Exception e) {
            System.out.println("Exception handled in Main");
        }
        System.out.println("Main method execution completed....");
    }

    static void divide() {
        try {
            System.out.println("Division started");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = scan.nextInt();
            System.out.println("Enter b: ");
            int b = scan.nextInt();
            int res = a / b;
            System.out.println("res");
        } catch (Exception e) {
            System.out.println("Exception handled in divide method");
            throw e;
        } finally {
            System.out.println("Division completed");
        }
    }
}
