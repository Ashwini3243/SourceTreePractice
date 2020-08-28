package nendrasys.dao;

import nendrasys.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudDao
{
    @Override
    public List<Student> getStudentDetails()
    {
        ArrayList<Student> studentArryList = new ArrayList<Student>();
        Student s1= new Student();
      s1.setId(1);
      s1.setName("saurav");
        s1.setName("saurav");
        s1.setName("saurav");
        s1.setName("saurav");
        s1.setName("saurav");

      s1.setAge(23);
s1.setId(1);


        studentArryList.add(s1);
       return studentArryList;
    }

}
