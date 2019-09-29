/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Irina
 */
public class Subject {
    private Long id;
    private String theme;
    private String teacher;
    private int clock;

    public Subject() {
    }

    public Subject(Long id, String theme, String teacher, int clock) {
        this.id = id;
        this.theme = theme;
        this.teacher = teacher;
        this.clock = clock;
    }
     public void setId(Long id) {
        this.id = id;
    }
     
    public Long getId() {
       return id;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
    
    public String getTheme() {
        return theme;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    
        public String getTeacher() {
        return teacher;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }
    
        public int getClock() {
        return clock;
    }




    @Override
    public String toString() {
        return "Subject{" 
                + "id=" + id 
                + ", theme=" + theme
                + ", teacher=" + teacher
                + ", clock=" + clock 
                + '}';
    }



}   
    
