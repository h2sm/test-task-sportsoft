package com.h2sm.testtasksportsoft.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UserCreate {
    private String userFullName;
    private String login;
    private String password;
}
