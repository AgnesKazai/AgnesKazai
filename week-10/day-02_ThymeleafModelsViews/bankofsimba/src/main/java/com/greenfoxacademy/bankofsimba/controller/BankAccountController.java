package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import com.greenfoxacademy.bankofsimba.services.BankAccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
public class BankAccountController {

    private BankAccountServices bankAccountServices;

    @Autowired
    public void setBankAccountServices(BankAccountServices bankAccountServices) {
        this.bankAccountServices = bankAccountServices;
    }

    @GetMapping("/multipleaccounts")
    public String selectAccount(Model model) {
        String str = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("html", str);
        model.addAttribute("accounts", bankAccountServices.getAccounts());
        model.addAttribute("selectedAccount", new BankAccount());

        return "bankofsimba";
    }

    @GetMapping("/newAccount")
    public String getNewAccount(Model model) {
        model.addAttribute("newAccount", new BankAccount());
        return "newAccount";
    }

    @PostMapping("/multipleaccounts")
    public String riseTheBalance(@ModelAttribute BankAccount selectedAccount) {
        for (BankAccount account : bankAccountServices.getAccounts()) {
            if (account.getName().equals(selectedAccount.getName())) {
                account.riseAccount();
            }
        }
        return "redirect:/multipleaccounts";
    }

    @PostMapping("/newAccount")
    public String addNewAccount(@ModelAttribute BankAccount newAccount) {
        ArrayList<BankAccount> list = bankAccountServices.getAccounts();
        list.add(newAccount);
        return "redirect:/multipleaccounts";
    }
}

