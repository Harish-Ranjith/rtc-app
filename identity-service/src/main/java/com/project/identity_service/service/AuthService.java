package com.project.identity_service.service;

import com.project.identity_service.model.User;
import com.project.identity_service.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;

    // Constructor Injection (Better than @Autowired)
    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
