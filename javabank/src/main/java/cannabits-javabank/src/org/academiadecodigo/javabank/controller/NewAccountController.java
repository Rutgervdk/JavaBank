package org.academiadecodigo.javabank.controller;

import org.academiadecodigo.javabank.factories.AccountFactory;
import org.academiadecodigo.javabank.model.account.Account;
import org.academiadecodigo.javabank.model.account.AccountType;
import org.academiadecodigo.javabank.services.AccountService;
import org.academiadecodigo.javabank.view.NewAccountView;

/**
 * The {@link NewAccountView} controller
 */
public class NewAccountController extends AbstractController {

    private AccountService accountService;
    private AccountFactory accountFactory;

    /**
     * Creates an account with a given type
     *
     * @param accountType the type of account to be created
     * @return the id of the new account
     */
    public int createAccount(AccountType accountType) {

        Account newAccount = accountFactory.createAccount(accountType);
        authService.getAccessingCustomer().addAccount(newAccount);
        accountService.add(newAccount);

        return newAccount.getId();
    }

    /**
     * Sets the controller accountFactory
     *
     * @param accountFactory the factory to be set
     */
    public void setAccountFactory(AccountFactory accountFactory) {
        this.accountFactory = accountFactory;
    }

    /**
     * Sets the controller accountService
     *
     * @param accountService the account service to be set
     */
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
}
