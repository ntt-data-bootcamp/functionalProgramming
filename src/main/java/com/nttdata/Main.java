package com.nttdata;

import com.nttdata.proxy.AccountApi;
import com.nttdata.repository.AccountRepository;
import com.nttdata.service.AccountService;

public class Main {
    public static void main(String[] args) {

        AccountService accountService = new AccountService(
                new AccountRepository(), new AccountApi());
        System.out.println("Hello Programming");

        // ---- FOR ---
        //accountService.getAccountsFor();
        //accountService.getAccountsForEach();
        //accountService.getAccountsForLambda();
        //accountService.getAccountsForMyLambda();
        //accountService.getAccountsStreams();
        //accountService.getAccountsStreamsMenor(3000);
        //accountService.getAccountsStreamsBetween(1000, 4000);
        //accountService.getAccountsStreamsMap2();
        //accountService.getAccountsStreamsMapAccount();
        accountService.getAccountsStreamsMapString();
    }
}
