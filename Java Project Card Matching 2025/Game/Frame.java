/*
 * Class Initilized Jframe and tracks keybord inputs inside the Jframe. 
 */


package Game;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import Frames.*;
import javax.swing.*;
import Labels.*;

public class Frame extends JFrame implements KeyListener {
    //Splash Screen 
    private static ImageIcon resizedScreen = new ImageIcon(new ImageIcon("Images/SplashScreen.png").getImage().getScaledInstance(800,450, Image.SCALE_SMOOTH));
    private static JLabel splash_screen = new JLabel();
    private static boolean splash_Visable = true;

 
    //Score menu
    private static ImageIcon scoreScreen = new ImageIcon(new ImageIcon("Images/Score.png").getImage().getScaledInstance(800,450, Image.SCALE_SMOOTH));
    private static JLabel scorelabel = new JLabel();


    //create layered plane 
    private static JLayeredPane layeredPane = new JLayeredPane();

    //Money display label 
    // private static Display_money_label displayMoney = new Display_money_label();

    //Label to display score 
    private static JLabel score = new Score_label();

  


    //Create object of memeory Game 
    MemoryGameLabel game = new MemoryGameLabel(this);
    JLabel memoGame = game.getGameLabel();

    /*
     * Class Constructor used to initalize frame and display.
     */
    Frame() {
        setTitle("Dating Tycoon");
        // Initialize Jframe.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setSize(800, 450);
        
        this.setResizable(false);
        this.setVisible(true);

        //Creating layers 
        this.setContentPane(layeredPane);
        

        //Adding keyListener (Inputs are able to be seen)
        this.addKeyListener(this);

        //Creating Splash Screen to be seen 
        splash_screen.setIcon(resizedScreen);
        splash_screen.setBounds(0, 0, 800, 450); //set bounds to take up entire screen 
        this.add(splash_screen); // Add Splash Screen to Jframe 



        //Creating the Score Label scren  
        scorelabel.setIcon(scoreScreen);
        scorelabel.setBounds(0,0,800,450);
        scorelabel.setVisible(false);
        this.add(scorelabel);
        layeredPane.add(scorelabel,Integer.valueOf(2));


    

        //adding Score label 
        this.add(score);
        layeredPane.add(score,Integer.valueOf(3));
        score.setVisible(false);
        
  

    }


    public MemoryGameLabel get_game(){
        return game;
    }


    public void setPaneGAME(){
        
        this.setContentPane(memoGame);
        this.revalidate();
        this.repaint();
        System.out.println("Attempt to change pane to game");
    }

    public void setPaneMenu(){
        this.setContentPane(layeredPane);
        this.revalidate();
        this.repaint();
        System.out.println("Attempt to change pane to Menu");

    }

    public void show_score(boolean show ){
        scorelabel.setVisible(show);
        score.setVisible(show);
    }



    public void add_layer (JButton button, int a){
        layeredPane.add(button,Integer.valueOf(a));
    }

    public void add_layer (JLabel panel, int a){
        layeredPane.add(panel,Integer.valueOf(a));
    }
    
    public void set_score(String text){
        score.setText(text);
    }
    




    // Methods regarding keyinputs
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) { //If enter is pressed

            if(splash_Visable == true){ 

                splash_screen.setVisible(false);  //nuke splashscreen 

                this.repaint();

                splash_Visable = false; 

                Set_Visible.Menu(true);
            
            }


            System.out.println("Enter key pressed");
        }
    }
    
    //No need to implement
    public void keyReleased(KeyEvent e) {
    
    }

    //No need to implements 
    public void keyTyped(KeyEvent e) {
        //System.out.println("Key typed: " + e.getKeyChar());
    }



}
