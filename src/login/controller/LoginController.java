package login.controller;

import login.entity.Student;
import login.service.LoginService;
import login.service.LoginServiceImpl;
import manage.controller.ManageController;
import utils.Share;
import utils.Utils;
import view.View1;
import view.View2;
import view.View3;

import java.util.Scanner;

public class LoginController {
    LoginService logs = new LoginServiceImpl();
    static Student[] students = new Student[10];


    Utils ut = new Utils();
    private Scanner sc = new Scanner(System.in);
    View2 v2 = new View2();
    View3 v3 = new View3();
    View1 v1 = new View1();

    public void login() {
        Share.init();
        String account;
        String password;
        System.out.println("请输入学生的账户");
        account = sc.next();
        System.out.println("请输入学生的密码");
        password = sc.next();
        String limit = logs.login(account, password);
        if (limit.equals("1")) {
            v2.View2();
        } else if (limit.equals("2")) {
            Share.setIndex(account);
            v3.View3();
        } else {
            System.out.printf("账号或者密码错误,请重新登录\n");
            v1.view1();
        }

    }

    public void addStudent() {
        Share.init();
        String sid;
        while (true) {
            System.out.println("请输入学生的账户");
            sid = sc.next();
            boolean is_have = ut.isExists(sid);
            if (!is_have) {
                System.out.println("您输入的账户已经被占用，请重新输入！");
            } else {
                break;
            }

        }

        System.out.println("请输入学生的密码");
        String password = sc.next();

        System.out.println("请输入学生的姓名");
        String name = sc.next();


        Student student = new Student(sid, password, name);


        boolean is_success = logs.addStudent(student);

        if (is_success) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }


    }

}