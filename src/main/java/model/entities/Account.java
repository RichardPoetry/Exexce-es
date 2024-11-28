package model.entities;

import model.exceptions.AllExceptions;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit (double amount){
        balance += amount;

    }
    public void withdraw(double amount) throws AllExceptions {
        if(amount > withdrawLimit) {
            throw new AllExceptions(" The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new AllExceptions(" Not enough balance");
        }
        balance -= amount;

    }



}
