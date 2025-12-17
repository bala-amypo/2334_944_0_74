package com.example.demo.newservice;

public interface NewfileService{
    NewfileEntity savedate(NewfileEntity newfile);
    NewfileEntity getidval(long id);
    List<NewfileEntity>getall();
    NewfileEntity update(Long id,NewfileEntity newfile);
    void delete(Long id);
}