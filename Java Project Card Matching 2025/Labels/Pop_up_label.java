/**
 * The Pop_up_label class extends JLabel to create a custom label 
 * that is styled with specific font, color, and alignment for pop-up display.
 */

package Labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Pop_up_label extends JLabel{

     /**
     * Constructor to initialize the pop-up label with predefined properties.
     * Sets the text, position, font, color, and visibility of the label.
     */
    public Pop_up_label(){
        this.setText("1234");
        this.setBounds(150,163,500,125);
        this.setFont(new Font("Arial", Font.BOLD, 25));
        this.setFocusable(false);
        this.setHorizontalAlignment(SwingConstants.CENTER); // Center horizontally
        this.setVerticalAlignment(SwingConstants.CENTER);   // Center vertically
        this.setBackground(Color.decode("#60abb5"));//60abb5
        this.setForeground(Color.WHITE); 
        this.setVisible(false);
    }   
}