package view;

import books_borrow.controller.BooksController;
import login.controller.LoginController;
import manage.controller.ManageController;

import java.util.Scanner;

public class View2 {
    public void View2(){
        Scanner sc = new Scanner(System.in);
        LoginController lc = new LoginController();
        ManageController mc = new ManageController();
        BooksController bc = new BooksController();
        View1 v1 = new View1();
        boolean flag = true;
        while (flag){
            System.out.println("--------欢迎来到管理者模式--------");
            System.out.println("请输入您的选择: 1.添加借阅者  2.删除借阅者   3.查找借阅者     4.查找所有借阅者   5.添购书籍   6.下架书籍   7.查看书库   8.修改密码   9.退出登录     10.退出系统");
            String choice = sc.next();
            switch (choice){
                case "1":
                    System.out.println("添加借阅者");
                    lc.addStudent();
                    break;
                case "2":
                    System.out.println("删除借阅者");
                    mc.delStudent();
                    break;
                case "3":
                    System.out.println("查找借阅者");
                    mc.catStudent();
                    break;
                case "4":
                    System.out.println("查找所有借阅者");
                    mc.findAllStudent();
                    break;
                case "5":
                    System.out.println("添购书籍");
                    bc.addBooks();
                    break;
                case "6":
                    System.out.println("下架书籍");
                    bc.delBooks();
                    break;
                case "7":
                    System.out.println("查看书库");
                    bc.findAllBooks();
                    break;
                case "8":
                    System.out.println("修改密码");
                    mc.updateStudent();
                    break;
                case "9":
                    System.out.println("退出登录");
                    flag = false;
//                  用于退出整个程序
                    v1.view1();
                    break;
                case "10":
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
