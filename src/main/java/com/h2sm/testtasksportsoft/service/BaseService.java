package com.h2sm.testtasksportsoft.service;

public interface BaseService<b> {
    void create(b object);
    b read(b object);
    b update(b object);
    void delete(b object);
}
