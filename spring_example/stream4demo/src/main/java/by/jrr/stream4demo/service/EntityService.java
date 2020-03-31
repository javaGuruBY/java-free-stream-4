package by.jrr.stream4demo.service;

import by.jrr.stream4demo.bean.Entity;
import by.jrr.stream4demo.interfaces.EntityServiceInterface;

public class EntityService<T extends Entity> implements EntityServiceInterface<T> {

    @Override
    public boolean isUserUnder18(T user) {
        if (user.getAge() < 18) {
            return true;
        } else {
            return false;
        }
    }
}
