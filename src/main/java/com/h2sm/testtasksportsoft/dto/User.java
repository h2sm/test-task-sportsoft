package com.h2sm.testtasksportsoft.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    private long userId;
    private String userFullName;
    private String userLogin;
}
