package com.h2sm.testtasksportsoft.service.impl;

import com.h2sm.testtasksportsoft.dto.User;
import com.h2sm.testtasksportsoft.dto.UserCreate;
import com.h2sm.testtasksportsoft.dto.UserLogin;
import com.h2sm.testtasksportsoft.entity.Users;
import com.h2sm.testtasksportsoft.mapper.impl.UserMapper;
import com.h2sm.testtasksportsoft.repository.UserRepository;
import com.h2sm.testtasksportsoft.service.BaseService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Transactional
public class UserService implements BaseService<User> {
    private UserRepository userRepository;
    private UserMapper userMapper;

    @Override
    public void create(User object) {
        userRepository.save(userMapper.DTOtoEntity(object));
    }

    @Override
    public User read(User object) {
        return userMapper.entityToDTO(userRepository.findById(object.getUserId()).get());
    }

    @Override
    public void update(User object) {
        create(object);
    }

    @Override
    public void delete(User object) {
        userRepository.deleteById(object.getUserId());
    }

    public void createUser(UserCreate userCreate){
        userRepository.save(new Users(userCreate.getLogin(), userCreate.getUserFullName(), userCreate.getPassword()));
    }

    public User doLogin(UserLogin userLogin) throws Exception {
        var userEntity = userRepository.getUserEntityByLoginEquals(userLogin.getLogin());
        if (!userEntity.getPassword().equals(userLogin.getPassword())){
            throw new Exception("Password doesnt match");
        }
        return userMapper.entityToDTO(userEntity);
    }
}
