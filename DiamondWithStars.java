package Donguler;

import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int n = scan.nextInt();
        int tempN = n;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n-i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++){
            for (int k = 1; k <= i; k++){
                System.out.print(" ");
            } tempN--;
            for (int j = 1; j <= (2*tempN) - 1; j++){
                System.out.print("*");
            }
            System.out.println();

        }



    }
}
