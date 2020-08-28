package nendrasys.service;

import nendrasys.dao.StudentDaoImpl;
import nendrasys.model.Student;


import java.util.List;

public class StudentServiceImpl implements StudentService

{

    StudentDaoImpl studentDao;

    public StudentDaoImpl getStudentDao()
    {
        return studentDao;
    }

    public void setStudentDao(StudentDaoImpl studentDao) {

        this.studentDao = studentDao;
    }

   public  List<Student> getsStudentDetails()
    {

        return studentDao.getStudentDetails();
    }

}
