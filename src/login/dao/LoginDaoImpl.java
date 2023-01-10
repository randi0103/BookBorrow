package login.dao;

import login.entity.Student;
import utils.Share;


  public  class LoginDaoImpl implements LoginDao {

    Student[] students = Share.getStudents();

    //    注册
    public boolean addStudent(Student student) {
//    找到一个数组空的索引 存储数据
        int index_null=-1;

        for (int i = 1; i < students.length; i++) {
            if (students[i]==null){
                index_null=i;
                break;
            }

        }
        if (index_null==-1){
            return false;
        }else {
            students[index_null]=student;
            return true;
        }

    }

    public String login(String account, String password){
        for (int i = 0; i < students.length; i++) {
            if(students[i]!=null){
                if (students[i].getAccount().equals(account)){
                    if (students[i].getPassword().equals(password)){
                        if(students[i].getAccount()== "001"){
                            return  "1";
                        }else {
                            return "2";
                        }
                    }
                }
            }

        }
        return "3";
    }

}
