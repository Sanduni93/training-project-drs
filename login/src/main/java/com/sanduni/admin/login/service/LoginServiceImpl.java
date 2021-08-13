package com.sanduni.admin.login.service;

import com.sanduni.admin.login.model.User;
import com.sanduni.admin.login.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginRepository loginRepository;

    public User save(User user) {
        return loginRepository.save(user);
    }

    public User fetchByEmailId(String email){
      return loginRepository.findByEmail(email);
    }

    public User fetchByUsernameAndPassword(String username, String password) {
        return loginRepository.findByUsernameAndPassword(username, password);
    }
}
