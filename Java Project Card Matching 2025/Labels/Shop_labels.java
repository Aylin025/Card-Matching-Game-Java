/**
 * The Shop_labels class extends JLabel to create a custom label 
 * that displays the cost of an item with specific font, color, and alignment.
 * The label is initially set to be invisible and shows the text "Cost:0".
 */

package Labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Shop_labels extends JLabel{

    /**
     * Constructor to initialize the shop label with predefined properties.
     * Sets the text, position, font, color, and visibility of the label.
     */
    public Shop_labels(int boundsX , int boundsY, int dimensionX , int dimensiony){
        this.setBounds(boundsX,boundsY,dimensionX,dimensiony);
        this.setText("Cost:0");
        this.setFont(new Font("Arial", Font.BOLD, 15));
        this.setFocusable(false);
        this.setHorizontalAlignment(SwingConstants.CENTER); // Center horizontally
        this.setVerticalAlignment(SwingConstants.CENTER);   // Center vertically
        this.setOpaque(false);
        this.setForeground(Color.WHITE); 
        this.setVisible(false);

    }
}