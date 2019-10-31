package datatest.Controller;

import datatest.Dao.UserDao;
import datatest.Entity.User;
import datatest.Factory.RoleFactory;
import datatest.Game.AttackWay;
import datatest.Game.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        if (this.user != null){
        model.addAttribute("msg", this.user.getCharacterName());
        model.addAttribute("red",this.user.getRole().getRed());
        model.addAttribute("blue",this.user.getRole().getBlue());
        return "play"; }
        else return "index";
    }

    @ResponseBody
    @PostMapping("/user")   //注册
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
                Role role = RoleFactory.getRoleByName(a.getCharacterName());
                this.user.setRole(role);
                map.put("status", "ok");
                map.put("username", this.user.getName());
                return map;
            }
        }
        map.put("status", "error");
        return map;
    }

    @ResponseBody
    @GetMapping("/attack/{attackway}")
    public String attack(@PathVariable("attackway") String name){
        AttackWay attackWay = RoleFactory.getAttackWayByName(name);
        if(attackWay != null){
            this.user.setAttackWay(attackWay);
            this.user.attack();
            return "ok";
        }
        return "error";
    }

}
