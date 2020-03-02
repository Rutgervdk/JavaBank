package org.academiadecodigo.javabank.model.account;

/**
 * The possible {@link Account} types
 */
public enum AccountType {

    /**
     * @see CheckingAccount
     */
    CHECKING(1),

    /**
     * @see SavingsAccount
     */
    SAVINGS(2);

    private int option;

    /**
     * Constructor for AccountType
     *
     * @param option the option to be shown in the menu
     */
    AccountType(int option) {
        this.option = option;
    }

    /**
     * Gets a String[] with all the names of the enum
     *
     * @return that array
     */
    public static String[] getTypes() {
        String[] types = new String[values().length];
        for (int i = 0; i < values().length; i++) {
            types[i] = values()[i].name();
        }

        return types;
    }

    /**
     * Get an account type given an option
     *
     * @param option of the type we want
     * @return that account type
     */
    public static AccountType getType(int option) {
        for (AccountType type : values()) {
            if (type.option == option) {
                return type;
            }
        }

        throw new EnumConstantNotPresentException(AccountType.class, option + " is not an option present in enum");
    }
}
