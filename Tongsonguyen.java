
package NgoXuanHiep_29219047048;
import java.util.Scanner;
public class Tongsonguyen {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int n = scanner.nextInt();
        int sumOfDigits = 0;
        while (n != 0) {
            sumOfDigits += n % 10;
            n /= 10; 
        }
        System.out.println("Tong cac chu so: " + sumOfDigits);
    }
}

