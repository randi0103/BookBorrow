package books_borrow.dao;

import books_borrow.entity.Book;
import login.entity.Student;
import utils.Share;
import utils.Utils;

public class BooksDaoImpl implements BooksDao{
    Utils ut = new Utils();
    Book[] books = Share.getBooks();
    Student[] stu = Share.getStudents();
    public boolean addBooks(Book book) {
//    找到一个数组空的索引 存储数据
        int index_null=-1;

        for (int i = 1; i < books.length; i++) {
            if (books[i]==null){
                index_null=i;
                break;
            }

        }
        if (index_null==-1){
            return false;
        }else {
            books[index_null]=book;
            return true;
        }

    }


    public String delBooks(String sid) {
        String name;
        int book_index = ut.getBook_index(sid);
        name = books[book_index].getName();
        books[book_index]=null;
        return name;
    }

    public Book[] findAllBooks() {

        return books;

    }

    @Override
    public boolean borrowBooks(String sid, int num) {

        int book_index = ut.getBook_index(sid);
        int num_from = books[book_index].getNumber();
        if (num <= num_from) {
            int num_now = num_from - num;
            books[book_index].setNumber(num_now);
            String index_now = Share.getIndex();
            int index = ut.getStudent_index(index_now);
            int books_from = stu[index].getBooks_number();
            int books_now = books_from + num;
            stu[index].setBooks_number(books_now);
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean lendBooks(String sid, int num) {
        String index_now = "";
        index_now = Share.getIndex();
        int index = ut.getStudent_index(index_now);
        int books_from = stu[index].getBooks_number();
        if (num<=books_from){
            int num_now = books_from - num;
            stu[index].setBooks_number(num_now);
            int book_index = ut.getBook_index(sid);
            int num_from = books[book_index].getNumber();
            int book_now = num + num_from;
            books[book_index].setNumber(book_now);
            return true;
        }else {
            return false;
        }
    }

}
