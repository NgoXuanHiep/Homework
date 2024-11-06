
package NgoXuanHiep_29219047048;
import java.util.Scanner;
public class Day_fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu day Fibonacci: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Day Fibonacci: ");       
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }       
        scanner.close();
    }   
}
