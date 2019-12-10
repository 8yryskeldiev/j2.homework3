package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        for (int i = 0; ; i++) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                e.printStackTrace();
                System.out.println("Вы смогли снять только "+bankAccount.getAmount());
                bankAccount.amount();
                System.out.println("Ваш счет: "+ bankAccount.getAmount());
                break;
            }
        }
    }
}
