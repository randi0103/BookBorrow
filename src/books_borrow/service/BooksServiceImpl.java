package books_borrow.service;

import books_borrow.dao.BooksDao;
import books_borrow.dao.BooksDaoImpl;
import books_borrow.entity.Book;

public class BooksServiceImpl implements BooksService{
    BooksDao bd = new BooksDaoImpl();

    @Override
    public String delBooks(String sid) {
        return bd.delBooks(sid);
    }

    @Override
    public boolean addBooks(Book book) {
        return bd.addBooks(book);
    }

    @Override
    public Book[] findAllBooks() {
        boolean flag=false;
        Book[] books = bd.findAllBooks();
        for (int i = 0; i < books.length; i++) {
            if(books[i]!=null){
                flag=true;
                break;
            }
        }
        if(flag){
            return books;
        }else {
            return null;
        }
    }

    @Override
    public boolean borrowBooks(String sid, int num) {
        return bd.borrowBooks(sid,num);
    }

    @Override
    public boolean lendBooks(String sid, int num) {
        return bd.lendBooks(sid,num);
    }


}
