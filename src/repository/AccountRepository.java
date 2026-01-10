package repository;


import model.BankAccount;

import java.util.*;

public class AccountRepository {

    private List <BankAccount> accounts=new ArrayList<>();

    public void save(BankAccount account) {
        accounts.add(account);
    }
    public BankAccount findById(int id) {
        for (BankAccount account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }
}
