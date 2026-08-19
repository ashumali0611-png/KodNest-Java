
import java.util.Scanner;

public class TDArray {

    public static void main(String[] args) {
        int a[][] = new int[3][5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a.length - 1; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a.length - 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
