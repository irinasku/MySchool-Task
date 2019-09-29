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
public class Journal {
    
    private Long id;
    private PersonStudent personStudent;
    private PersonTeacher personTeacher;
    private Subject subject;
    private int grade;
    private int day;
    private int month;
    private int year;
    
    public Journal() {
    }
    

    public Journal(Long id, PersonStudent personStudent, PersonTeacher personTeacher, Subject subject, int grade,  int day, int month, int year) {
        this.id = id;
        this.personStudent = personStudent;
        this.personTeacher = personTeacher;
        this.subject = subject;
        this.grade = grade;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
        public PersonStudent getPersonStudent () {
        return personStudent;
    }
    
    public void setPersonStudent (PersonStudent personStudent) {
        this.personStudent = personStudent;
    }
        
    public PersonTeacher getPersonTeacher () {
        return personTeacher;
    }
   
    public void setPersonTeacher (PersonTeacher personTeacher) {
         this.personTeacher = personTeacher;
    }
    
    public Subject getSubject () {
        return subject;
    }
   
    public void setSubject (Subject subject) {
         this.subject = subject;
    }   

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public int getGrade() {
        return grade;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
        public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
            return "Journal{" + "id=" + id 
                + ", personStudent=" + personStudent.getName()
                + " " + personStudent.getLastname()
                + ", personTeacher=" + personTeacher.getName()
                + " " + personTeacher.getLastname()
                + ", subject=" + subject.getTheme()
                + ", grade=" + grade 
                + ", day=" + day 
                + ", month=" + month 
                + ", clock=" + year 
                + '}';


    }


}
