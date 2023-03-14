package com.h2sm.testtasksportsoft.mapper;

import java.io.IOException;

public interface Mapper<E, D> {
    D entityToDTO(E entity) throws IOException;
    E DTOtoEntity(D dto);
}
