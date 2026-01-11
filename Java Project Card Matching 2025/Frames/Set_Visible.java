/**
 * The Set_Visible class is responsible for managing the visibility and text of various UI components.
 * It controls the display of different menus (Main Menu, Shop, Multiplier Menu, Maker Menu) and their associated elements.
 */
package Frames;

import javax.swing.JLabel;

import Game.Frame;
import Labels.Display_label;
import Labels.Pop_up_label;

public class Set_Visible {

  // Static instances of the frame and menus
    static Frame frame;
    static Main_Menu menu; 
    static Shop_Menu shop;
    static Mult_Menu mult;
    static Maker_Menu maker;
    static Display_label money_display = new Display_label(675,0,156,63);
    static Display_label mult_diplay = new Display_label(675,31,156,63);
    static Display_label income_display = new Display_label(675, 63, 167, 63);
    static JLabel popup = new Pop_up_label();


    /**
     * Initializes the frame and menus, adding necessary layers to the frame.
     * Sets initial values for display labels.
     */
    public static void initalize(Frame display){
        frame = display;
        menu = new Main_Menu(frame);
        shop = new Shop_Menu(frame);
        mult = new Mult_Menu(frame);
        maker = new Maker_Menu(frame);

        frame.add_layer(money_display, 3);
        mult_diplay.setText("$0");
        frame.add_layer(popup,3);

        frame.add_layer(mult_diplay, 3);
        mult_diplay.setText("Mult: X1");

        frame.add_layer(income_display, 3);
        income_display.setText("0$/s");

        
    }

  /** 
  * Set and get (and visibility) functions for Labels
  */
    public static void show_popup(boolean show){
        popup.setVisible(show);
    }

    public static void set_popup_text(String text){
        popup.setText(text);
    }

    public static void set_text_money(String text){
        money_display.setText(text);
    }

    public static void set_mult_display_text(String text){
        mult_diplay.setText(text);
    }

    public static void set_income_text(String text){
        income_display.setText(text);
    }

    public static void Mult(boolean visible){
        mult.show_Mult_menu(visible);
    }
    
    public static void Shop(boolean visible){
        shop.Set_Visible(visible);
    }

    public static void MatchMaker(boolean visible){
        maker.Set_Visible(visible);
    }

    public static void Menu(boolean visible){
        menu.setVisible(visible);
        money_display.setVisible(true);
        mult_diplay.setVisible(true);
        income_display.setVisible(true);
    }


    public static void set_text_Mult_1(String text){
        mult.set_text_label_1(text);
    }

    public static void set_text_Mult_2(String text){
        mult.set_text_label_2(text);
    }

    public static void set_text_Mult_3(String text){
        mult.set_text_label_3(text);
    }
    public static void set_text_Mult_4(String text){
        mult.set_text_label_4(text);
    }


    public static void set_text_Maker_1(String text){
        maker.set_text_label_1(text);
    }

    public static void set_text_Maker_2(String text){
        maker.set_text_label_2(text);
    }

    public static void set_text_Maker_3(String text){
        maker.set_text_label_3(text);
    }

    public static void set_text_Maker_4(String text){
        maker.set_text_label_4(text);
    }


}