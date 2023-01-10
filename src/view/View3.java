package view;

import books_borrow.controller.BooksController;
import manage.controller.ManageController;

import java.util.Scanner;

public class View3 {
    public void View3(){
        Scanner sc = new Scanner(System.in);
        ManageController mc = new ManageController();
        BooksController bc = new BooksController();
        View1 v1 = new View1();
        boolean flag = true;
        while (flag){
            System.out.println("--------欢迎来到借阅者模式--------");
            System.out.println("请输入您的选择:  1.借书  2.还书    3.查看书库   4.注销账号   5.退出登录    6.退出系统");
            String choice = sc.next();
            switch (choice){
                case "1":
                    System.out.println("还书");
                    bc.findAllBooks();
                    bc.borrowBooks();
                    break;
                case "2":
                    System.out.println("借书");
                    bc.findAllBooks();
                    bc.lendBooks();
                    break;
                case "3":
                    System.out.println("查看书库");
                    bc.findAllBooks();
                    break;
                case "4":
                    System.out.println("注销账号");
                    mc.delStudent();
                    break;
                case "5":
                    System.out.println("退出登录");
                    flag = false;
//                  用于退出整个程序
                    v1.view1();
                    break;
                case "6":
                    System.out.println("退出系统");
//                  用于退出整个程序
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误请重新输入！");
            }
        }
    }
}
