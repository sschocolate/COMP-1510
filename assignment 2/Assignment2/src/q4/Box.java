package q4;

/**
 * <p> This constructor creates a box with a width, height,
 * and depth.</p>
 * 
 * @author Vincent Huang
 * @version 1.0
 */
public class Box {
    /**
     * <p> x-axis of the box.</p>
     */
    private int x;
    /**
     * <p> y-axis of the box.</p>
     */
    private int y;
    /**
     * <p> z-axis of the box.</p>
     */
    private int z;
    /**
     * <p> represents whether the box is full or not.</p>
     */
    private boolean full;
    
    /**
     * <p> Constructor for a box with width, height, and depth.</p>
     * @param height x axis of box
     * @param width y axis of box
     * @param depth z axis of box
     */
    public Box(int width, int height, int depth) {
        x = width;
        y = height;
        z = depth;
        full = false;
    }
    
    /**
     * <p> Return width of the box.</p>
     * @return x
     */
    public int getWidth() {
        return x;
    }
    
    /**
     * <p> Return height of the box.</p>
     * @return y
     */
    public int getHeight() {
        return y;
    }
    
    /**
     * <p> Return depth of the box.</p>
     * @return z
     */
    public int getDepth() {
        return z;
    }
    
    /**
     * <p> Set width of the box.</p>
     * @param setWidth of box
     */
    public void setWidth(int setWidth) {
        x = setWidth;
    }
    
    /**
     * <p> Set height of the box.</p>
     * @param setHeight of box
     */
    public void setHeight(int setHeight) {
        y = setHeight;
    }
    
    /**
     * <p> Set depth of the box.</p>
     * @param setDepth of box
     */
    public void setDepth(int setDepth) {
        z = setDepth;
    }
    /**
     * <p> Fills the box.</p>
     */
    public void fill() {
        full = true;
    }
    /**
     * <p>Returns a one-line description of the box.</p>
     * @return Description of the box
     */
    public String toString() {
        return "Dimensions of the box: " + x + "x" + y 
                + "x" + z + "   The box is full: " + full;
    }
    
}
