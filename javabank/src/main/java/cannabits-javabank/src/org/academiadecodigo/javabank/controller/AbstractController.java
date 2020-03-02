package org.academiadecodigo.javabank.controller;

import org.academiadecodigo.javabank.model.Customer;
import org.academiadecodigo.javabank.services.AuthService;
import org.academiadecodigo.javabank.view.View;

/**
 * A generic controller to be used as a base for concrete controller implementations
 *
 * @see Controller
 */
public abstract class AbstractController implements Controller {

    protected View view;
    protected AuthService authService;

    /**
     * Sets the controller view
     *
     * @param view the view to be set
     */
    public void setView(View view) {
        this.view = view;
    }


    /**
     * Sets the controller authService
     *
     * @param authService the authService to be set
     */
    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }

    /**
     * @see Controller#init()
     */
    @Override
    public void init() {
        view.show();
    }

    /**
     * Gets the customer currently logged in
     *
     * @return the accessingCustomer
     */
    public Customer getAccessingCustomer() {
        return authService.getAccessingCustomer();
    }
}
