package by.jrr.stream4demo.interfaces;

import by.jrr.stream4demo.bean.Entity;
import by.jrr.stream4demo.bean.User;

public interface EntityServiceInterface<T extends Entity> {

    public boolean isUserUnder18(T user);
}
