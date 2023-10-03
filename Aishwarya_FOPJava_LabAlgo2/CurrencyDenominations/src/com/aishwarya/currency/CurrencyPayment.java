package com.aishwarya.currency;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyPayment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of currency denominations: ");
        int size = scanner.nextInt();
        int[] denominations = new int[size];

        System.out.println("Enter the currency denominations values:");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        Arrays.sort(denominations); // Sort the denominations in ascending order

        System.out.print("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();

        int remainingAmount = amount;
        System.out.println("Your payment approach in order to give the minimum number of notes will be:");

        for (int i = size - 1; i >= 0; i--) {
            int denomination = denominations[i];
            if (remainingAmount >= denomination) {
                int count = remainingAmount / denomination;
                remainingAmount %= denomination;
                System.out.println(denomination + ":" + count);
            }
        }

        scanner.close();
    }

	}
