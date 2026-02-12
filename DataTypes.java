/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datatypes;

import java.util.Scanner;
import java.math.BigInteger;

public class DataTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menambahkan try-catch untuk menangani input non-angka
        try {
            if (!sc.hasNextInt()) return; 
            int T = sc.nextInt(); // jumlah test case

            for (int i = 0; i < T; i++) {
                String input = sc.next();
                try {
                    BigInteger n = new BigInteger(input);
                    boolean canFit = false;
                    
                    // Membuat string penampung untuk mengecek apakah ada yang muat
                    StringBuilder output = new StringBuilder();

                    if (n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                        n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                        output.append("* byte\n");
                        canFit = true;
                    }

                    if (n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                        n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                        output.append("* short\n");
                        canFit = true;
                    }

                    if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                        n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                        output.append("* int\n");
                        canFit = true;
                    }

                    if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                        n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                        output.append("* long\n");
                        canFit = true;
                    }

                    if (canFit) {
                        System.out.println(n + " can be fitted in:");
                        System.out.print(output.toString());
                    } else {
                        // Ini akan menangani angka super besar seperti 2133333333...
                        System.out.println(input + " can't be fitted anywhere.");
                    }
                } catch (NumberFormatException e) {
                    // Menangani jika input bukan angka sama sekali
                    System.out.println(input + " can't be fitted anywhere.");
                }
            }
        } finally {
            sc.close();
        }
    }
}