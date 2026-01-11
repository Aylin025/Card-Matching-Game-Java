/**
 * The Main_Menu class represents the main menu screen of the game.
 * It includes buttons to play the game, access the shop, and exit the game.
 */

package Frames;
import Game.*;
import Buttons.MainMenu_Buttons.*;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Main_Menu {

    //Main Menu 
    private static ImageIcon menuScreen = new ImageIcon(new ImageIcon("Images/MainMenu.png").getImage().getScaledInstance(800,450, Image.SCALE_SMOOTH));
    private static JLabel mainMenu = new JLabel();
    Frame frame;

    //Initialize buttons (main_menu)
    Playgame_button play_button;
    Exit_Button button;
    Shop_button shopButton = new Shop_button();

    public Main_Menu(Frame frame2){
        //Game object
        this.frame = frame2;

        MemoryGameLabel game = frame.get_game(); //Get game from base from 
        play_button = new Playgame_button(frame, game);
        button = new Exit_Button(frame);// get buttons 
        
        mainMenu.setIcon(menuScreen);
        mainMenu.setBounds(0, 0, 800, 450);//Setup menuScreen
        mainMenu.setVisible(false);

        frame.add_layer(mainMenu, 1);

        frame.add_layer(button, 2);
        System.out.println("Menu Button 1 added");

        
        frame.add_layer(shopButton, 2);
        System.out.println("Menu Button 2 added");

        
        frame.add_layer(play_button, 2);
        System.out.println("Menu Button 3 added");

    }
  
    public void setVisible(boolean visible){
        mainMenu.setVisible(visible);
        button.setVisible(visible);
        shopButton.setVisible(visible);
        play_button.setVisible(visible);
        
    }


    
}