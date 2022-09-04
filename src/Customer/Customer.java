package Customer;

import java.lang.String;

public class Customer {
    int id;
    public String name;
    String lastname;
    String patr_name;
    String address;
    private double balance;
    private int card_num;

    public Customer(int id, String name, String lastname, String patr_name, String address, double balance, int card_num) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.patr_name = patr_name;
        this.address = address;
        this.balance = balance;
        this.card_num = card_num;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCard_num() {
        return card_num;
    }

    public void setCard_num(int card_num) {
        this.card_num = card_num;
    }

    @Override
    public String toString() {
        return "Дані клієнта{" +
                "ID =" + id +
                ", Ім'я ='" + name + '\'' +
                ", Прізвище ='" + lastname + '\'' +
                ", По батькові ='" + patr_name + '\'' +
                ", Адреса ='" + address + '\'' +
                ", Баланс =" + balance +
                ", Номер карти =" + card_num +
                '}';
    }


}
