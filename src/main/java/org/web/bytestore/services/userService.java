package org.web.bytestore.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.bytestore.models.user;
import org.web.bytestore.repositories.userRepository;

import java.util.Optional;

@Service
public class userService {

    @Autowired
    private userRepository userRepository;

    public user findById(Long id) {
     Optional<user> user =  userRepository.findById(id);
     return user.orElseThrow(() -> new RuntimeException("user not found"));
    }

    @Transactional
    public user create(user user) {
        user.setId(null);
        user =  userRepository.save(user);
        return user;
    }

    @Transactional
    public user update(user user) {
        user newUser = findById(user.getId());
        newUser.setSenha(user.getSenha());
        newUser.setNome(user.getNome());
        newUser.setEmail(user.getEmail());
        return userRepository.save(newUser);
    }

    public void deleteById(Long id) {
        findById(id);

        try {
            userRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("user could not be deleted");
        }
    }
}
