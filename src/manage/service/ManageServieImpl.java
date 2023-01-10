package manage.service;

import login.entity.Student;
import manage.dao.ManageDao;
import manage.dao.ManageDaoImpl;

public class ManageServieImpl implements ManegeService{
    ManageDao md = new ManageDaoImpl();
    @Override
    public Student findStudent(String sid) {
        return md.catStudent(sid);
    }

    @Override
    public String delStudent(String sid) {
        return md.delStudent(sid);
    }

    @Override
    public String updateStudent(String password, String sid) {
        return md.updateStudent(password,sid);
    }

    @Override
    public Student[] findAllStudent() {
        boolean flag=false;
        Student[] stu = md.findAllStudent();
        for (int i = 1; i < stu.length; i++) {
            if(stu[i]!=null){
                flag=true;
                break;
            }
        }
        if(flag){
            return stu;
        }else {
            return null;
        }
    }
}
