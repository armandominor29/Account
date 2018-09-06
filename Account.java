import java.util.Date;
import java.util.Calendar;

/*** Created by armandominor on 11/1/15.*/
//Creates Account class and sets parameters, methods, and variables that are rewuired to create an account

public class Account {
    int id;                     //initialize id value
    double balance;             //inititalize balnce value
    double annualInterestRate;  //initialize annualInterestRate value

    Calendar calendar = Calendar.getInstance(); //current date time value fro date created value
    Date dateCreated = calendar.getTime();

    /**
     * Construct an id, balance, and annualInterestRate with value 0
     */

    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    /**
     * Constructor that creates account
     */

    Account(int newId, double newBalance, double newAnnualInterestRate) {
        id = newId;
        balance = newBalance;
        annualInterestRate = newAnnualInterestRate;

    }

    /**
     * Gives value for id
     */
    int getId() {
        return id;
    }

    /**
     * Gives value for balance
     */
    double getBalance() {
        return balance;
    }

    /**
     * Gives value for annualInterestRate
     */
    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Gives value for dateCreated
     */
    Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets value for id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets value for balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Sets value for annualInterestRate
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * Gives value for MonthlyInterest
     */
    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    /**
     * withdraws money from the account
     */
    double withdrawal (double amount) {
        return balance = balance - amount;
    }

    /**
     * withdraws money from the account
     */
    double deposit (double amount) {
        return balance = balance + amount;
    }
}
