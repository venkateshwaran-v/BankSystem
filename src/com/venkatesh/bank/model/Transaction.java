package com.venkatesh.bank.model;

import java.time.LocalDateTime;

class Transaction {
    private long transactionId;
    private int fromAccount;
    private int toAccount;
    private double amount;
    final private LocalDateTime timestamp;
    private TransactionType type;

    public Transaction(long transactionId, int fromAccount, int toAccount, double amount, TransactionType type) {
        this.transactionId = transactionId;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.type = type;
    }

    public long getTransactionId() { return transactionId; }
    public void setTransactionId(long transactionId) { this.transactionId = transactionId; }

    public int getFromAccount() { return fromAccount; }
    public void setFromAccount(int fromAccount) { this.fromAccount = fromAccount; }

    public int getToAccount() { return toAccount; }
    public void setToAccount(int toAccount) { this.toAccount = toAccount; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public TransactionType getType() { return type; }
    public void setType(TransactionType type) { this.type = type; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transaction{");
        sb.append("transactionId=").append(transactionId);
        sb.append(", fromAccount=").append(fromAccount);
        sb.append(", toAccount=").append(toAccount);
        sb.append(", amount=").append(amount);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
