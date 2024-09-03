
package baitap0109;

import java.util.Scanner;

public class Process0109 {
    public static void main(String[] args) {
        NumberExercise numberExercise = new NumberExercise();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Kiem tra so nguyen to");
            System.out.println("2. Tinh giai thua");
            System.out.println("3. Tim uoc chung lon nhat");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    numberExercise.checkPrime();
                    break;
                case 2:
                    numberExercise.calculateFactorial();
                    break;
                case 3:
                    numberExercise.findGCD();
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai.");
            }
        } while (choice != 4);
    }
}
class NumberExercise {
    public void checkPrime() {
        System.out.println("Ban da chon kiem tra so nguyen to.");
    }
    public void calculateFactorial() {
        System.out.println("Ban da chon tinh giai thua.");
    }
    public void findGCD() {
        System.out.println("Ban da chon tim uoc chung lon nhat.");
    }
}
