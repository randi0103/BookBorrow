package manage.service;

import login.entity.Student;

public interface ManegeService {
    Student findStudent(String sid);
    String delStudent(String sid);
    String updateStudent(String password, String sid);
    Student[] findAllStudent();

}
