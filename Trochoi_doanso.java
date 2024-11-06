
package NgoXuanHiep_29219047048;
import java.util.Scanner;
import java.util.Random;
public class Trochoi_doanso {
   public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(50) + 1; 
        Scanner scanner = new Scanner(System.in);       
        while (true) {
            System.out.print("Doan mot so tu 1 den 50: ");
            int guess = scanner.nextInt();
            if (guess == numberToGuess) {
                System.out.println("Ban da doan dung.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("So ban doan nho hon so can tim.");
            } else {
                System.out.println("So ban doan lon hon so can tim.");
            }
        }       
        scanner.close();
    }
}
