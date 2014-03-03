package q5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>draws a traffic light and uses a push button to change the 
 * state of the light.</p>
 *
 * @author Vincent Huang
 * @version 1.0
 */
public class TrafficLight extends JFrame {   
    /**
     * <p>The x size of the window.
     */
    static final int X_SIZE = 200;
    /**
     * <p>The y size of the window.</p>
     */
    static final int Y_SIZE = 420;
    /**
     * The x size of traffic light.
     */
    static final int X_LIGHT = 150;
    /**
     * The y size of traffic light.
     */
    static final int Y_LIGHT = 340;
    /**
     * Sets size of the lights.
     */
    static final int LIGHT_SIZE = 90;
    /**
     * Sets the x position of the three lights.
     */
    static final int LIGHT_X_POSITION = 30;
    /**
     * Sets red light's y position.
     */
    static final int RED_Y_POSITION = 20;
    /**
     * Sets amber light's y position.
     */
    static final int AMBER_Y_POSITION = 130;
    /**
     * Sets green light's y position.
     */
    static final int GREEN_Y_POSITION = 240;   
    
    /**
     * Required.
     */
    private static final long serialVersionUID = -7732532799395932141L;   
    
    /**
     * <p>The button that changes the traffic light when clicked.</p>
     */
    private JButton button;
    /**
     * Action listener object that changes the light to green.
     */
    private ChangeToGreen toGreen = new ChangeToGreen();
    /**
     * Action listener object that changes the light to amber.
     */
    private ChangeToAmber toAmber = new ChangeToAmber();
    /**
     * Action listener object that changes the light to red.
     */
    private ChangeToRed toRed = new ChangeToRed();
    
    // Sets the starting colors of the traffic light.
    /**
     * Color of the red light.
     */
    private Color redOn = Color.gray;
    /**
     * Color of the amber light.
     */
    private Color amberOn = Color.gray;
    /**
     * Color of the green light.
     */
    private Color greenOn = Color.green;

    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public TrafficLight() {
        super("Vincent Huang");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Change");
        JPanel panel = new JPanel();
        button.addActionListener(toAmber);
        panel.add(new DrawingPanel());
        panel.add(button);
        panel.setBackground(Color.gray);

        getContentPane().add(panel);

        setSize(X_SIZE, Y_SIZE);
        setVisible(true);
        
    }
    
    /**
     * <p>Creates and draws the traffic light and it's colors.</p>
     * @author Vincent Huang
     *
     */
    class DrawingPanel extends JPanel {
        /**
         * Required.
         */
        private static final long serialVersionUID = 1L;
        /**
         * <p>Sets dimensions of inner rectangle and colors it.</p>
         */
        public DrawingPanel() {
            setPreferredSize(new Dimension(X_LIGHT, Y_LIGHT));
            setBackground(Color.black);
        }
        /**
         * <p>Prints the different colors of the traffic light.</p>
         * @param g graphics object
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(redOn);
            g.fillOval(LIGHT_X_POSITION, RED_Y_POSITION, 
                    LIGHT_SIZE, LIGHT_SIZE);
            g.setColor(amberOn);
            g.fillOval(LIGHT_X_POSITION, AMBER_Y_POSITION, 
                    LIGHT_SIZE, LIGHT_SIZE);
            g.setColor(greenOn);
            g.fillOval(LIGHT_X_POSITION, GREEN_Y_POSITION, 
                    LIGHT_SIZE, LIGHT_SIZE);
        }
    }
    
    /**
     * <p>Changes the colors of the traffic light when button
     * is pressed.</p>
     */
    private class ChangeToGreen implements ActionListener {
        /**
         * When the button is pressed this is run.
         * @param event on click
         */
        public void actionPerformed(ActionEvent event) {
            redOn = Color.gray;
            amberOn = Color.gray;
            greenOn = Color.green;
            repaint();
            button.removeActionListener(toGreen);
            button.addActionListener(toAmber);
        }
    }

    /**
     * <p>Changes the colors of the traffic light when button
     * is pressed.</p>
     */
    private class ChangeToAmber implements ActionListener {
        /**
         * When the button is pressed this is run.
         * @param event on click
         */
        public void actionPerformed(ActionEvent event) {
            redOn = Color.gray;
            amberOn = Color.yellow;
            greenOn = Color.gray;
            repaint();
            button.removeActionListener(toAmber);
            button.addActionListener(toRed);
        }
    }
    
    /**
     * <p>Changes the colors of the traffic light when button
     * is pressed.</p>
     */
    private class ChangeToRed implements ActionListener {
        /**
         * When the button is pressed this is run.
         * @param event on click
         */
        public void actionPerformed(ActionEvent event) {
            redOn = Color.red;
            amberOn = Color.gray;
            greenOn = Color.gray;
            repaint();
            button.removeActionListener(toRed);
            button.addActionListener(toGreen);
        }
    }
    
    /**
     * <p>The main method which is called by the JVM.</p>
     * @param args command line arguments
     */
    public static void main(String[] args) {
        new TrafficLight();
    }
    
}
