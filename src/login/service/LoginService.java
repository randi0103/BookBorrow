package login.service;

import login.entity.Student;

public interface LoginService {

    boolean addStudent(Student student);
    String login(String account, String password);
}
