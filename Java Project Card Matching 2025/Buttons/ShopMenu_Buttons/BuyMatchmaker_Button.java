/**
 * The BuyMatchmaker_Button class represents a button in the shop menu
 * that allows the player to purchase a matchmaker feature. When clicked,
 * it hides the current shop and shows the matchmaker menu.
 */

package Buttons.ShopMenu_Buttons;

import javax.swing.JButton;

import Frames.Set_Visible;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BuyMatchmaker_Button extends JButton{
    
    public BuyMatchmaker_Button(){
        this.setBounds(322,281,125,50);
        this.setText("BUY MATCHMAKER");
        this.setFont(new Font("Arial", Font.BOLD, 8)); // Set font style and size
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
            

            //show matchmaker shop buttons
            Set_Visible.MatchMaker(true);
            




            
            }
        });
    }
}