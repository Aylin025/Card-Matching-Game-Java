/**
 * The BuyMultiplier_Button class represents the button to buy multipliers
 * in the shop menu. When clicked, it hides the current shop and shows the multiplier menu.
 */

package Buttons.ShopMenu_Buttons;

import javax.swing.JButton;

import Frames.Set_Visible;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyMultiplier_Button extends JButton{
    public BuyMultiplier_Button(){

        this.setBounds(322,219,125,50);
        this.setText("BUY MULTIPLIER");
        this.setFont(new Font("Arial", Font.BOLD, 10)); // Set font style and size

        this.setFocusable(false);
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.CENTER);
        this.setBackground(Color.decode("#60abb5"));
        this.setForeground(Color.WHITE); 
        this.setVisible(false);


         //When the button is pressed, this method is run. 
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

             //Hide shop buttons 
             Set_Visible.Shop(false);
             //Run_game.show_shop_buttons(false);

             //show matchmaker shop buttons
             //Run_game.show_Mult_menu(true);
            Set_Visible.Mult(true);



            }
        });
        
    }
}