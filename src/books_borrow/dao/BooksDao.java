package books_borrow.dao;

import books_borrow.entity.Book;

public interface BooksDao {
    boolean addBooks(Book book);
    String delBooks(String sid);

    Book[] findAllBooks();
    boolean borrowBooks(String sid,int num);
    boolean lendBooks(String sid,int num);

}