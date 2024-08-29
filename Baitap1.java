
package baitap1;

import java.util.Random;
import java.util.Scanner;

public class Baitap1 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n;
        String check;
    do{
        n = random.nextInt(100) + 1; 
            if (n % 2 == 0) {
                System.out.println(n + " la so chan");
            } else {
                System.out.println(n + " la so le");
            }
            System.out.print("Nhap 'yes' de tiep tuc hoac nhap bat ky de thoat: ");
            check = scanner.nextLine();
    } while (check.equalsIgnoreCase("yes"));
        if (n % 2 == 0) {
            System.out.println(n + " la so chan va vong lap da dung.");
        } else {
            System.out.println(n + " la so le va vong lap da dung.");
        }
        scanner.close();
    }
}
