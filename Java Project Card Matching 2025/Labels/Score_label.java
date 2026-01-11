/**
 * The Score_label class extends JLabel to create a custom label 
 * that displays a score with specific font, color, and alignment.
 * The label is initially set with placeholder text and is positioned 
 * and styled for clear visibility.
 */
package Labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Score_label extends JLabel {

  /**
     * Constructor to initialize the score label with predefined properties.
     * Sets the text, position, font, color, and alignment of the label.
     */
    public Score_label(){
        this.setText("Placeholder");
        this.setBounds(275,163,250,125);
        this.setFont(new Font("Arial", Font.BOLD, 37));
        this.setFocusable(false);
        this.setHorizontalAlignment(SwingConstants.CENTER); // Center horizontally
        this.setVerticalAlignment(SwingConstants.CENTER);   // Center vertically
        this.setOpaque(false);
        this.setForeground(Color.BLACK); 
        
    }

}