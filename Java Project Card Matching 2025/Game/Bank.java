
/**
 * The Bank class represents the financial system within the game, keeping track of the player's bank balance, multipliers, and increments that affect the player's progress. 
 */

package Game;

import java.math.BigInteger;

public class Bank {
    
    // The bank's balance, initialized with 1000 units (using BigInteger for large values)
    private static BigInteger bank = new BigInteger("0"); 

    // Multiplier for scoring or income effects
    private static double mult = 1;

    // Increment that could be used to track a specific change over time
    private static double increment = 0;

    /*
     * Getter for the multiplier (used in various calculations like score or income)
     */
    public static double getMult(){
        return mult;
    }

    /*
     * Setter for the multiplier
     */
    public static void setMult(double amount){
        mult = amount;
    }

    /*
     * Add a value to the current multiplier
     */
    public static void addToMult(double amount){
        mult += amount;
    }

    /*
     * Getter for the increment value (tracks changes in a specific aspect, such as progress)
     */
    public static double getIncrement(){
        return increment;
    }

    /*
     * Setter for the increment value
     */
    public static void setIncrement(double amount){
        increment = amount;
    }

    /*
     * Add a value to the current increment
     */
    public static void addToIncrement(double amount){
        increment += amount;
    }

    /*
     * Getter for the current bank balance
     */
    public static BigInteger getBank() {
        return bank;
    }

    /*
     * Setter for the bank balance (to set the balance to a specific value)
     */
    public static void setBank(BigInteger amount) {
        bank = amount;
    }

    /*
     * Adds a value to the bank balance (the value is first converted to a long to match the bank type)
     */
    public static void add_to_bank(double value){
        bank = bank.add(BigInteger.valueOf((long) value));  // Adds value to bank
    }

    /*
     * Calculates the score based on the number of tries and solved matches, considering the multiplier
     */
    public static int getScore(int tries, int solved_matches){ 
        return (int) ((50 - (tries - solved_matches) * 2) * mult);  // Basic score calculation
    }

    /*
     * Checks if the bank has enough money to cover a specified value
     * @param value the amount to check
     * @return true if the bank balance is greater than or equal to the value, false otherwise
     */
    public static boolean enough_money(long value){
        int option = bank.compareTo(BigInteger.valueOf(value));  // Compare bank balance with the value
        switch (option) {
            case -1:  // Bank balance is less than the value
                return false;
            case 0:  // Bank balance is equal to the value
                return true;
            case 1:  // Bank balance is greater than the value
                return true;
        }
        return false; // This line should be unreachable due to the switch statement handling all cases
    }
}
