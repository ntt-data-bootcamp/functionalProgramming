package com.nttdata.service;

import com.nttdata.model.Account;
import com.nttdata.proxy.AccountApi;
import com.nttdata.repository.AccountRepository;
import lombok.AllArgsConstructor;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    private final AccountApi accountApi;

    public void getAccountsFor() {
        List<Account> accounts = accountRepository.getAccounts();
        for(Account account : accounts) {
            System.out.println(account);
        }
    }
    public void getAccountsForEach() {
        List<Account> accounts = accountRepository.getAccounts();
        accounts.forEach(item -> System.out.println(item));
    }
    public void getAccountsForLambda() {
        List<Account> accounts = accountRepository.getAccounts();
        accounts.forEach(System.out::println);
    }
    public void getAccountsForMyLambda() {
        List<Account> accounts = accountRepository.getAccounts();
        accounts.forEach(PrintService::print);
    }

    public void getAccountsStreams() {
        accountApi.getAccounts()
                .collect(Collectors.toList())
                .forEach(PrintService::print);
    }

    public void getAccountsStreamsMenor(Integer value) {
        accountApi.getAccounts()
                .filter(account -> account.getAmount() < value)
                .collect(Collectors.toList())
                .forEach(PrintService::print);
    }
    public void getAccountsStreamsBetween(Integer value1, Integer value2) {
        accountApi.getAccounts()
                .filter(account -> account.getAmount() > value1)
                .filter(account -> account.getAmount() < value2)
                .collect(Collectors.toList())
                .forEach(PrintService::print);

    }
    public void getAccountsStreamsMap() {
        accountApi.getAccounts()
                .map(account -> account.getNumberAccount())
                .collect(Collectors.toList())
                .forEach(PrintService::print);
    }
    public void getAccountsStreamsMap2() {
        accountApi.getAccounts()
                .map(Account::getAmount)
                .collect(Collectors.toList())
                .forEach(PrintService::print);
    }
    public void getAccountsStreamsMapAccount() {
        accountApi.getAccounts()
                .map(account -> {
                    account.setAmount(15000);
                    account.setNumberAccount("987654321");
                    return account;
                })
                .collect(Collectors.toList())
                .forEach(PrintService::print);
    }
    public void getAccountsStreamsMapString() {
        Optional<Integer> maximus = accountApi.getAccounts()
                .map(Account::getNumberAccount)
                .map(String::length)
                .reduce(Integer::sum);

        System.out.println(maximus.get());
    }

}
