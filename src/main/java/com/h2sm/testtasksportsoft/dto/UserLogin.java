package com.h2sm.testtasksportsoft.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class UserLogin {
    private String login;
    private String password;
}
