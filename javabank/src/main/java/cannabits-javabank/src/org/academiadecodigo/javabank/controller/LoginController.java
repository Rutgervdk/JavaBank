package org.academiadecodigo.javabank.controller;

import org.academiadecodigo.javabank.services.CustomerService;
import org.academiadecodigo.javabank.view.LoginView;

import java.util.Set;

/**
 * The {@link LoginView} controller
 */
public class LoginController extends AbstractController {

    private Controller nextController;
    private CustomerService customerService;
    private boolean authFailed = false;

    /**
     * Sets the next controller
     *
     * @param nextController the next controller to be set
     */
    public void setNextController(Controller nextController) {
        this.nextController = nextController;
    }

    /**
     * Identifies the logged in customer
     *
     * @param id the customer id
     */
    public void onLogin(int id) {
        if (authService.authenticate(id)) {
            nextController.init();
            return;
        }

        authFailed = true;
        init();
    }

    /**
     * Checks if authentication failed
     *
     * @return {@code true} if authentication fails
     */
    public boolean isAuthFailed() {
        return authFailed;
    }

    /**
     * Gets a set with all the existing customer ids
     *
     * @return the set with the ids
     */
    public Set<Integer> getCustomerIds() {
        return customerService.getCustomerIds();
    }

    /**
     * Sets the controller customerService
     *
     * @param customerService the customer service to be set
     */
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
}
