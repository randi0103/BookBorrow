package manage.dao;

import login.entity.Student;

public interface ManageDao {
    Student[] findAllStudent();
    String updateStudent(String password, String sid);
    String delStudent(String sid);
    Student catStudent(String sid);

}
