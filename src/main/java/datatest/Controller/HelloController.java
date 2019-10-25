package datatest.Controller;


import datatest.Bean.Department;
import datatest.Bean.Employee;
import datatest.Dao.UserDao;
import datatest.Entity.User;
import datatest.mapper.DepartmentMapper;
import datatest.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    UserDao userDao;

    @GetMapping("/get/{id}")
    public Department hello(@PathVariable("id") Integer id) {
        return departmentMapper.getDepById(id);
    }

    @GetMapping("/")
    public String Hello() {
        return "Start";
    }

    @GetMapping("/get2/{id}")
    public Employee hello2(@PathVariable("id") Integer id) {
        return employeeMapper.getEmployee(id);
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return userDao.findById(id).get();
    }

    @GetMapping("/user")
    public User insertUser(User user) {
        userDao.save(user);
        return user;
    }

}
