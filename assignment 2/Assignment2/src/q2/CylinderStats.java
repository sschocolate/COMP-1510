package q2;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * <p>Reads radius and height of a cylinder and prints its surface
 * area and volume.</p>
 *
 * @author Vincent Huang
 * @version 1.0
 */
public class CylinderStats {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // Declaring variables
        int radius;
        int height;
        double surface;
        double volume;
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.####");
        
        // Ask for input of radius and height
        System.out.println("Lets create a cylinder.");
        System.out.println();
        System.out.println("Please enter a radius: ");
        radius = scan.nextInt();
        System.out.println("Please enter the height: ");
        height = scan.nextInt();
        scan.close();
        
        // Calculations
        surface = (2 * Math.PI * radius) * (radius + height);
        volume = Math.PI * Math.pow(radius, 2) * height;
        
        // Print output
        System.out.println("The surface area of the cylinder is: "
                + fmt.format(surface));
        System.out.println("The volume of the cylinder is: "
                + fmt.format(volume));
    }

};
