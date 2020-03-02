package org.academiadecodigo.javabank.view;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.controller.NewAccountController;
import org.academiadecodigo.javabank.model.account.AccountType;

/**
 * A view shown at new account creation
 *
 * @see NewAccountController
 */
public class NewAccountView extends AbstractView {

    private NewAccountController newAccountController;

    /**
     * Sets the controller responsible for rendering the view
     *
     * @param newAccountController the controller to set
     */
    public void setNewAccountController(NewAccountController newAccountController) {
        this.newAccountController = newAccountController;
    }

    /**
     * @see View#show()
     */
    @Override
    public void show() {
        MenuInputScanner accountTypeMenu = new MenuInputScanner(AccountType.getTypes());
        accountTypeMenu.setMessage(Messages.NEW_ACCOUNT_TYPE);
        accountTypeMenu.setError(Messages.VIEW_MAIN_ERROR);
        int id = prompt.getUserInput(accountTypeMenu);
        AccountType accountType = AccountType.getType(id);

        System.out.println("\n" + Messages.VIEW_NEW_ACCOUNT_MESSAGE + newAccountController.createAccount(accountType));
    }
}
