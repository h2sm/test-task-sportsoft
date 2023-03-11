package com.h2sm.testtasksportsoft.mapper;

public interface Mapper<E, D> {
    D entityToDTO(E entity);
    E DTOtoEntity(D dto);
}
