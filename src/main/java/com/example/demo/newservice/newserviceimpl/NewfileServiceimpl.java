package com.example.demo.newserviceimpl;

import com.example.demo.*;
@Service

public class NewfileServericeimple implements NewfileService{
    private final NewfileRepo rip;
    public NewfileServericeimple(NewfileRepo rip){
        this rip=rip;
    }
    @Override
    public NewfileEntity savedate(NewfileEntity newfile){
        return rip.save(newfile);
    }
    @Override
    public NewfileEntity getidval(Long id){
        return rip.findById(id);
    }
    @Override
    public List<NewfileEntity>getall(){
        return rip.findAll();
    }
    @Override
    public NewfileEntity update(Long id,NewfileEntity newfile){
        return 
    }
    @Override
    public NewfileEntity delete(long id){
        rip.delete(id);
    }
}