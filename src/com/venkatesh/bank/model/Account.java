package com.venkatesh.bank.model;

class Account {
    private int accountNumber;
    private int userId;
    private double balance;

    public Account(int accountNumber, int userId, double balance) {
        this.accountNumber = accountNumber;
        this.userId = userId;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("accountNumber=").append(accountNumber);
        sb.append(", userId=").append(userId);
        sb.append(", balance=").append(balance);
        sb.append("}");
        return sb.toString();
    }
}
