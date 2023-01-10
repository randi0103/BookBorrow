package utils;

import books_borrow.entity.Book;
import login.entity.Student;

import java.util.Scanner;

public class Utils {
    Student[] stu = Share.getStudents();

    Book[] books = Share.getBooks();
    //  查看学生对应的数组索引位置
    public  int getStudent_index(String id){
//        首先默认他的id不存在
        int index_exists=-1;
        for (int i = 0; i < stu.length; i++) {
            if(stu[i]!=null && stu[i].getAccount().equals(id)){
                index_exists=i;
                break;
            }
        }
        return index_exists;
    }
    //  返回学生的对象
    public Student findStudent(String id) {
//       调用获取学生索引位置
        int student_index = getStudent_index(id);
//       返回给该学生的对象位置
        return stu[student_index];
    }
    public boolean isExists(String id) {
//        调用库管的获取学生索引的方法获取id对应的索引
        int student_index = getStudent_index(id);
//        如果返回来-1 说明目前不存在这个id的学生 我们返回true 反之false
        if (student_index == -1){
            return true;
        }else {
            return false;
        }

    }

    public String inputStudentid(){
        String sid;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的account");
        sid = sc.next();
        boolean is_have = isExists(sid);
        if(is_have){
            System.out.println("您输入的account不存在，请查看后在输入！");
            sid="";
            return sid;
        }else {
            return sid;
        }
    }

    public String inputBookid(){
        String sid;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入书本的account");
        sid = sc.next();
        boolean is_have = isExistsB(sid);
        if(is_have){
            System.out.println("您输入的account不存在，请查看后在输入！");
            sid="";
            return sid;
        }else {
            return sid;
        }
    }

    public  int getBook_index(String id){
//        首先默认他的id不存在
        int index_exists=-1;
        for (int i = 0; i < books.length; i++) {
            if(books[i]!=null && books[i].getId().equals(id)){
                index_exists=i;
                break;
            }
        }
        return index_exists;
    }
    //  返回学生的对象
    public Book findBook(String id) {
//       调用获取学生索引位置
        int book_index = getBook_index(id);
//       返回给该学生的对象位置
        return books[book_index];
    }
    public boolean isExistsB(String id) {
//        调用库管的获取学生索引的方法获取id对应的索引
        int book_index = getBook_index(id);
//        如果返回来-1 说明目前不存在这个id的学生 我们返回true 反之false
        if (book_index == -1){
            return true;
        }else {
            return false;
        }

    }


}
