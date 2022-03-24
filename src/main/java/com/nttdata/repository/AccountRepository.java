package com.nttdata.repository;

import com.nttdata.model.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1, "123456780", 1230));
        accounts.add(new Account(2, "123456781", 1231));
        accounts.add(new Account(3, "123456782", 1232));
        accounts.add(new Account(4, "123456783", 1233));
        accounts.add(new Account(5, "123456784", 1234));
        accounts.add(new Account(6, "123456785", 1235));
        accounts.add(new Account(7, "123456786", 1236));
        return accounts;
    }



}
