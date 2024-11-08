
package taomang;
import java.util.Scanner;
import java.util.Arrays;
public class sapxep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Tang dan:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

