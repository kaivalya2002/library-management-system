package Data;
import java.util.Scanner;

class BookData {
    private String title;
    
    private String isbn;
    private boolean isIssued;
    private String studentName;

    public BookData(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
        this.isIssued = false;
        this.studentName = "";
    }

    public String getTitle() {
        return title;
    }

   
    public String getIsbn() {
        return isbn;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String toString() {
        return "Title: " + title + ", ISBN: " + isbn + ", Issued: " + isIssued + ", Student: " + studentName;
    }
}

public class Book2 {
    private BookData[] books;
    private int bookCount;
    private static final int MAX_BOOKS = 100;

    public Book2() {
        this.books = new BookData[MAX_BOOKS];
        this.bookCount = 0;
    }

    public void displayBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < bookCount; i++) {
            if (!books[i].isIssued()) {
                System.out.println(books[i].toString());
            }
        }
    }

    public void issueBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();

        System.out.println("Enter book title:");
        String bookTitle = scanner.nextLine();

        // Check if the book is already issued
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(bookTitle) && books[i].isIssued()) {
                System.out.println("Book is already issued to another student.");
                return;
            }
        }

        // Find the book and mark it as issued
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(bookTitle) && !books[i].isIssued()) {
                books[i].setIssued(true);
                books[i].setStudentName(studentName);
                System.out.println("Book issued successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void returnBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book title:");
        String bookTitle = scanner.nextLine();

        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(bookTitle) && books[i].isIssued()) {
                books[i].setIssued(false);
                books[i].setStudentName("");
                System.out.println("Book returned successfully.");
                return;
            }
        }

        System.out.println("Book not found or not issued.");
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book title:");
        String title = scanner.nextLine();

        System.out.println("Enter book ISBN:");
        String isbn = scanner.nextLine();

        // Check if the book already exists
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)  && books[i].getIsbn().equalsIgnoreCase(isbn)) {
                System.out.println("Book already exists.");
                return;
            }
        }

        BookData newBook = new BookData(title, isbn);
        books[bookCount] = newBook;
        bookCount++;
        System.out.println("Book added successfully.");
    }
}   