package com.sanduni.admin.login.repository;

import com.sanduni.admin.login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<User,Integer> {

    User findByEmail(String emailId);
    User findByUsernameAndPassword (String username, String password);


}
