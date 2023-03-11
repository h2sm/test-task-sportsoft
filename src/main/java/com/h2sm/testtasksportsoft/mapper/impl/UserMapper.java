package com.h2sm.testtasksportsoft.mapper.impl;

import com.h2sm.testtasksportsoft.dto.User;
import com.h2sm.testtasksportsoft.entity.UserEntity;
import com.h2sm.testtasksportsoft.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<UserEntity, User> {
    @Override
    public User entityToDTO(UserEntity entity) {
        return User.builder()
                .userId(entity.getUserId())
                .userLogin(entity.getLogin())
                .userFullName(entity.getUserFullName())
                .build();
    }

    @Override
    public UserEntity DTOtoEntity(User dto) {
        return UserEntity.builder()
                .userId(dto.getUserId())
                .userFullName(dto.getUserFullName())
                .login(dto.getUserLogin())
                .build();
    }
}
