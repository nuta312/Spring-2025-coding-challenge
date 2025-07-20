package com.spring2025.codingbat.iliaz.bankApp;

import java.time.LocalDateTime;

public class Transaction {
    private final String type;

    public final double amount;
    private final LocalDateTime timeStamp = LocalDateTime.now();

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s: %.2f", timeStamp, type, amount);
    }
}
