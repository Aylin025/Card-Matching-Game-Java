/**
 * The Exit_Button class represents the "Exit" button on the main menu.
 * When clicked, it saves the game data and closes the application.
 */

package Buttons.MainMenu_Buttons;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import Files.file;
import Game.Frame;

public class Exit_Button extends JButton{


    /**
     * Constructor for the Exit_Button.
     * Initializes the button with a specified font, color, and action.
     */
    public Exit_Button(Frame frame){

        //ImageIcon icon = new ImageIcon("/home/bonovo/Documents/VS/SchoolWork/CPT_/chair.jpg"); //create image icon 

        this.setBounds(322,344,125,50);
        this.setText("EXIT");
        this.setFont(new Font("Arial", Font.BOLD, 15)); // Set font style and size


        this.setFocusable(false);
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.CENTER);
        this.setBackground(Color.decode("#ed6280"));
        this.setForeground(Color.WHITE); 


        this.setVisible(false);


        // This bricks the passed JFrame 
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                file.save();
                frame.dispose(); // Close the main frame
                System.exit(0); //nuke code
            }
        });
    }

}
