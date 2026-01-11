/**
 * The Back_Button class represents a button in the shop menu
 * that allows the player to go back to the main menu.
 */

package Buttons.ShopMenu_Buttons;

import javax.swing.JButton;


import Frames.Set_Visible;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Back_Button extends JButton{
    
  /**
     * Constructor to initialize the Back_Button with specific properties.
     */
    public Back_Button(){

        this.setBounds(322,344,125,50);
        this.setText("BACK");
        this.setFont(new Font("Arial", Font.BOLD, 15)); // Set font style and size
        this.setBackground(Color.decode("#ed6280"));
        this.setForeground(Color.WHITE); 
        this.setVisible(false);

        

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Set_Visible.Shop(false);
                Set_Visible.Menu(true);
                
            }
        });


    }

}