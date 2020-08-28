package nendrasys.controller;


import nendrasys.model.Student;
import nendrasys.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;



  /*  public String getStudentList(Map<String, List<Student>> map)
    {
// here ur getting the data and storing in the data in str
    List<Student> str = studentService.getsStudentDetails();
    // here ur mapping with the "data" in the data the total str data will be  there
        // becoze it is key for that key str data is displaying
    map.put("data",str);
    return"display";
}
*/
  @RequestMapping(value = "/student", method = RequestMethod.GET)
  public String getStudentList(Model model){
      List<Student> str=studentService.getsStudentDetails();
      model.addAttribute("data",str);
      return "display";
    }

}
