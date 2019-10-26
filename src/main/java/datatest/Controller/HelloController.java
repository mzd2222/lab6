package datatest.Controller;

import datatest.Dao.UserDao;
import datatest.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    UserDao userDao;

    User user;

    @GetMapping("/play")
    public String Hello(Model model) {
        model.addAttribute("msg", "monk");
        return "play";
    }

    @ResponseBody
    @PostMapping("/user")
    public String insertUser(User user) {
        List<User> all = userDao.findAll();
        for (User a : all) {
            if (a.getName().equals(user.getName())) {
                this.user = a;
                return "error";
            }
        }
        userDao.save(user);
        return "ok";
    }

    @ResponseBody
    @PostMapping("/log")
    public Map log(String username) {
        List<User> all = userDao.findAll();
        Map<String, String> map = new HashMap<>();
        for (User a : all) {
            if (a.getName().equals(username)) {
                this.user = a;
                /* TO DO */
                map.put("status", "ok");
                map.put("username", this.user.getName());
                return map;
            }
        }
        map.put("status", "error");
        return map;
    }

}
