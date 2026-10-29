package org.howard.edu.lsp.midterm.crccards;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Maintains books by ISBN and enforces a library-wide borrowing limit.
 * Borrowing and returning library books must occur through this class.
 *
 * @author Ngoc-Mai Huynh
 */
public class Library {
    private static final int BORROW_LIMIT = 3;
    private final Map<String, Book> books = new TreeMap<>();

    /** Creates an empty library. */
    public Library() {
    }

    /**
     * Adds a book without replacing an existing ISBN.
     * @param book the book to add
     * @throws IllegalArgumentException if the ISBN is already present
     */
    public void addBook(Book book) {
        if (books.containsKey(book.getIsbn())) {
            throw new IllegalArgumentException("ISBN already exists.");
        }
        books.put(book.getIsbn(), book);
    }

    /**
     * Finds the stored book with the given ISBN.
     * @param isbn the ISBN to find
     * @return the stored book, or null if it is not found
     */
    public Book findBook(String isbn) {
        return books.get(isbn);
    }

    /**
     * Borrows a book if it is available and the limit allows it.
     * @param isbn the ISBN to borrow
     * @throws IllegalArgumentException if the ISBN is not present
     * @throws IllegalStateException if already borrowed or the limit is reached
     */
    public void borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book == null) {
            throw new IllegalArgumentException("ISBN not found.");
        }
        if (getBorrowedBookCount() >= BORROW_LIMIT) {
            throw new IllegalStateException("Borrowing limit reached.");
        }
        book.borrowBook();
    }

    /**
     * Returns a borrowed book to the library.
     * @param isbn the ISBN to return
     * @throws IllegalArgumentException if the ISBN is not present
     * @throws IllegalStateException if the book is already available
     */
    public void returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book == null) {
            throw new IllegalArgumentException("ISBN not found.");
        }
        book.returnBook();
    }

    /**
     * Collects the available books.
     * @return a new list of available books, or an empty list
     */
    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    /**
     * Finds all books with an exactly matching author name.
     * @param author the case-sensitive author name
     * @return a new list of matching books, including borrowed books
     */
    public List<Book> getBooksByAuthor(String author) {
        List<Book> matchingBooks = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getAuthor().equals(author)) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }

    /**
     * Retrieves all books in ascending lexicographical ISBN order.
     * @return a new sorted list, or an empty list if no books are stored
     */
    public List<Book> getBooksSortedByIsbn() {
        return new ArrayList<>(books.values());
    }

    /**
     * Counts books that are currently borrowed.
     * @return the number of unavailable books in the library
     */
    public int getBorrowedBookCount() {
        int count = 0;
        for (Book book : books.values()) {
            if (!book.isAvailable()) {
                count++;
            }
        }
        return count;
    }
}
