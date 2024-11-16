package com.atm.transaction;

import com.atm.model.Account;
import java.util.Scanner;

public class Withdrawal extends Transaction {

    public Withdrawal(Account account) {
        super(account);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah penarikan: ");
        double amount = scanner.nextDouble();

        // Validasi saldo minimal
        if (account.getBalance() - amount < Account.MINIMUM_BALANCE) {
            System.out.println("Saldo tidak mencukupi. Anda harus menyisakan saldo minimal Rp50,000.");
        } else {
            account.debit(amount);
            System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + account.getBalance());
        }
    }
}
