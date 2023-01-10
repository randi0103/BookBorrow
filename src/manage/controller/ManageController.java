package manage.controller;

import login.entity.Student;
import manage.service.ManageServieImpl;
import manage.service.ManegeService;
import utils.Utils;

import java.util.Scanner;

public class ManageController {
    ManegeService ms = new ManageServieImpl();
    Utils ut = new Utils();
    Scanner sc = new Scanner(System.in);
    public void findAllStudent() {
        Student[] all_student= ms.findAllStudent();
        if(all_student==null){
            System.out.println("目前没有学生信息请先进行添加！");
        }else {
            System.out.println("账号\t密码\t姓名\t书本数量\t");
            for (int i = 1; i < all_student.length; i++) {
                Student stu = all_student[i];
                if(stu!=null) {

                    System.out.println(stu.getAccount() + "\t" + stu.getPassword() + "\t" + stu.getName() + "\t" + stu.getBooks_number()+"\t");
                }


            }
        }
    }

    public void updateStudent() {

        String sid=ut.inputStudentid();
        if(!sid.equals("")) {

            System.out.println("请输入学生的密码");
            String password = sc.next();

            String up_message= ms.updateStudent(password,sid);
            System.out.println(up_message+"学生的信息已经更新！");}




    }

    // 删除学生信息
    public void delStudent() {

        String sid=ut.inputStudentid();
        if(!sid.equals("")) {
            String del_is=ms.delStudent(sid);
            System.out.println(del_is+"学生的信息已经删除！");}
    }

    // 通过id查看学生信息
    public void catStudent() {
        String sid=ut.inputStudentid();
        if(!sid.equals("")) {

            System.out.println("账号\t密码\t姓名\t书本数量\t");
            Student stu = ms.findStudent(sid);
            System.out.println(stu.getAccount() + "\t" + stu.getPassword() + "\t" + stu.getName() + "\t" + stu.getBooks_number());
        }

    }
}
