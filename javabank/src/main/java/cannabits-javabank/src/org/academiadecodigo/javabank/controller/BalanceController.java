package org.academiadecodigo.javabank.controller;

import org.academiadecodigo.javabank.services.CustomerService;
import org.academiadecodigo.javabank.view.BalanceView;

/**
 * The {@link BalanceView} controller
 */
public class BalanceController extends AbstractController {

    private CustomerService customerService;

    /**
     * Sets the controller customerService
     *
     * @param customerService the customer service to be set
     */
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * Gets the balance for the accessing customer
     *
     * @return the balance
     */
    public double getCustomerBalance() {
        return customerService.getBalance(getAccessingCustomer().getId());
    }
}
