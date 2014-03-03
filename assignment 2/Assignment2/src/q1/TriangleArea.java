package q1;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * <p>The class TriangleArea reads the length of the sides of a
 * triangle and calculates the perimeter and area.</p>
 *
 * @author Vincent Huang
 * @version 1.0
 */
public class TriangleArea {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // Declaring variables
        int a;
        int b;
        int c;
        double perimeter;
        double s;
        double area;
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.###");
        
        // Asks for input of lengths and initialize perimeter
        System.out.println("Please input lengths of three sides of a"
                + " triangle(Incluce spaces):");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        scan.close();
        perimeter = a + b + c;
        
        // Calculations and initialize s
        s = perimeter / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        // Print Output
        System.out.println();
        System.out.println("The perimeter of the triangle is: " 
                + fmt.format(perimeter));
        System.out.println("The area of the triangle is: "
                + fmt.format(area));
    }
}
