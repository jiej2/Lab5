import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * checkins
         */
        CHECKINGS,
        /**
         * savings
         */
        SAVINGS,
        /**
         * students
         */
        STUDENT,
        /**
         * workplace
         */
        WORKPLACE
    }

    /**
     * accountnumber
     */
    private int accountNumber;
    /**
     * accounttype
     */
    private BankAccountType accountType;
    /**
     * accountbalance
     */
    private double accountBalance;
    /**
     * ownername
     */
    private String ownerName;
    /**
     * interestrate
     */
    private double interestRate;
    /**
     * interestearned
     */
    private double interestEarned;

    /**
     *
     * @param name  
     * @param accountCategory
     */

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
