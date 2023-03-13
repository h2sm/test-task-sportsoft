package com.h2sm.testtasksportsoft.mapper.impl;

import com.h2sm.testtasksportsoft.dto.User;
import com.h2sm.testtasksportsoft.entity.Users;
import com.h2sm.testtasksportsoft.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<Users, User> {
    @Override
    public User entityToDTO(Users entity) {
        return User.builder()
                .userId(entity.getUserId())
                .userLogin(entity.getLogin())
                .userFullName(entity.getUserFullName())
                .build();
    }

    @Override
    public Users DTOtoEntity(User dto) {
        return Users.builder()
                .userId(dto.getUserId())
                .userFullName(dto.getUserFullName())
                .login(dto.getUserLogin())
                .build();
    }
}
