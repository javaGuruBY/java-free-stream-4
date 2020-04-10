package by.jrr.stream4demo.controller;

import by.jrr.stream4demo.bean.User;
import by.jrr.stream4demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String openIndexPage() {
        return "index";
    }

    @GetMapping("/{numberOfUsers}")
    public String openIndexPage(Model model,
                                @PathVariable int numberOfUsers) {
        List<User> userList = userService.produceUsers(numberOfUsers);
        model.addAttribute("userList", userList);
        return "userList";
    }
}
