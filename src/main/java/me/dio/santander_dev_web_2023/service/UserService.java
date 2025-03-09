package me.dio.santander_dev_web_2023.service;

import me.dio.santander_dev_web_2023.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
