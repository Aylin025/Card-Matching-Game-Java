/**
 * The Shop class handles the in-game shop system, allowing players to purchase multipliers and makers that affect their bank balance and income. It provides functionality for loading saved data, updating prices, and checking if the player can afford purchases.
 */

package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.Timer;

import Files.file;
import Frames.Set_Visible;

public class Shop {

  //Instance variables
    private static double mult_label1_price = 100;

    private static double mult_label2_price = 175;

    private static double mult_label3_price = 225;

    private static double mult_label4_price = 300;

    private static double maker_label1_price = 100;

    private static double maker_label2_price = 200;

    private static double maker_label3_price = 500;

    private static double maker_label4_price = 1000;

  
    /*
     * Method to load saved data (from a file) into the game.
     * It sets the bank balance, multiplier, increment, and label prices from the saved data.
     */
    public static void loadSave(){
        String[] data = file.read_save();
        Bank.setBank(BigInteger.valueOf(Long.valueOf(data[0])));
        Bank.setMult(Double.valueOf(data[1]));
        Bank.setIncrement(Double.valueOf(data[2]));
        mult_label1_price = Double.valueOf(data[3]);
        mult_label2_price = Double.valueOf(data[4]);
        mult_label3_price = Double.valueOf(data[5]);
        mult_label4_price = Double.valueOf(data[6]);
        maker_label1_price = Double.valueOf(data[7]);
        maker_label2_price = Double.valueOf(data[8]);
        maker_label3_price = Double.valueOf(data[9]);
        maker_label4_price = Double.valueOf(data[10]);

        //reset all labels.
        Set_Visible.set_text_Maker_4(String.format("%.0f", maker_label4_price));
        Set_Visible.set_text_Maker_3(String.format("%.0f", maker_label3_price));
        Set_Visible.set_text_Maker_2(String.format("%.0f", maker_label2_price));
        Set_Visible.set_text_Maker_1(String.format("%.0f", maker_label1_price));
        Set_Visible.set_text_Mult_1(String.format("%.0f", mult_label1_price));
        Set_Visible.set_text_Mult_2(String.format("%.0f", mult_label2_price));
        Set_Visible.set_text_Mult_3(String.format("%.0f", mult_label3_price));
        Set_Visible.set_text_Mult_4(String.format("%.0f", mult_label4_price));
    }


  
    /*
     * Returns a string of all game-related data (bank balance, multiplier, increment, and label prices)
     * for debugging or display purposes.
     */
     public static String everything() {
        return Bank.getBank() + " " + Bank.getMult() + " " + Bank.getIncrement() + " " + mult_label1_price + " "
                + mult_label2_price + " " + mult_label3_price + " "
                + mult_label4_price + " " + maker_label1_price + " "
                + maker_label2_price + " " + maker_label3_price + " "
                + maker_label4_price;
    }

  /*
     * Updates the price labels in the shop based on the selected option.
     * Uses the find_price method to increase the price by 20%.
     */
    public static void update_label(int option) {
        switch (option) {
            case -4:
                maker_label4_price = find_price(maker_label4_price);
                Set_Visible.set_text_Maker_4(String.format("%.0f", maker_label4_price));
                break;
            case -3:
                maker_label3_price = find_price(maker_label3_price);
                Set_Visible.set_text_Maker_3(String.format("%.0f", maker_label3_price));
                break;
            case -2:
                maker_label2_price = find_price(maker_label2_price);
                Set_Visible.set_text_Maker_2(String.format("%.0f", maker_label2_price));
                break;
            case -1:
                maker_label1_price = find_price(maker_label1_price);
                Set_Visible.set_text_Maker_1(String.format("%.0f", maker_label1_price));
                break;
            case 1:
                mult_label1_price = find_price(mult_label1_price);
                Set_Visible.set_text_Mult_1(String.format("%.0f", mult_label1_price));
                System.out.println(mult_label1_price);
                break;
            case 2:
                mult_label2_price = find_price(mult_label2_price);
                Set_Visible.set_text_Mult_2(String.format("%.0f", mult_label2_price));
                break;
            case 3:
                mult_label3_price = find_price(mult_label3_price);
                Set_Visible.set_text_Mult_3(String.format("%.0f", mult_label3_price));
                break;
            case 4:
                mult_label4_price = find_price(mult_label4_price);
                Set_Visible.set_text_Mult_4(String.format("%.0f", mult_label4_price));
                break;

            default:
                System.err.println(
                        "incorrect use of Shop.Update_Mult_Label Method.Options between -4 and 4. not including 0");
                break;
        }

    }

    /*
     * Calculates the new price by increasing it by 20%.
     */
    public static double find_price(double value) {
        return Math.round(value * 1.2);
    }

  
    /*
     * Method to handle purchasing of matchmakers, increasing increment based on the maker bought.
     */
    public static void buyMaker(int option) {

        switch (option) {
            case 1:
                if (check_afford(maker_label1_price)) {
                    Bank.addToIncrement(1);
                    update_label(-option);
                    displayPopup("You have bought the $1/sec Matchmaker");
                }
                break;
            case 2:
                if (check_afford(maker_label2_price)) {
                    Bank.addToIncrement(2);
                    update_label(-option);
                    displayPopup("You have bought the $2/sec Matchmaker");
                }
                break;
            case 3:
                if (check_afford(maker_label3_price)) {
                    Bank.addToIncrement(5);
                    update_label(-option);
                    displayPopup("You have bought the $5/sec Matchmaker");
                }
                break;
            case 4:
                if (check_afford(maker_label4_price)) {
                    Bank.addToIncrement(10);
                    update_label(-option);
                    displayPopup("You have bought the $10/sec Matchmaker");
                }
                break;

            default:
                break;
        }
    }

   /*
     * Method to handle purchasing of multipliers, increasing the multiplier based on the selected option.
     */
    public static void buyMult(int option) {

        switch (option) {
            case 1:
                if (check_afford(mult_label1_price)) {
                    Bank.addToMult(1.5);
                    update_label(option);
                    displayPopup("You have bought the 1.5X Mult");
                }
                break;
            case 2:
                if (check_afford(mult_label2_price)) {
                    Bank.addToMult(2);
                    update_label(option);
                    displayPopup("You have bought the 2X Mult");
                }
                break;
            case 3:
                if (check_afford(mult_label3_price)) {
                    Bank.addToMult(2.25);
                    update_label(option);
                    displayPopup("You have bought the 2.25X Mult");
                }
                break;
            case 4:
                if (check_afford(mult_label4_price)) {
                    Bank.addToMult(3);
                    update_label(option);
                    displayPopup("You have bought the 3X Mult");
                }
                break;

            default:
                break;
        }
    }

    /*
     * Checks if the player has enough money to afford the purchase.
     */
    public static boolean check_afford(double cost) {
        System.out.println("checking if can afford");
        BigInteger bank = Bank.getBank();
        int option = (bank.compareTo(BigInteger.valueOf((long) cost)));
        switch (option) {
            case -1:
                displayPopup("You do not have enough money");
                return false;
            case 0:
            case 1:
                Bank.add_to_bank(-cost);
                return true;
        }
        return false;
    }

    /*
     * Displays a popup with a message for the player (e.g., when a purchase is made).
     * The popup disappears after 700ms.
     */
    public static void displayPopup(String text) {
        Set_Visible.set_popup_text(text);
        Set_Visible.show_popup(true);
        Timer timer = new Timer(700, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Set_Visible.show_popup(false);
            }
        });

        timer.start();
        timer.setRepeats(false);
    }

}
