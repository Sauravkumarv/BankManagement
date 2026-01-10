import manager.BankManager;
import repository.AccountRepository;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);

 AccountRepository repo=new AccountRepository();
 BankManager manager=new BankManager(repo);

 System.out.print("Enter ID: ");
 int id=sc.nextInt();
 sc.nextLine();

 System.out.print("Enter Name: ");
 String name=sc.nextLine();

 System.out.print("Enter Amount: ");
double amount=sc.nextDouble();

manager.createUser(id,name,amount);
manager.deposit(id,amount);
System.out.print("Balance"+manager.getBalance(id));


    }
}