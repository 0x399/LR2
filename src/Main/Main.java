package Main;
import Customer.Customer;
import java.util.Scanner;

public class Main {

    static int count = 0;

    static Customer[] input(){
        Scanner sc = new Scanner(System.in);
        Customer[] customers = new Customer[25];
        for (int i = 0; i < customers.length; i++) {
            System.out.println("ID:");
            int id = sc.nextInt();
            if (id == 0)
                break;
            System.out.println("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Last name:");
            String ln = sc.nextLine();
            System.out.println("Patronimic:");
            String pn = sc.nextLine();
            System.out.println("Address:");
            String addr = sc.nextLine();
            System.out.println("Balance:");
            double balance = sc.nextDouble();
            System.out.println("Card number:");
            int card_num = sc.nextInt();
            customers[i] = new Customer(id, name, ln, pn, addr, balance, card_num);
            count++;
        }
        return customers;
    }

    static Customer[] find_by_name(String name, Customer[] customer_list){
        Customer[] named_list;
        int list_iter = 0;
        named_list = new Customer[count];
        for (int i = 0; i < count; i++) {
            if(customer_list[i].name.equals(name)) {
                named_list[list_iter] = customer_list[i];
                list_iter++;
            }
        }
        for (int i = 0; i < list_iter; i++){
            System.out.println(named_list[i]);
        }
        return named_list;
    }

    static Customer[] find_by_card(int high, int low, Customer[] customer_list){
        Customer[] named_list;
        int list_iter = 0;
        named_list = new Customer[count];
        for (int i = 0; i < count; i++) {
            if((customer_list[i].getCard_num() < high) & (customer_list[i].getCard_num() > low)){
                named_list[list_iter] = customer_list[i];
                list_iter++;
            }
        }
        for (int i = 0; i < list_iter; i++){
            System.out.println(named_list[i]);
        }
        return named_list;
    }

    static Customer[] find_by_balance(Customer[] customer_list){
        Customer[] named_list;
        int list_iter = 0;
        named_list = new Customer[count];
        for (int i = 0; i < count; i++) {
            if((customer_list[i].getBalance() < 0)){
                named_list[list_iter] = customer_list[i];
                list_iter++;
            }
        }
        for (int i = 0; i < list_iter; i++){
            System.out.println(named_list[i]);
        }
        System.out.println(list_iter + "боржників.");
        return named_list;
    }

    public static void main(String[] args) {
        Customer[] customer_list = input();
        for (int i = 0; i < count; i++) {
            System.out.println(customer_list[i]);
        }
        System.out.println("List of Petros:");
        find_by_name("Petro", customer_list);
        System.out.println("List of people in range from 14000 to 15000:");
        find_by_card(15000, 14000, customer_list);
        System.out.println("List of all debtors:");
        find_by_balance(customer_list);
    }
}
