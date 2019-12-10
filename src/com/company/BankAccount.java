package com.company;

public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }
    double deposit(double sum){
        System.out.println("Положили деньги на счет:  "+sum);
        amount = amount +sum;
        return amount;
    }

    public void withDraw(double sum){

        if( sum > getAmount() ){
            throw  new LimitException("Сумма запроса превышает количество денег.",getAmount());
        }
        System.out.println("Вы сняли "+ sum);
        amount=amount-sum;
    }

    public double amount() {
        return amount=amount- getAmount();
    }
}

