/**
 * The Run_game class serves as the main controller for the game's flow.  It handles game initialization, running the game, managing the game state, and showing the score to the player.
 */

package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import Frames.Set_Visible;


public class Run_game {

    public static int gamestate = 0;

    //Initialize frame 
    static Frame frame = new Frame();

    //Game object
    static MemoryGameLabel game = frame.get_game();


    /**
     * The start method initializes the game by setting up the initial game state, 
     * loading saved data, and starting the money incrementing thread.
     */
    public static void start(){
       //Goal 
        System.out.println("GAME GOAL");
        System.out.println("To win the dating matching game, match the couples with the same outfits together! You will be rewarded money. Buy from shop for game money multipliers and passive  money from matchmakers.\n\n");

      
         System.out.println("initizalizing Buttons:");
      
        Set_Visible.initalize(frame);
        Shop.loadSave();//load save file 
       

       


        System.out.println("running Money incrementing Thread ");// Running another thread for a money counter
        MultiThread_money object = new MultiThread_money(); 
        object.run(frame);

       


    }

    /*
    * Show score method 
    * Shows the score for 2 seocnds, then returns to the main menu.
    */

    public static void  show_score(){
        
        frame.show_score(true);

        Timer timer = new Timer(2000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.show_score(false);
                Set_Visible.Menu(true);
                //menu.setVisible(true);
                //Run_game.show_menu(true);
            }
        });
        timer.start();
        timer.setRepeats(false);
        
    }

  
}

