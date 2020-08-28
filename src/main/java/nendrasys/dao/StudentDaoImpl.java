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
      s1.setAge(23);

        Student s2= new Student();
        s2.setId(2);
        s2.setName("saurav kumar");
        s2.setAge(23);
        studentArryList.add(s2);

        Student s3= new Student();
        s3.setId(2);
        s3.setName("Ashwini");
        s3.setAge(23);
        studentArryList.add(s3);
       return studentArryList;
    }

}
