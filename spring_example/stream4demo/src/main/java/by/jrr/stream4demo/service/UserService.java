package by.jrr.stream4demo.service;

import by.jrr.stream4demo.bean.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService extends EntityService<User>{

    public List<User> produceUsers(int numberOfUsers) {
        List<User> userList = new ArrayList<>();
        for (int i=0; i<numberOfUsers; i++) {
            userList.add(new User("rendom " + i, i*3));
        }
        return userList;
    }

}
