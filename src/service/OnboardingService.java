package service;

import model.BankAccount;
import repository.AccountRepository;

public class OnboardingService {
    private AccountRepository repo;
    public OnboardingService(AccountRepository repo) {
        this.repo = repo;
    }

    public void createAccount(int id,String userName,double balance){
        BankAccount bankAccount = new BankAccount(id,userName,balance);
        repo.save(bankAccount);

    }
}
