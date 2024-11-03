
package NgoXuanHiep_29219047048;
import java.util.Scanner;
public class phuongtrinh {
    public static void giaiPhuongTrinhBac1(Scanner scanner) {
        System.out.println("Giai phuong trinh bac 1 (ax + b = 0)");
        System.out.print("nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("nhap b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh co vo so nghiem.");
            } else {
                System.out.println("phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("phuong trinh co nghiem x = " + x);
        }
    }
    public static void giaiPhuongTrinhBac2(Scanner scanner) {
        System.out.println("giai phuong trinh bac 2 (ax^2 + bx + c = 0)");
        System.out.print("nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("nhap c: ");
        double c = scanner.nextDouble();
        if (a == 0) {
            System.out.println("day khong phai la phuong trinh bac 2. chuyen sang giai phuong trinh bac 1.");
            giaiPhuongTrinhBac1(scanner);
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("phuong trinh co hai nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("phuong trinh co nghiem kep x = " + x);
            } else {
                System.out.println("phuong trinh vo nghiem.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("chon loai phuong trinh de giai:");
        System.out.println("1. phuong trinh bac 1 (ax + b = 0)");
        System.out.println("2. phuong trinh bac 2 (ax^2 + bx + c = 0)");
        int choice = scanner.nextInt();

        if (choice == 1) {
            giaiPhuongTrinhBac1(scanner);
        } else if (choice == 2) {
            giaiPhuongTrinhBac2(scanner);
        } else {
            System.out.println("khong hop le.");
        }

        scanner.close();
    }
}

