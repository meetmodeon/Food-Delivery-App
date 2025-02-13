package com.meet.service;

import com.meet.config.JwtProvider;
import com.meet.model.User;
import com.meet.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService{
    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;

    @Override
    public User findUserByJwtToken(String jwt) throws Exception {
        String jwtToken = jwt.substring(7);;
       String username = jwtProvider.extractUsername(jwtToken);
       User user = findUserByEmail(username);
       return user;
    }

    @Override
    public User findUserByEmail(String email) throws Exception {
        Optional<User> user = userRepository.findByEmail(email);

        if(user.isEmpty()){
            throw new Exception("user not found");
        }
        return user.get();
    }
}
