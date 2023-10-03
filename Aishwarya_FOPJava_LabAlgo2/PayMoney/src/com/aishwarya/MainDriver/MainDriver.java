package com.aishwarya.MainDriver;

import java.util.Scanner;
import com.aishwarya.PayMoneyTransactions.*;

public class MainDriver {

	public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size of the transaction array: ");
    int size = scanner.nextInt();
    Transactions[] transactions = new Transactions[size];

    System.out.println("Enter the values of the array:");
    for (int i = 0; i < size; i++) {
        transactions[i] = new Transactions(scanner.nextInt());
    }

    System.out.print("Enter the total number of targets that need to be achieved: ");
    int numTargets = scanner.nextInt();
    int[] targets = new int[numTargets];

    for (int i = 0; i < numTargets; i++) {
        System.out.print("Enter the value of target: ");
        targets[i] = scanner.nextInt();
    }

    PayMoney payMoney = new PayMoney(transactions);
    payMoney.findAchievedTransactions(targets);

    scanner.close();
}

}
