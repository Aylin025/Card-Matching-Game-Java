/*
 * The Display_label class extends JLabel to create a custom label 
 * that is styled with a specific font, color, and visibility settings.
 */ 

package Labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Display_label extends JLabel{
    /**
     * Constructor to initialize the label with specific properties.
     */
    public Display_label(int boundsX , int boundsY, int dimensionX , int dimensiony){
        this.setText("0");
        this.setBounds(boundsX ,boundsY,dimensionX , dimensiony);
        this.setFont(new Font("Arial", Font.BOLD, 15));
        this.setFocusable(false);
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.EAST);
        this.setBackground(Color.decode("#3d397b"));
        this.setForeground(Color.WHITE); 
        this.setVisible(false);
    }

}