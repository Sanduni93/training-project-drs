package com.sanduni.admin.login.service;

import com.sanduni.admin.login.model.User;

public interface LoginService {

    User save(User user);
    User fetchByEmailId(String email);
    User fetchByUsernameAndPassword(String username, String password);

}
