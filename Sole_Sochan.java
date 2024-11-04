
package NgoXuanHiep_29219047048;
public class Sole_Sochan {
public static void main(String[] args) {
        int Sochan = 0;
        int Sole = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                Sochan += i; 
            } else {
                Sole += i; 
            }
        }
        System.out.println("Tong cac so chan tu 1 den 100: " + Sochan);
        System.out.println("Tong cac so le tu 1 den 100: " + Sole);
    }
}