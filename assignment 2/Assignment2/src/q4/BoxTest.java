package q4;

/**
 * <p>This class creates two box objects that each have three
 * values, height, width, and depth. It uses the Box class.</p>
 *
 * @author Vincent Huang
 * @version 1.0
 */
public class BoxTest {
    
    /**
     * Set box two's width.
     */
    static final int CHANGEX = 5;
    /**
     * Set box two's height.
     */
    static final int CHANGEY = 8;
    /**
     * Set box two's depth.
     */
    static final int CHANGEZ = 12;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // Create boxes
        Box one = new Box(2, 2, 2);
        Box two = new Box(2, 2, 2);
        
        // Print output using methods
        System.out.println("The width of box one is: " 
                + one.getWidth());
        System.out.println("The height of box one is: " 
                + one.getHeight());
        System.out.println("The depth of box one is: " 
                + one.getDepth());
        System.out.println(one.toString());
        
        System.out.println();
        System.out.println("Box two before changes:");
        System.out.println("The width of box two is: " 
                + two.getWidth());
        System.out.println("The height of box two is: " 
                + two.getHeight());
        System.out.println("The depth of box two is: " 
                + two.getDepth());
        System.out.println(two.toString());
        
        // Changing box two.
        two.setWidth(CHANGEX);
        two.setHeight(CHANGEY);
        two.setDepth(CHANGEZ);
        two.fill();
        
        System.out.println();
        System.out.println("Box two after changes:");
        System.out.println("The width of box two is: " 
                + two.getWidth());
        System.out.println("The height of box two is: " 
                + two.getHeight());
        System.out.println("The depth of box two is: " 
                + two.getDepth());
        System.out.println(two.toString());
    }
}
