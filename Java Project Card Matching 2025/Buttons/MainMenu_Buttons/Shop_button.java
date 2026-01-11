/**
 * The Shop_button class represents the "Shop" button on the main menu.
 * When clicked, it hides the current menu and displays the shop menu.
 */

package Buttons.MainMenu_Buttons;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import Frames.Set_Visible;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shop_button extends JButton {

   /**
     * Constructor for Shop_button.
     * Initializes the button with specific font, size, color, and action listener.
     */
    public Shop_button() {
        this.setBounds(322, 281, 125, 50);
        this.setText("SHOP");
        this.setFont(new Font("Arial", Font.BOLD, 15)); // Set font style and size

        this.setFocusable(false);
        // this.setIcon(icon);
        this.setHorizontalAlignment(SwingConstants.CENTER); // Center horizontally
        this.setVerticalAlignment(SwingConstants.CENTER);   // Center vertically
        this.setBackground(Color.decode("#60abb5"));
        this.setForeground(Color.WHITE);
        this.setVisible(false);

        // When the button is pressed, this method is run.
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hide the menu and buttons
                //Run_game.show_menu(false);
                Set_Visible.Menu(false);
                
                //Run_game.show_shopMenu(true);
                Set_Visible.Shop(true);
            }
        });
    }

}