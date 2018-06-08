package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class BankAccountServices {

    private ArrayList<BankAccount> accounts;

    @PostConstruct
    public void initAccount() {
        accounts = new ArrayList<BankAccount>(Arrays.asList(new BankAccount("Simba", 2000, "lion", true, true),
                new BankAccount("Rafiki", 3200, "monkey", false, true),
                new BankAccount("Zazu", 1950, "bird", false, true),
                new BankAccount("Pumbaa", 3200, "pig", false, false),
                new BankAccount("Timon", 1400, "meerkat", false, false)));
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }
}
