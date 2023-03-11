package com.h2sm.testtasksportsoft.mapper.impl;

import com.h2sm.testtasksportsoft.dto.User;
import com.h2sm.testtasksportsoft.entity.UserEntity;
import com.h2sm.testtasksportsoft.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<UserEntity, User> {
    @Override
    public User entityToDTO(UserEntity entity) {
        return null;
    }

    @Override
    public UserEntity DTOtoEntity(User dto) {
        return null;
    }
}
