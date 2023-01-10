package books_borrow.service;


import books_borrow.entity.Book;
import login.entity.Student;


public interface BooksService {
    String delBooks(String sid);
    boolean addBooks(Book book);
    Book[] findAllBooks();

    boolean borrowBooks(String sid,int num);
    boolean lendBooks(String sid,int num);
}
