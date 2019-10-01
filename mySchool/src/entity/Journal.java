
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Journal implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int grade;
    @OneToOne
    private Person student;
    @OneToOne
    private Subject subject;
    @Temporal(TemporalType.TIMESTAMP)
    private Date Date;

    public Journal() {
    }

    public Journal(int grade, Person student, Subject subject, Date Date) {
        this.grade = grade;
        this.student = student;
        this.subject = subject;
        this.Date = Date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Date Date() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "Journal{" 
                + ", grade=" + grade 
                + ", student=" + student.getName() + " " + student.getLastname()
                + ", subject=" + subject 
                + ", Date=" + Date 
                + '}';
    }
    
    
    
}
