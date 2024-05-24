// Name: Boris Alemnka
// Course: CEN 3024C - CRN33022 - Software Development 1
//Date: 5/23/2024
//Class Name: Books

package librarybooks;

public class Books {    //  Declaring a book1.java class to format/query books in library system

    int bookId;         // These are variables/fields used to enter and store books in the library system
    String bookTitle;
    String bookAuthor;

    public void setBookId (int bookNum) {    //Setters used for unique id (book number), book title, and author.
        bookId = bookNum;
    }
    public int getBookId(){          // the getters here are for the unique id (book number), book title, and author
        return bookId;
    }
    public void setBookTitle (String bookName) {
        bookTitle = bookName;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookAuthor (String authorName) {
        bookAuthor = authorName;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }

    public void printBookInfo() {     //This is a print method that would allow display of all book info in one view
        System.out.println("Book Information: ");
        System.out.println("Book Id: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author's Name: " + bookAuthor);

    }
}
