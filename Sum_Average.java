
package taomang;
import java.util.Scanner;
public class Sum_Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();   
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }       
        int Sum = 0;
        for (int so : arr) {
            Sum += so;
        }       
        double Average = (double)Sum / n;       
        System.out.println("Tong cac phan tu: " + Sum);
        System.out.println("Trung binh cac phan tu: " + Average);
    }
}

