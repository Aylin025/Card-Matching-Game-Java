/**
 * The Buy_Maker_one class extends JButton and represents a "BUY" button for purchasing the first maker.
 * This button triggers the logic to purchase a maker when clicked.
 */

package Buttons.ShopMenu_Buttons.Maker_buttons;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import Game.Shop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buy_Maker_one extends JButton{
    public Buy_Maker_one(){

        this.setBounds(259,175,94,31);
        this.setText("BUY");
        this.setFont(new Font("Agrandir", Font.BOLD, 18)); // Set font style and size
        this.setFocusable(false);
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.CENTER);
        this.setBackground(Color.decode("#ffffff"));
        this.setForeground(Color.BLACK); 
        this.setVisible(false);


        //When the button is pressed, this method is run. 
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Shop.buyMaker(1);
               


            
            }
        });
    }
}