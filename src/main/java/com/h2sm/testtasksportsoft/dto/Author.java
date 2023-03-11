package com.h2sm.testtasksportsoft.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Author {
    private long authorId;
    private String authorFullName;
    private String authorDescription;
}
