package login.dao;

import login.entity.Student;

public interface LoginDao {

    boolean addStudent(Student student);
    String login(String account, String password);

}
