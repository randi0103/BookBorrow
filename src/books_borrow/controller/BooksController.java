package books_borrow.controller;

import books_borrow.entity.Book;
import books_borrow.service.BooksService;
import books_borrow.service.BooksServiceImpl;
import utils.Utils;

import java.util.Scanner;

public class BooksController {
    BooksService bs = new BooksServiceImpl();
    Scanner sc = new Scanner(System.in);
    Utils ut = new Utils();
    public void addBooks() {
        String sid;
        while (true){
            System.out.println("请输入书的id");
            sid = sc.next();
            boolean is_have=ut.isExistsB(sid);
            if(!is_have){
                System.out.println("您输入的id已经被占用，请重新输入！");
            }else {
                break;
            }

        }

        System.out.println("请输入书的名称");
        String name = sc.next();

        System.out.println("请输入添加的数量");
        int number = sc.nextInt();


        Book book = new Book(sid,name,number);


        boolean is_success=bs.addBooks(book);

        if(is_success){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }


    }

    public void delBooks() {

        String sid=ut.inputBookid();
        if(!sid.equals("")) {
            String del_is= bs.delBooks(sid);
            System.out.println(del_is+"已经下架！");}
    }

    public void findAllBooks() {
        Book[] all_Books= bs.findAllBooks();
        if(all_Books==null){
            System.out.println("目前没有书请先进行添加！");
        }else {
            System.out.println("id\t名称\t数量\t");
            for (int i = 1; i < all_Books.length; i++) {
                Book book = all_Books[i];
                if(book!=null) {

                    System.out.println(book.getId() + "\t" + book.getName()+ "\t" + book.getNumber());
                }


            }
        }
    }

    public void borrowBooks(){
        String sid=ut.inputBookid();
        System.out.println("请输入要输入借书的数量");
        int num = sc.nextInt();
        if(!sid.equals("")) {
            boolean flag = bs.borrowBooks(sid,num);
            if (flag){
                System.out.println("取出成功");
            }else {
                System.out.println("取出失败");
            }
        }
    }
    public void lendBooks(){
        String sid=ut.inputBookid();
        System.out.println("请输入要输入还书的数量");
        int num = sc.nextInt();
        if(!sid.equals("")) {
            boolean flag = bs.lendBooks(sid,num);
            if (flag){
                System.out.println("还书成功");
            }else {
                System.out.println("还书失败");
            }
        }
    }
}