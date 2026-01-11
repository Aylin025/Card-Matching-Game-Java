/**
 * The Playgame_button class represents the "Play" button on the main menu.
 * When clicked, it starts the game.
 */
package Buttons.MainMenu_Buttons;

import javax.swing.JButton;

import Game.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Playgame_button extends JButton{
    /**
     * Constructor for Playgame_button.
     * Initializes the button with specific font, size, color, and action listener.
     */
    public Playgame_button(Frame frame, MemoryGameLabel game){
        super("Dating Tycoon");
        this.setBounds(322,219,125,50);
        this.setText("PLAY");
        this.setFont(new Font("Arial", Font.BOLD, 15)); // Set font style and size


        this.setFocusable(false);
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.CENTER);
        this.setBackground(Color.decode("#82b843"));
        this.setForeground(Color.WHITE); 
        this.setVisible(false);


        //When the button is pressed, this method is run. 
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                //Hide main menu 
                //Run_game.show_menu(false);
                game.start_game();
                
                System.out.println("\npressed play button");
            }
        });
    }


}
