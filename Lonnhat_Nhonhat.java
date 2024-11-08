
package taomang;
import java.util.Scanner;
public class Lonnhat_Nhonhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();    
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }       
        int Lonnhat = arr[0];
        int Nhonhat = arr[0];      
        for (int i = 1; i < n; i++) {
            if (arr[i] > Lonnhat) {
                Lonnhat = arr[i];
            }
            if (arr[i] < Nhonhat) {
                Lonnhat = arr[i];
            }
        }       
        System.out.println("Phan tu lon nhat: " + Lonnhat);
        System.out.println("Phan tu nho nhat: " + Nhonhat);
    }
}
