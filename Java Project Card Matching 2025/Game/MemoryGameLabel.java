/**
 * MemoryGameLabel represents the game logic for the memory matching game. 
 * It manages the creation and display of the game's grid of buttons, each representing a card.
 * The player needs to match pairs of cards based on their images. 
 */ 

package Game;
import javax.swing.*;

import Frames.Set_Visible;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MemoryGameLabel implements ActionListener {
    private static int buttons_pressed = 0;
    private int tries = 0;
    private int solved_matches = 0;
    //private Bank bank = Run_game.getbank();

    private JLabel gameLabel; // Label containing the grid of buttons
    private JButton[] buttons = new JButton[10]; // Array to store the 10 buttons

    // Card front image
    private ImageIcon card = new ImageIcon(
            new ImageIcon("Images/card.png")
                    .getImage()
                    .getScaledInstance(138, 180, Image.SCALE_SMOOTH));

    JPanel glassPane = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(new Color(0, 0, 0, 0)); // transparent black overlay
            g.fillRect(0, 0, getWidth(), getHeight());
        }
    };

    // Import imageicons of everyone

    private ImageIcon black1 = new ImageIcon(
            new ImageIcon("Images/black1.JPG")
                    .getImage()
                    .getScaledInstance(138, 180, Image.SCALE_SMOOTH));

    private ImageIcon black2 = new ImageIcon(
            new ImageIcon("Images/black2.JPG")
                    .getImage()
                    .getScaledInstance(138, 180, Image.SCALE_SMOOTH));

    private ImageIcon blue2 = new ImageIcon(
            new ImageIcon("Images/blue2.JPG")
                    .getImage()
                    .getScaledInstance(138, 180, Image.SCALE_SMOOTH));

    private ImageIcon blue1 = new ImageIcon(
            new ImageIcon("Images/blue1.JPG")
                    .getImage()
                    .getScaledInstance(138, 180, Image.SCALE_SMOOTH));

    private ImageIcon green1 = new ImageIcon(
            new ImageIcon("Images/green1.JPG")
                    .getImage()
                    .getScaledInstance(138, 180, Image.SCALE_SMOOTH));

    private ImageIcon green2 = new ImageIcon(
            new ImageIcon("Images/green2.JPG")
                    .getImage()
                    .getScaledInstance(138, 180, Image.SCALE_SMOOTH));

    private ImageIcon pink1 = new ImageIcon(
            new ImageIcon("Images/pink1.JPG")
                    .getImage()
                    .getScaledInstance(138, 180, Image.SCALE_SMOOTH));

    private ImageIcon pink2 = new ImageIcon(
            new ImageIcon("Images/pink2.JPG")
                    .getImage()
                    .getScaledInstance(138, 180, Image.SCALE_SMOOTH));

    private ImageIcon red1 = new ImageIcon(
            new ImageIcon("Images/red1.JPG")
                    .getImage()
                    .getScaledInstance(138, 180, Image.SCALE_SMOOTH));

    private ImageIcon red2 = new ImageIcon(
            new ImageIcon("Images/red2.JPG")
                    .getImage()
                    .getScaledInstance(138, 180, Image.SCALE_SMOOTH));

    ImageIcon[] icons = { black1, black2, blue1, blue2, green1, green2, pink1, pink2, red1, red2 };
    int[] values = { 1, -1, 2, -2, 3, -3, 4, -4, 5, -5 };

    // List<ImageIcon> icons2 = Arrays.asList(icons);

    private Frame frame;

    public MemoryGameLabel(Frame frame) {
        this.frame = frame;

        glassPane.setOpaque(false);
        frame.setGlassPane(glassPane);
        glassPane.addMouseListener(new java.awt.event.MouseAdapter() {
        }); // Consumes mouse input.

        // Create the label
        gameLabel = new JLabel();
        gameLabel.setLayout(new GridLayout(2, 5, 10, 10)); // 2 rows, 5 columns, gaps between buttons
        gameLabel.setBackground(new Color(0x3d397b)); // Set the background color
        gameLabel.setOpaque(true); // Ensure the background color is visible

        // Initialize and add buttons to the label
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setIcon(card); // Set the card image as the button icon
            buttons[i].setPreferredSize(new Dimension(138, 180)); // Set button size
            buttons[i].setFocusable(false); // Disable button focus
            buttons[i].setBackground(new Color(0x3d397b));
            buttons[i].setBorderPainted(false);

            gameLabel.add(buttons[i]); // Add button to the label
        }
        //randomize();// Randomize cards

      
    }

    public void randomize() {

        Random rand = new Random();

        for (int i = 0; i < icons.length; i++) {
            int randomIndexToSwap = rand.nextInt(icons.length);

            ImageIcon temp = icons[randomIndexToSwap];
            int temp2 = values[randomIndexToSwap];

            icons[randomIndexToSwap] = icons[i];
            values[randomIndexToSwap] = values[i];
            icons[i] = temp;
            values[i] = temp2;
        }

    }
    public void reset_cards(){
        for(int a = 0; a < buttons.length; a++){
            buttons[a].setIcon(card);
            buttons[a].addActionListener(this); 
        }
    }

    public void start_game(){
        reset_cards();
        randomize();
        reset_tries();
        frame.setPaneGAME();
        solved_matches = 0;
    }

    // Method to get the JLabel
    public JLabel getGameLabel() {
        return gameLabel;
    }

    public int return_tries(){
        return this.tries;
    }

    public void reset_tries(){
        this.tries = 0;
    }


    private static int[][] compare = new int[2][2];

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button clicks
        for (int i = 0; i < buttons.length; i++) {
            if (e.getSource() == buttons[i]) {
                buttons[i].setIcon(icons[i]);
                buttons[i].removeActionListener(this);

                //System.out.println("Button " + (i + 1) + " clicked!");

                //System.out.println(buttons_pressed);

                switch (buttons_pressed) {
                    case 0:
                        //System.out.println("Case 0");
                        compare[0][0] = values[i];
                        compare[0][1] = i;
                        buttons_pressed++;
                        break;
                    case 1:
                       // System.out.println("Case 1");
                        compare[1][0] = values[i];
                        compare[1][1] = i;
                        glassPane.setVisible(true); // disables buttons and UI
                        tries++; //Increase the number of tries 

                        Timer timer = new Timer(600, d -> { // Stalls program for .9 Seconds
                        
                            glassPane.setVisible(false);// Enables button and UI

                            if (compare[0][0] == -compare[1][0]) { // If the pictures match

                                solved_matches++;
                                //System.out.println(solved_matches);
                                // buttons[compare[0][1]].removeActionListener(this);// Disable
                                // buttons[compare[1][1]].removeActionListener(this);
                                System.out.println("disable");
                                buttons_pressed = 0;
                                
                                if(solved_matches == 5){
                                    //System.out.println(bank.getBank());
                                    int score = Bank.getScore(tries,solved_matches);
                                    String text = String.valueOf(score);
                                    Bank.add_to_bank(score);// add score to bank

                                    frame.set_score(text);
                                    frame.setPaneMenu();
                                    Set_Visible.Menu(false);
                                    Run_game.show_score();      
                                }

                            } else {
                                buttons[compare[0][1]].setIcon(card); // Revert
                                buttons[compare[1][1]].setIcon(card);

                                buttons[compare[0][1]].addActionListener(this);
                                buttons[compare[1][1]].addActionListener(this);

                                buttons_pressed = 0;

                            }
                        });
                        timer.setRepeats(false); // Timer will not repeat
                        timer.start();
                        break;

                }

            }
        }
      

    }

}
