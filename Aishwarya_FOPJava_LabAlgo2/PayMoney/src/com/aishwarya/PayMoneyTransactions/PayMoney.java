package com.aishwarya.PayMoneyTransactions;

public class PayMoney {
	private Transactions[] transactions;

    public PayMoney(Transactions[] transactions) {
        this.transactions = transactions;
    }

    public void findAchievedTransactions(int[] targets) {
        for (int target : targets) {
            int currentSum = 0;
            int transactionsCount = 0;

            for (Transactions transaction : transactions) {
                currentSum += transaction.getAmount();
                transactionsCount++;

                if (currentSum >= target) {
                    System.out.println("Target achieved after " + transactionsCount + " transactions");
                    break;
                }
            }

            if (currentSum < target) {
                System.out.println("Target is not achieved.");
            }
        }
}
}
