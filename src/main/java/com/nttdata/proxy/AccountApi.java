package com.nttdata.proxy;

import com.nttdata.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AccountApi {

    public Stream<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1, "23456780", 230));
        accounts.add(new Account(2, "3456781", 1231));
        accounts.add(new Account(3, "456782", 2232));
        accounts.add(new Account(4, "56783", 3233));
        accounts.add(new Account(5, "6784", 4234));
        accounts.add(new Account(6, "785", 5235));
        accounts.add(new Account(7, "86", 6236));
        return accounts.stream();
    }
}
