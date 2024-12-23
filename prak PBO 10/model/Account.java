package com.atm.model;

public class Account {
    private String accountNumber;
    private String pin;
    private double balance;

    // Saldo minimal
    public static final double MINIMUM_BALANCE = 50000;

    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Getter dan Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        this.balance -= amount;
    }

    // Metode untuk mengubah PIN
    public boolean changePin(String oldPin, String newPin, String confirmNewPin) {
        if (!this.pin.equals(oldPin)) {
            System.out.println("PIN lama salah.");
            return false;
        }

        if (!newPin.equals(confirmNewPin)) {
            System.out.println("PIN baru tidak cocok.");
            return false;
        }

        this.pin = newPin;
        System.out.println("PIN berhasil diubah.");
        return true;
    }
}
