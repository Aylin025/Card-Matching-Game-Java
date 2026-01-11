
/**
 * The Mult_Menu class represents the Multiplier Shop menu.
 * It contains the multiplier buttons, labels, and the background image.
 */

package Frames;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Buttons.ShopMenu_Buttons.Multiplier_buttons.*;
import Game.Frame;
import Labels.Shop_labels;

public class Mult_Menu {

    //Buy Multipliers menu
    private static ImageIcon multIcon = new ImageIcon(new ImageIcon("Images/MultiplierScreen.png").getImage().getScaledInstance(800,450, Image.SCALE_SMOOTH));
    private static JLabel multLabel = new JLabel();

    //Initalize Buttons (Mult_shop)
    static Buy_Mult_One buy_mult1 = new Buy_Mult_One();
    static Buy_Mult_Two buy_mult2 = new Buy_Mult_Two();
    static Buy_Multi_Three buy_mult3 = new Buy_Multi_Three();
    static Buy_Mult_Four buy_mult4 = new Buy_Mult_Four();
    static Back_Button_2 backButton2 = new Back_Button_2();
    //initialize new labels()
    static Shop_labels label_one = new Shop_labels(119, 175, 141, 31);
    static Shop_labels label_two = new Shop_labels(437, 175, 141, 31);
    static Shop_labels label_three = new Shop_labels(119, 312, 141, 31);
    static Shop_labels label_four = new Shop_labels(437, 312, 141, 31);
    Frame frame;


    public Mult_Menu(Frame frame){
        this.frame = frame;

        //Creating and adding the Mult shop label 
        multLabel.setIcon(multIcon);
        multLabel.setBounds(0,0,800,450);
        multLabel.setVisible(false);
        //frame.add(multLabel);
        frame.add_layer(multLabel,1);

        
        //frame.add(buy_mult1);
        frame.add_layer(buy_mult1, 2);
        System.out.println("Mult Shop Button 1 added");
        
        //frame.add(buy_mult2);
        frame.add_layer(buy_mult2, 2);
        System.out.println("Mult Shop Button 2 added");

        //frame.add(buy_mult3);
        frame.add_layer(buy_mult3, 2);
        System.out.println("Mult Shop Button 3 added");

        //frame.add(buy_mult4);
        frame.add_layer(buy_mult4, 2);
        System.out.println("Mult Shop Button 4 added");

        //frame.add(backButton2);
        frame.add_layer(backButton2, 2);
        System.out.println("Mult Shop Button 5 added");

        //frame.add(label_one);
        frame.add_layer(label_one, 2);
        label_one.setText("Cost:100");
        System.out.println("Mult Shop Label 1 added");

       // frame.add(label_two);
        frame.add_layer(label_two, 2);
        label_two.setText("Cost:175");
        System.out.println("Mult Shop Label 2 added");

       // frame.add(label_three);
        frame.add_layer(label_three, 2);
        label_three.setText("Cost:225");
        System.out.println("Mult Shop Label 3 added");

        //frame.add(label_four);
        label_four.setText("Cost:300");
        frame.add_layer(label_four, 2);
        System.out.println("Mult Shop Label 4 added");
       

    }

    public void show_Mult_menu(boolean show){
        multLabel.setVisible(show);
        buy_mult1.setVisible(show);
        buy_mult2.setVisible(show);
        buy_mult3.setVisible(show);
        buy_mult4.setVisible(show);
        label_one.setVisible(show);
        label_two.setVisible(show);
        label_three.setVisible(show);
        label_four.setVisible(show);

        backButton2.setVisible(show);
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