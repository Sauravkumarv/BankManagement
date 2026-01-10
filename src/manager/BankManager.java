package manager;

import repository.AccountRepository;
import service.OnboardingService;
import service.TransactionService;

public class BankManager {
    private OnboardingService onboarding;
    private TransactionService transaction;
    public BankManager(AccountRepository repo) {
        this.onboarding = new OnboardingService(repo);
        this.transaction = new TransactionService(repo);
    }
public void createUser(int id,String userName,double balance){
        onboarding.createAccount(id,userName,balance);
}
public void deposite(int id,double amount){
        transaction.Deposit(id,amount);
}
public double fetchBalance(int id){
       return transaction.chekBalance(id);
}

}
