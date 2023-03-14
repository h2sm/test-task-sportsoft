package com.h2sm.testtasksportsoft.dto;

import lombok.Builder;
import lombok.Data;

import java.awt.image.BufferedImage;

@Builder
@Data
public class Author {
    private long authorId;
    private String authorFullName;
    private String authorDescription;
    private String pathToPicture;
    private BufferedImage image;
}
