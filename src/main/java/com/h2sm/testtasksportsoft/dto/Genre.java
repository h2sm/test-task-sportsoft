package com.h2sm.testtasksportsoft.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Genre {
    private long genreId;
    private String genre;
}
