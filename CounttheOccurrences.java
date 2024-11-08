package taomang;
import java.util.Scanner;
public class CounttheOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhap so can dem: ");
        int target = scanner.nextInt();
        int count = CounttheOccurrences(arr, target);
        System.out.println("So lan xuat hien cua " + target + " trong mang: " + count);
    }
    public static int CounttheOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}