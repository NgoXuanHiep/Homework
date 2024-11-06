
package NgoXuanHiep_29219047048;
import java.util.Scanner;
public class Bangcuuchuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        int number = scanner.nextInt();
        
        System.out.println("Bnag cuu chuong cua " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        } 
        scanner.close();
    }
}


