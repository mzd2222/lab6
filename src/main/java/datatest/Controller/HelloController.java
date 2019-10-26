package datatest.Controller;

import datatest.Dao.UserDao;
import datatest.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    UserDao userDao;

    @GetMapping("/")
    public String Hello() {
        return "play";
    }

    @ResponseBody
    @GetMapping("/user")
    public User insertUser(User user) {
        userDao.save(user);
        return user;
    }

}
