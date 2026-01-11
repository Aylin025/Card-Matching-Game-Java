/**
 * The Maker_Menu class represents the Maker Shop menu.
- code documentation needs work. some methods don't have comment blocks and class blocks are missing dates and names.  * It contains the buttons, labels, and background image for the Maker Shop screen.
 */

package Frames;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Buttons.ShopMenu_Buttons.Maker_buttons.Back_Button_3;
import Buttons.ShopMenu_Buttons.Maker_buttons.Buy_Maker_Four;
import Buttons.ShopMenu_Buttons.Maker_buttons.Buy_Maker_one;
import Buttons.ShopMenu_Buttons.Maker_buttons.Buy_Maker_Three;
import Buttons.ShopMenu_Buttons.Maker_buttons.Buy_Maker_Two;
import Game.*;
import Labels.Shop_labels;

public class Maker_Menu {
    //Match Maker menu
    private static ImageIcon shopScreen = new ImageIcon(new ImageIcon("Images/MatchmakerScreen.png").getImage().getScaledInstance(800,450, Image.SCALE_SMOOTH));
    private static JLabel shopMenu = new JLabel();

    //Create Buttons
    static Back_Button_3 backButton = new Back_Button_3();
    static Buy_Maker_one buy_maker1 = new Buy_Maker_one();
    static Buy_Maker_Two buy_maker2 = new Buy_Maker_Two();
    static Buy_Maker_Three buy_maker3 = new Buy_Maker_Three();
    static Buy_Maker_Four buy_maker4 = new Buy_Maker_Four();

    //Create Labels 
    static Shop_labels label_one = new Shop_labels(119, 175, 141, 31);
    static Shop_labels label_two = new Shop_labels(437, 175, 141, 31);
    static Shop_labels label_three = new Shop_labels(119, 312, 141, 31);
    static Shop_labels label_four = new Shop_labels(437, 312, 141, 31);
    
    Frame frame;

    public Maker_Menu(Frame frame){
       
      
        this.frame = frame;
        //Adding Maker menu to frame
        shopMenu.setIcon(shopScreen);
        shopMenu.setBounds(0,0,800,450);
        shopMenu.setVisible(false);
        frame.add_layer(shopMenu, 1);

        frame.add_layer(backButton, 2);
        System.out.println("Maker Shop Button 1 loaded");

        frame.add_layer(buy_maker1, 2);
        System.out.println("Maker Shop Button 2 loaded");

        frame.add_layer(buy_maker2, 2);
        System.out.println("Maker Shop Button 3 loaded");

        frame.add_layer(buy_maker3, 2);
        System.out.println("Maker Shop Button 4 loaded");

        frame.add_layer(buy_maker4, 2);
        System.out.println("Maker Shop Button 5 loaded");

        frame.add_layer(label_one, 2);
        label_one.setText("Cost:100");
        System.out.println("Maker Shop label 1 loaded");

        frame.add_layer(label_two, 2);
        label_two.setText("Cost:200");
        System.out.println("Maker Shop label 2 loaded");

        frame.add_layer(label_three, 2);
        label_three.setText("Cost:500");
        System.out.println("Maker Shop label 3 loaded");

        frame.add_layer(label_four, 2);
        label_four.setText("Cost:1000");
        System.out.println("Maker Shop label 4 loaded");

    }

    public void Set_Visible(boolean show){
       shopMenu.setVisible(show);
       buy_maker1.setVisible(show);
       buy_maker2.setVisible(show);
       buy_maker3.setVisible(show);
       buy_maker4.setVisible(show);
       label_one.setVisible(show);
       label_two.setVisible(show);
       label_three.setVisible(show);
       label_four.setVisible(show);
       backButton.setVisible(show);
    }    

    public void set_text_label_1(String text){
        label_one.setText("Cost:" + text);
    }
    public void set_text_label_2(String text){
        label_two.setText("Cost:" + text);
    }
    public void set_text_label_3(String text){
        label_three.setText("Cost:" + text);
    }
    public void set_text_label_4(String text){
        label_four.setText("Cost:" + text);
    }
}