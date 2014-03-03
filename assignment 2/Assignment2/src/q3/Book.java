package q3;

/**
 * <p>This class uses a constructor to create a book with
 * title, author, publisher, and copyright date as
 * perameters.</p>
 * @author Vincent Huang
 * @version 1.0
 */
public class Book {
    /**
     * <p>Title of the book.</p>
     */
    private String title;
    /**
     * <p>Author of the book.</p>
     */
    private String author;
    /**
     * <p>Publisher of the book.</p>
     */
    private String publisher;
    /**
     * <p>Copyright date of the book.</p>
     */
    private String copyright;
    
    /**
     * <p>Creates a book object with parameters.</p>
     * @param booktitle title of book
     * @param bookauthor author of book
     * @param bookpublisher publisher of book
     * @param bookcopyright copyright date of book
     */
    public Book(String booktitle, String bookauthor, String bookpublisher,
            String bookcopyright) {
        title = booktitle;
        author = bookauthor;
        publisher = bookpublisher;
        copyright = bookcopyright;
    }
    
    /**
     * <p>No-argument constructor that does nothing.</p>
     */
    public Book() {        
    }
    
    /**
     * <p>Returns the title of the book.</p>
     * @return title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * <p>Returns the author of the book.</p>
     * @return author
     */
    public String getAuthor() {
        return author;
    }
    
    /**
     * <p>Returns the publisher of the book.</p>
     * @return publisher
     */
    public String getPublisher() {
        return publisher;
    }
    
    /**
     * <p>Returns the copyright date of the book.</p>
     * @return copyright
     */
    public String getCopyright() {
        return copyright;
    }
    
    /**
     * <p>Sets the title of the book.</p>
     * @param newTitle of book
     * @return title
     */
    public String setTitle(String newTitle) {
        title = newTitle;
        return title;
    }
    
    /**
     * <p>Sets the author of the book.</p>
     * @param newAuthor of book
     * @return author
     */
    public String setAuthor(String newAuthor) {
        author = newAuthor;
        return author;
    }
    
    /**
     * <p>Sets the publisher of the book.</p>
     * @param newPublisher of book
     * @return publisher
     */
    public String setPublisher(String newPublisher) {
        publisher = newPublisher;
        return publisher;
    }
    
    /**
     * <p>Sets the copyright date of the book.</p>
     * @param newCopyright of book
     * @return copyright
     */
    public String setCopyright(String newCopyright) {
        copyright = newCopyright;
        return copyright;
    }
    /**
     * <p>Returns a nicely formatted description.</p>
     * @return description
     */
    public String toString() {
        System.out.println();
        return "Title: " + title + "\nAuthor: "
                + author + "\nPublisher: " + publisher 
                + "\nCopyright Date: " + copyright;
    }
    
}
