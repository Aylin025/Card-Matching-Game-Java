/**
 * The MultiThread_money class is a custom thread that handles periodic updates for the player's bank balance and other related game elements. The thread will run continuously (until stopped) and increment the player's bank balance based on the value of the 'increment' property in the Bank class.
 */

package Game;

import Frames.Set_Visible;

public class MultiThread_money extends Thread {

    static boolean code_run = true;
    public void run(Frame frame)
    {
        try {
            
            //This may be a waste of resources when increment = 0 
            while (code_run == true) {

                Bank.add_to_bank(Bank.getIncrement());

                Thread.sleep(1000); //Adds increment every 1 second 

                Set_Visible.set_income_text(String.format("%.0f %s", Bank.getIncrement() , "$/s"));

                Set_Visible.set_mult_display_text("Mult: X" + Bank.getMult());//Updates mult every 1 second 

                Set_Visible.set_text_money("$" +Bank.getBank()); //Updates frame with new amount 
                
            }
            



        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}