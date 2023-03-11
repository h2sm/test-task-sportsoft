package com.h2sm.testtasksportsoft.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserEntity {
    private long userId;
    private String userFullName;
    private String login;
    private String password;
}
