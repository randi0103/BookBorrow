package view;

import login.controller.LoginController;
import login.service.LoginService;
import login.service.LoginServiceImpl;

import java.util.Scanner;

public class View1 {
    public static void main(String[] args) {
        View1 v1 = new View1();
        v1.view1();
    }
    public void view1(){
        Scanner sc = new Scanner(System.in);
        LoginController lc = new LoginController();
        LoginService logs = new LoginServiceImpl();
        boolean flag = true;
        while (flag){
            System.out.println("--------欢迎来到图书管理管理系统--------");
            System.out.println("请输入您的选择: 1.注册  2.登录  3.退出");
            String choice = sc.next();
            switch (choice){
                case "1":
                    System.out.println("注册");
                    lc.addStudent();
                    break;
                case "2":
                    System.out.println("登录");
                    lc.login();
                    flag = false;
                    break;
                case "3":
                    System.out.println("退出");
//                  用于退出整个程序
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误请重新输入！");
            }

        }
    }

}