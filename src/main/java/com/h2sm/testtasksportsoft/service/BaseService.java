package com.h2sm.testtasksportsoft.service;

public interface BaseService<dto> {
    void create(dto object);
    dto read(dto object);
    void update(dto object);
    void delete(dto object);
}
