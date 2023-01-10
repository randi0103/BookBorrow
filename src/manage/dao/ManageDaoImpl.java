package manage.dao;

import login.dao.LoginDaoImpl;
import login.entity.Student;
import utils.Share;
import utils.Utils;

public class ManageDaoImpl implements ManageDao{
    Utils ut = new Utils();
    Student[] stu = Share.getStudents();
    @Override
    public Student[] findAllStudent() {

        return stu;

    }

    @Override
    public String updateStudent(String password, String sid) {

//        调取getstudent 获取学生的索引位置
        int student_index = ut.getStudent_index(sid);
        stu[student_index].setPassword(password);
        String name = stu[student_index].getName();

        return name;
    }

    @Override
    public String delStudent(String sid) {
        String name;
        int student_index = ut.getStudent_index(sid);
        name = stu[student_index].getName();
        stu[student_index]=null;
        return name;
    }

    @Override
    public Student catStudent(String sid) {
//       调用获取学生索引位置
        int student_index = ut.getStudent_index(sid);
//       返回给该学生的对象位置
        return stu[student_index];
    }
}