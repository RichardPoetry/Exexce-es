package principal;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        int number = sca.nextInt();
        System.out.print("Holder: ");
        String holder = sca.next().toString();
        System.out.print("Initial balance: ");
        double balance = sca.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sca.nextDouble();

        Account account = new Account(number, holder, balance , withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        double amount = sca.nextDouble();
        account.withdraw(amount);
        System.out.print("New balance: "+ account.getBalance());

    }
}