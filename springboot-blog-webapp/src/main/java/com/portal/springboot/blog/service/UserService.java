package com.portal.springboot.blog.service;

import com.portal.springboot.blog.dto.RegistrationDto;
import com.portal.springboot.blog.entity.User;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    User findByEmail(String email);
}
