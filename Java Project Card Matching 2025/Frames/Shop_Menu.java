/**
 * The Shop_Menu class represents the shop screen in the game.
 * It creates the shop menu with buttons and background image.
 */

package Frames;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Buttons.ShopMenu_Buttons.Back_Button;
import Buttons.ShopMenu_Buttons.BuyMatchmaker_Button;
import Buttons.ShopMenu_Buttons.BuyMultiplier_Button;
import Game.*;

    /**
     * Constructor for the Shop_Menu class. Initializes the shop menu layout,
     * buttons, and adds them to the given frame.
     */
public class Shop_Menu {
    //Shop menu
    private static ImageIcon shopScreen = new ImageIcon(new ImageIcon("Images/Shop.png").getImage().getScaledInstance(800,450, Image.SCALE_SMOOTH));
    private static JLabel shopMenu = new JLabel();

    //Initialize buttons ( shop )
    static Back_Button backButton = new Back_Button();
    static BuyMatchmaker_Button matchmaker_Button = new BuyMatchmaker_Button();
    static BuyMultiplier_Button multiplier_Button = new BuyMultiplier_Button();
    Frame frame;

    public Shop_Menu(Frame frame ){
        this.frame = frame;

        //Creating the Shop menu to be seen 
        shopMenu.setIcon(shopScreen);
        shopMenu.setBounds(0, 0, 800, 450);
        shopMenu.setVisible(false);
       // frame.add(shopMenu);
        frame.add_layer(shopMenu,1);

        //frame.add(backButton);
        frame.add_layer(backButton, 2);
        System.out.println("Shop Button 1 added");

       // frame.add(matchmaker_Button);
        frame.add_layer(matchmaker_Button, 2);
        System.out.println("Shop Button 2 added");
        
        //frame.add(multiplier_Button);
        frame.add_layer(multiplier_Button, 2);
        System.out.println("Shop Button 3 added");
    }

    public void Set_Visible(boolean show){
        shopMenu.setVisible(show);
        backButton.setVisible(show);
        matchmaker_Button.setVisible(show);
        multiplier_Button.setVisible(show);
    }


}