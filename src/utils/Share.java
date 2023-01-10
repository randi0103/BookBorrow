package utils;

import books_borrow.entity.Book;
import login.entity.Student;

public class Share {
    static String index = "";
    static Book[] books = new Book[10];
    static Student student1 =  new Student("001","001","001");
    static Student[] students = new Student[100];

    public static String getIndex() {
        return index;
    }

    public static void setIndex(String index) {
        Share.index = index;
    }

    public static Student[] getStudents() {
        return students;
    }

    public static void setStudents(Student[] students) {
        Share.students = students;
    }

    public static Book[] getBooks() {
        return books;
    }

    public static void setBooks(Book[] books) {
        Share.books = books;
    }


    public static void init(){
        students[0] = student1;
    }
}
