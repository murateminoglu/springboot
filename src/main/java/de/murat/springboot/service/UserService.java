package de.murat.springboot.service;

import de.murat.springboot.entity.User;
import de.murat.springboot.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public List<User> getUsers() {
        return null;
    }
}
