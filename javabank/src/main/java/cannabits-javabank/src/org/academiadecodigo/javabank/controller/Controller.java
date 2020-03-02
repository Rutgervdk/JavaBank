package org.academiadecodigo.javabank.controller;

import org.academiadecodigo.javabank.model.Customer;

/**
 * Common interface for controllers, provides a method for a controller to be initialized
 */
public interface Controller {

    /**
     * Initializes the controller
     */
    void init();

    /**
     * Getter for Customer currently logged in
     *
     * @return the customer
     */
    Customer getAccessingCustomer();
}
