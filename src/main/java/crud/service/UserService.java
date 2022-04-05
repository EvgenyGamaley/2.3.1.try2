package crud.service;

import crud.entity.User;

import java.util.List;

public interface UserService {

    void create(User user);

    void delete(Long id);

    void update(User user);

    User findById(Long id);

    List<User> findAll();

}