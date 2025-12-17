package com.example.demo.entity;    
import java.time.Localdate;

public class StudentEntity{
    public StudentEntity(int id,String name,Localdate date,float cgpa){
        this.id = id;
        this.name = name;
        this.date = date;
        this.cgpa = cgpa;
    }
    public StudentEntity(){
    }
    private int id;
    private String name;
    private Localdate date;
    private float cgpa;
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDate(Localdate date){
        this.date=date;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Localdate getDate(){
        return date;
    }
    public float getCgpa(){
        return cgpa;
    }
}