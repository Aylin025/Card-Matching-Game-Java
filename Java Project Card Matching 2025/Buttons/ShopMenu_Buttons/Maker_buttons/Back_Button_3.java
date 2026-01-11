/**
 * The Back_Button_3 class extends JButton and represents a "BACK" button in the matchmaker menu.
 * This button allows the user to navigate back to the Shop menu when clicked.
 */

package Buttons.ShopMenu_Buttons.Maker_buttons;

import javax.swing.JButton;

import Frames.Set_Visible;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Back_Button_3 extends JButton {

    public Back_Button_3(){

        this.setBounds(353,375,94,31);
        this.setText("BACK");
        this.setFont(new Font("Arial", Font.BOLD, 18)); // Set font style and size
        this.setBackground(Color.decode("#ed6280"));
        this.setForeground(Color.WHITE); 
        this.setVisible(false);

        

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //hide mult menu 
                Set_Visible.MatchMaker(false);
                //Run_game.show_Mult_menu(false);

                //Show Shop Menu
                Set_Visible.Shop(true);
                //Run_game.show_shopMenu(true);
            }
        });

    }
}