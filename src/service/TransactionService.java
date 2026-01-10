package service;

import model.BankAccount;
import repository.AccountRepository;

public class TransactionService {
    private AccountRepository repo;

    public TransactionService(AccountRepository repo) {
        this.repo = repo;
    }
    public void Deposit(int id,double amount){
        BankAccount bankAccount = repo.findById(id);
        bankAccount.setBalance(bankAccount.getBalance()+amount);
    }

    public double chekBalance(int id){
        BankAccount bankAccount = repo.findById(id);
        return bankAccount.getBalance();
    }
}
