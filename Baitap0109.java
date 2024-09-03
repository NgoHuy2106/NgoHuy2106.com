
package baitap0109;

import java.util.ArrayList;

import java.util.Scanner;

public class Baitap0109 {

    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }
        return numbers;
    }
    public static void DisplayData(ArrayList<Integer> numbers) {
        System.out.println("Mang so nguyen:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static int findMax2(ArrayList<Integer> numbers) {
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("Mang phai co it nhat 2 phan tu");
        }
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2 && number != max1) {
                max2 = number;
            }
        }
        return max2;
    }
    public static void deleteOddNumber(ArrayList<Integer> numbers) {
        numbers.removeIf(number -> number % 2 != 0);
    }
}
