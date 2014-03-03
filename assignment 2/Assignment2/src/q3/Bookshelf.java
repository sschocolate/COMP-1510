package q3;

/**
 * <p>This class creates multiple book objects and stores them on
 * the bookshelf using constructors.</p>
 *
 * @author Vincent Huang
 * @version 1.0
 */
public class Bookshelf {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        //Create books
        Book one = new Book("The Hobbit", "J. R. R. Tolkien", 
                "George Allen", "September 21, 1937");
        Book two = new Book("The Outsiders", "S. E. Hinton",
                "Viking Press", "April 24, 1967");
        Book three = new Book();
        three.setTitle("To Kill a Mockingbird");
        three.setAuthor("Harper Lee");
        three.setPublisher("J. B. Lippincott");
        three.setCopyright("July 11, 1960");
        
        // Output
        System.out.println(one.getTitle());
        System.out.println(one.getAuthor());
        System.out.println(one.getPublisher());
        System.out.println(one.getCopyright());

        System.out.println(two.toString());
        System.out.println(three.toString());
    }

}
