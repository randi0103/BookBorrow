package login.service;

import login.dao.LoginDao;
import login.dao.LoginDaoImpl;
import login.entity.Student;

public class LoginServiceImpl implements LoginService{
    LoginDao log = new LoginDaoImpl();



    @Override
    public boolean addStudent(Student student) {
        return log.addStudent(student);
    }

    @Override
    public String login(String account, String password) {
        return log.login(account,password);
    }


}
